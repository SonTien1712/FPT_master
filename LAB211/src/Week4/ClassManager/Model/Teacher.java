package Week4.ClassManager.Model;

import java.time.Year;

public class Teacher extends Person {

    Year yearInTheProfession;
    String contact;
    double salaryCoefficient;

    public void InputAll(int ID, String fullname, int phonenumber, Year yearofBirth, String major, Year yearInTheProfession, String contact, double salaryCoefficien) {
        super.InputAll(ID, fullname, phonenumber, yearofBirth, major);
        this.yearInTheProfession = yearInTheProfession;
        this.contact = contact;
        this.salaryCoefficient = salaryCoefficien;
    }

    public Teacher() {
        super();
        this.yearInTheProfession = null;
        this.contact = "";
        this.salaryCoefficient = 0;
    }

    @Override
    public String toString() {
        return "Teacher{" + super.toString() + "yearInTheProfession=" + yearInTheProfession + ", contact=" + contact + ", salaryCoefficient=" + salaryCoefficient + '}';
    }
    
}
