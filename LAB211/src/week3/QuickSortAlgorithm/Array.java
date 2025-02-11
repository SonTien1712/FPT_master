/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week3.QuickSortAlgorithm;

import java.util.Random;

/**
 *
 * @author Admin
 */
public class Array {
    
    private int[] array;
    
    public Array(int n)
    {
        this.array = new int[n];
    }
    
    public void addValue()
    {
       Random random = new Random();
       for(int i=0;i<this.array.length;i++)
       {
           this.array[i] = random.nextInt(this.array.length);
       }
    }
    public void Display()
    {
        for(int i=0;i<this.array.length;i++)
       {
           System.out.println( "the value of the " + (i+1) +"element in array is :" + this.array[i]);
       }
    }
//    public void sortValue()
//    {
//        int count =0;
//        boolean check=false;
//        
//        
//        for(int i=0;i<this.array.length;i++)
//        {
//            for(int j=this.array.length-1;j>=0;j--)
//            {
//                
//            }
//        }
//        }
    public int partition(int left,int right, int input[])
    {
        int pivot = array[(left+right)/2];
        
        
        
        while(left<=right)
        {
            while(array[left]<pivot )left++;
            while(array[right]>pivot)right--;
            if(left<=right)
            {
                swap(array[left],array[right]);
                left++;right--; 
            }
        }
        return right;
    }
    public void     quickSort(int a[],int l,int r)
    {
        int i = partition(l, r, a);
        if(i<r  ) quickSort(a, i, r);
        if(l<i-1) quickSort(a, l, i-1);
    }
    void swap(int a,int b)
            
    {
        int temp = a;
        a=b;
        b=temp;
        
    }
    }

