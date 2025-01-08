/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week1;

import java.lang.reflect.Array;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class LinearSearch {    
    private int[] array;
    
    public LinearSearch(int capacity)
    {
        
    }
    

    public static void main(String[] args) {

// TODO code application logic here
        System.out.println("Please input number of array");
        int capacity = Integer.parseInt(sc.nextLine());
        int[] array = generateArray(capacity);
        System.out.println("enter value want to search");
        int result = Integer.parseInt(sc.nextLine());
        System.out.println("The array: [");
        for(int i=0; i<capacity;i++)
        {
            System.out.print(array[i] + ",");
        }
        

    }
    public static void addValue()
    {
      Random random = new Random();
      array[capacity]=random.nextInt(capacity);
    }

    public static int[] generateArray(int n) {
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(n);
        }
        return array;
    }
    public int[] position(int n,int[] array)
    {
        int[] result = new int[n];
        for(int)
    }
    
        
        

}
