/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Slot6;

/**
 *
 * @author Admin
 */
public class Recursion {
    /*
    write recursion-based function to calculate
    the factorial of n
    */
    int factorial(int n)
    {
        if(n<0)
        {
            return -1;
        }
        else{
            if(n==0)
            {
                return 1;
            }else{
                return n*factorial(n-1);
            }
        }
        /*
        Write recursion-based fuction to calculate
        the n-th element of fibonacci sequence
        */
    }
        int fibonacci(int n)
        {
            if(n<=0)
            {
                System.out.println("error");
                return -1;
                
            }else
            {if (n==1) return 0;
            if(n==2) return 1;
            
            }
            return fibonacci(n-1)+fibonacci(n-2);
        }
        
        public static void main(String[] args) 
        {
        
            Recursion recur = new Recursion();
            System.out.println("print out factorial of 6");
            System.out.println("factorial of 6" +":" +recur.factorial(6));
            System.out.println("");
            int n =7;
            System.out.println("the value of" + n +" element in fibo sequence is :" + recur.fibonacci(n));
    }
    
    
}
