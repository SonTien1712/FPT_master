/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week4.StudentManager.Controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Year;
import java.util.Date;
import java.util.Scanner;

/**
 * @author Admin
 */
public class DataInput {
    static Scanner scanner = new Scanner(System.in);

    public static String getValue(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine().trim();
    }
//    public static int numCheck(long prompt,int check)
//    {
//        int count=0;
//       for(int i=0;i<Math.log10(prompt);i++)
//       {
//          if(prompt/(10^(i+1))!=0) count++;
//       }
//       if(count==check) return 0;
//       return -1;
//
    public static int countNumber(int prompt) {
        int result = 0;
        if (prompt == 0) return -1;
        while (prompt > 0) {
            result++;
            prompt /= 10;
        }
        return result;
    }
    public static String inputId() {
        while (true) {
            try {

                String result =  scanner.nextLine();
                if (result.matches("^KH\\d{6}$")) {
                    return result;
                } else {
                    System.out.println("Input error");
                    System.out.println("Please input again: ");
                }
            } catch (Exception e) {
                System.out.println("Input error");
                System.out.println("Please input again: ");
            }
        }
    }

    public static int countChar(String prompt) {
        int count = 0;
        for (char ch : prompt.toCharArray()) {
            if (Character.isSpaceChar(ch)) continue;
            count++;
        }
        return count;
    }

    public static void checkYearAdmission(Year p1, Year p2) {


    }

    public static String getFormattedValue(String prompt, String errMsg, String regex) {
        while (true) {
            System.out.println(prompt);
            String input = scanner.nextLine().trim();
            if (!input.matches(regex))
                return input;
            else
                System.out.println(errMsg);
        }
    }

//    public static void main(String[] args) {
//        DataInput dt= new DataInput();
////        System.out.println( dt.countNumber(12345) +" ");
//        if(dt.countNumber(1234)==4)
//        {
//            System.out.println("true");
//        } else
//        {
//            System.out.println("false");
//        }
//        System.out.println( dt.countChar("Hello World") + " ");
//    }

    public static Date inputDate() {

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/mm/yyyy");
        simpleDateFormat.setLenient(false);
        Date date;
        while (true) {
            try {
                String dateString = scanner.nextLine();
                date = simpleDateFormat.parse(dateString);
                return date;
            } catch (ParseException e) {
                System.out.println("Date must be in form at dd/mm/yyyy");
                System.out.println("Please input again: ");
            }
        }
    }

    //    public static Year inputYear()
//    {
//        SimpleDateFormat simpleYearFormat = new SimpleDateFormat("yyyy");
//        String formattedYear = simpleYearFormat.format(new Date());
//        Year date;
//        while(true) {
//                try {
//                    String dateString = scanner.nextLine();
//                    date = simpleDateFormat.parse(dateString);
//                    return date;
//                } catch (ParseException e) {
//                System.out.println("Date must be in form at dd/mm/yyyy");
//                System.out.println("Please input again: ");
//                }
//        }
//    }
    public static String inputString() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String result = scanner.nextLine();
            if (!result.isEmpty()) {
                return result;
            } else {
                System.out.println("Input must not be empty");
                System.out.println("Please input again: ");
            }
        }
    }

    public static int inputPositiveInt() {
        while (true) {
            try {
                int result = Integer.parseInt(inputString());
                if (result > 0) {
                    return result;
                } else {
                    System.out.println("Input must be a positive integer");
                    System.out.println("Please input again: ");
                }
            } catch (NumberFormatException e) {
                System.out.println("Input must be an integer");
                System.out.println("Please input again: ");
            }
        }

    }
}
