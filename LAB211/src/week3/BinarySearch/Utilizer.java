/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week3.BinarySearch;

import week3.BubbleSortAlgorithm.*;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Utilizer {

    public static int checkNumber()
    {
        Scanner scanner = new Scanner(System.in);
        while(true)
        {
        try {
            System.out.println("enter number :");
            int input = Integer.parseInt(scanner.nextLine());
            return input;

        } catch (Exception e) {
            System.out.println("error");

        }
        }
        
    }
}
