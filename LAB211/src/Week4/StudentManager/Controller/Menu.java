/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week4.StudentManager.Controller;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Menu 
{
    public static int getMenu()
    {   int choice;
        System.out.println("Welcome to Student Management");
        System.out.println("1.Create");
        System.err.println("2.Find and Sort");
        System.err.println("3.Update/Delete");
        System.err.println("4.Report");
        System.err.println("5.Exit ");
        System.out.println("Enter your option");
        Scanner scanner = new Scanner(System.in);
        choice = Integer.parseInt(scanner.nextLine());
        return choice;
    }
}
