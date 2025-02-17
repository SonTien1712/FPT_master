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

    private int length;
    private int search;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getSearch() {
        return search;
    }

    public void setSearch(int search) {
        this.search = search;
    }

    
    public LinearSearch(int length, int search) {
        this.length = length;
        this.search = search;
    }
    public LinearSearch(){}   
     
    public void getInput()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of array:");
        this.length = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter search value:");
        this.search = scanner.nextInt();
    }
    
    public int[] createArray(int length)
    {
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = new Random().nextInt(length);
        }
        return array;
    }
    public void displayArray(int[] arr,int key) {
        System.out.print("The array: ");
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
        System.out.println("------------------------------------");
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            if (arr[i] == key) {
                System.out.println("\nFound " + search + " at index: " + i);
            }
            else
            {
                System.out.println("Can't find the value " + key + " in the list");
            }
        }
        
    }

    
    
}