/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week4.ClassManager.Controller;

import Week4.ClassManager.Model.Person;
import Week4.ClassManager.View.DataInput;
import java.time.Year;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Manager 
{
    ArrayList<Person> pList = new ArrayList<>();
    public static void main(String[] args) 
    {
        int n=10;
    }
    public void GetInput()
    {
        Scanner scanner = new Scanner(System.in);
        int currentYear = Year.now().getValue();
        while (true) {
            System.out.print("Enter ID (6 digits): ");
            int id = DataInput.inputPositiveInt();
            if (DataInput.countNumber(id)==6) break;
            System.out.println("Invalid ID! It must be exactly 6 digits.");
        }        
        while (true) {
            System.out.print("Enter Full Name (alphabets and spaces only): ");
            String fullName = DataInput.inputString();
            if (fullName.matches("[A-Za-z ]+")) break;
            System.out.println("Invalid Full Name! It must contain only alphabets and spaces.");
        }        
        while (true) {
            System.out.print("Enter Phone Number (12 digits): ");
            int phoneNumber = Integer.parseInt(scanner.nextLine());
            if (DataInput.countNumber(phoneNumber)==12) break;
            System.out.println("Invalid Phone Number! It must be exactly 12 digits.");
        }        
        while (true) {
            System.out.print("Enter Year of Birth (before " + currentYear + "): ");
            try {
                int yearOfBirth = Integer.parseInt(scanner.nextLine());
                if (yearOfBirth < currentYear) break;
                System.out.println("Invalid Year! It must be before " + currentYear + ".");
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a valid year.");
            }
        }        
        while (true) {
            System.out.print("Enter Major (max 30 characters): ");
            String major = scanner.nextLine().trim();
            if (major.length() <= 30) break;
            System.out.println("Invalid Major! It must be at most 30 characters long.");
        }
    }

}
    

