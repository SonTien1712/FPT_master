package Week5.CourseManagement.Model;

public class Course
{
    String courseId;
    String courseName;
    int credit;

    public Course() {
        this.courseId = "";
        this.courseName = "";
        this.credit = 0;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public void InputAll(String courseId, String courseName, int credit)
    {
        this.courseId=courseId;
        this.courseName=courseName;
        this.credit=credit;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseId=" + courseId +
                ", courseName='" + courseName + '\'' +
                ", credit=" + credit +
                '}';
    }
}
