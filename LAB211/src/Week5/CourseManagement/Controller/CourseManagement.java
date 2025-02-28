package Week5.CourseManagement.Controller;

import Week5.CourseManagement.Model.Course;
import Week5.CourseManagement.Model.CourseLists;
import Week5.CourseManagement.Model.OfflineCourse;
import Week5.CourseManagement.Model.OnlineCourse;

import java.util.Date;
import java.util.Scanner;

public class CourseManagement
{
//    private static ArrayList<Course> courseArrayList = new ArrayList<>();
//
//    public static ArrayList<Course> getCourseArrayList() {
//        return courseArrayList;
//    }
//
//    public static void setCourseArrayList(ArrayList<Course> courseArrayList) {
//        CourseList.courseArrayList = courseArrayList;
//    }
    CourseLists courseArrayList = new CourseLists();

    public static int getMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        boolean validInput = false;
        while (!validInput) {
            try {
                System.out.println("\n*** Course Management ***");
                System.out.println("1. Add online course/ offline course");
                System.out.println("2. Update course");
                System.out.println("3. Delete course");
                System.out.println("4. Print all / online course / offline course");
                System.out.println("5. Search information base on course name");
                System.out.println("6. Exit");
                System.out.print("\nEnter your choice (1-6): ");
                choice = DataInput.inputPositiveInt();
                if (choice >= 1 && choice <= 6) {
                    validInput = true;
                } else {
                    System.out.println("Error: Please enter a number between 1 and 6.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Please enter a valid number.");
            }
        }

        return choice;
    }
    public void addCourse()
    {
        System.out.println("*** Add new course ***");
        System.out.println("Online (O) or Offline (F) ");
        switch(DataInput.inputAddMethod())
        {
            case 0:
                OnlineCourse oCourse = new OnlineCourse();
                System.out.println("Create new Online Course");
                System.out.println("Course Id : ");
                String oId;
                do
                {
                    oId=DataInput.inputString();
                }while(checkUniqueId(oId));
                System.out.println("Course Name");
                String oName;
                do {
                    oName = DataInput.inputString();
                }while(checkUniqueName(oName));
                System.out.println("Credits : ");
                int oCredits = DataInput.inputPositiveInt();
                System.out.println("Platform : ");
                String oPlatform = DataInput.inputString();
                System.out.println("Instructor : ");
                String oIst = DataInput.inputString();
                System.out.println("Note : ");
                String oNote = DataInput.inputString();
                oCourse.InputAll(oId,oName,oCredits,oPlatform,oIst,oNote);
                courseArrayList.getCourseArrayLists().add(oCourse);
                break;
            case 2:
                OfflineCourse fCourse = new OfflineCourse();
                System.out.println("Create new Online Course");
                System.out.println("Course Id : ");
                String fId;
                do
                {
                    fId =DataInput.inputString();
                }while(checkUniqueId(fId));
                System.out.println("Course Name");
                String fName;
                do {
                    fName = DataInput.inputString();
                }while(checkUniqueName(fName));
                System.out.println("Credits : ");
                int fCredits = DataInput.inputPositiveInt();
                System.out.println("Begin : ");
                Date begin = DataInput.inputFutureDate();
                System.out.println("End : ");
                Date end;
                while(true)
                {
                    end =DataInput.inputFutureDate();
                    if(end.before(begin))
                    {
                        System.out.println("Data input is invalid : end must be after begin");
                        System.out.println("Please input again: ");
                    }
                    else {
                        break;
                    }
                }
                System.out.println("Campus : ");
                String campus = DataInput.inputString();
                fCourse.InputAll(fId, fName, fCredits, campus, begin,end );
                courseArrayList.getCourseArrayLists().add(fCourse);

        }
    }
    public Course searchCourseById()
    {
        String id=DataInput.inputString();
        boolean check=false;
        while(!check) {
            for (Course c : courseArrayList.getCourseArrayLists()) {
                if (c.getCourseId().equals(id)) {
                    return c;
                } else {
                    System.out.println("No data found, Do you want to find again ? (Y/N): ");
                    if(DataInput.inputString().equals('y'))
                    {
                        check=true;
                    }else {
                        check=false;
                    }
                }
            }
        }
        return null;
    }
    //Added a check for empty input using response.isEmpty()
    public void updateCourse()
    {
        Course temp = new OfflineCourse();


    }
//    public void updateCourse()
//    {
//        System.out.println("");
//    }
    public boolean deleteCourse(String idCourse)

    {
        for(Course course : courseArrayList.getCourseArrayLists())
        {
            if(course.getCourseId().equals(idCourse))
            {
                courseArrayList.getCourseArrayLists().remove(course);
                return true;
            }

        }
        return false;
    }
    public boolean checkUniqueId(String Id)
    {
        for(Course course : courseArrayList.getCourseArrayLists())
        {
            if(course.getCourseId().toLowerCase().trim().matches(Id))
            {
                return false;
            }
        }
        return true;
    }
    public boolean checkUniqueName(String name)
    {
        for(Course course : courseArrayList.getCourseArrayLists())
        {
            if(course.getCourseId().toLowerCase().trim().matches(name))
            {
                return false;
            }
        }
        return true;
    }
}
