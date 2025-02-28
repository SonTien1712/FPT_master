package Week5.CourseManagement.Model;

import java.util.ArrayList;

public class CourseLists
{
    private static ArrayList<Course> courseArrayLists = new ArrayList<>();

    public ArrayList<Course> getCourseArrayLists() {
        return courseArrayLists;
    }

    public void setCourseArrayLists(ArrayList<Course> courseArrayLists) {
        CourseLists.courseArrayLists = courseArrayLists;
    }
}
