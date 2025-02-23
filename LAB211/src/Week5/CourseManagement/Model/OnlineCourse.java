package Week5.CourseManagement.Model;

public class OnlineCourse extends Course
{
    String platform;
    String instructor;
    String node;

    public void InputAll(String courseId, String courseName, int credit, String platform, String instructor, String node) {
        super.InputAll(courseId, courseName, credit);
        this.platform = platform;
        this.instructor = instructor;
        this.node = node;
    }

    public OnlineCourse() {
        super();
        this.platform = "";
        this.instructor = "";
        this.node = "";
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public String getNode() {
        return node;
    }

    public void setNode(String node) {
        this.node = node;
    }

    @Override
    public String toString() {
        return "OnlineCourse{" + super.toString()+
                "platform='" + platform + '\'' +
                ", instructor='" + instructor + '\'' +
                ", node='" + node + '\'' +
                '}';
    }
}
