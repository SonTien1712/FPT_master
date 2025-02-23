package Week4.ClassManager.Model;

import java.time.Year;

public class Student extends Person
{
    Year yearOfAdmission;
    int englishScore;
    

    public void InputAll(int ID, String fullname, int phonenumber, Year yearofBirth, String major ,Year yearOfAdmission,
    int englishScore) {
        super.InputAll(ID, fullname, phonenumber, yearofBirth, major);
        this.englishScore=englishScore;
        this.yearOfAdmission=yearOfAdmission;
    }
    public Student()
    {
        super();
        this.englishScore=0;
        this.yearOfAdmission=null;
    }

    @Override
    public String toString() {
        return "Student{" + super.toString() + "yearOfAdmission=" + yearOfAdmission + ", englishScore=" + englishScore + '}';
    }
    

    



}
