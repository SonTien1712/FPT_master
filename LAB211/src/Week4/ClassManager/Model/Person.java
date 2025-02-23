/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week4.ClassManager.Model;

import java.time.Year;

/**
 *
 * @author Admin
 */
public class Person {
    int ID;
    String fullname;
    int phonenumber;
    Year yearofBirth;
    String major;

    public void InputAll(int ID, String fullname, int phonenumber, Year yearofBirth, String major) {
        this.ID = ID;
        this.fullname = fullname;
        this.phonenumber = phonenumber;
        this.yearofBirth = yearofBirth;
        this.major = major;
    }
    public Person()
    {
        this.ID = 0;
        this.fullname = "";
        this.phonenumber = 0;
        this.yearofBirth = null;
        this.major = ""; 
    }

    @Override
    public String toString() {
        return "Person{" +
                "ID=" + ID +
                ", fullname='" + fullname + '\'' +
                ", phonenumber=" + phonenumber +
                ", yearofBirth=" + yearofBirth +
                ", major='" + major + '\'' +
                '}';
    }
    //    public inputAll()
//    {
//        
//    }
    
    
}
