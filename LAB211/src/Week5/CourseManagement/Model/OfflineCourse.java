package Week5.CourseManagement.Model;

import java.util.Date;

public class OfflineCourse extends Course
{
    String campus;
    Date begin,end;

    public void InputAll(String courseId, String courseName, int credit, String campus, Date begin, Date end) {
        super.InputAll( courseId,  courseName,  credit);
        this.campus = campus;
        this.begin = begin;
        this.end = end;
    }
    public OfflineCourse()
    {
        super();
        this.campus="";
        this.begin=null;
        this.end=null;
    }

    public String getCampus() {
        return campus;
    }

    public void setCampus(String campus) {
        this.campus = campus;
    }

    public Date getBegin() {
        return begin;
    }

    public void setBegin(Date begin) {
        this.begin = begin;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    @Override
    public String toString() {
        return "OfflineCourse{" +super.toString()+
                "campus='" + campus + '\'' +
                ", begin=" + begin +
                ", end=" + end +
                '}';
    }
}
