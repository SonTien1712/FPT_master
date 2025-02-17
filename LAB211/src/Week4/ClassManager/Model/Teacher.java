package Week4.ClassManager.Model;

import java.time.Year;

public class Teacher extends Person
{
    Year yearInTheProfession;
    String contact;
    double salaryCoefficient;


    public Teacher(int ID, String fullname, int phonenumber, Year yearofBirth, String major,Year yearInTheProfession,String contact,double salaryCoefficien) {
        super(ID, fullname, phonenumber, yearofBirth, major);
        this.yearInTheProfession=yearInTheProfession;
        this.contact=contact;
        this.salaryCoefficient=salaryCoefficien;
    }
}
