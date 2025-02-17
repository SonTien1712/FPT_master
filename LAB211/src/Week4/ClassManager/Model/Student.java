package Week4.ClassManager.Model;

import java.time.Year;

public class Student extends Person
{
    Year yearOfAdmission;
    int englishScore;

    public Student(int ID, String fullname, int phonenumber, Year yearofBirth, String major ,Year yearOfAdmission,
    int englishScore) {
        super(ID, fullname, phonenumber, yearofBirth, major);
        this.englishScore=englishScore;
        this.yearOfAdmission=yearOfAdmission;
    }




}
