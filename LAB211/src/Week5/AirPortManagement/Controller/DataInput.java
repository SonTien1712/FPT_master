package Week5.AirPortManagement.Controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Date;
import java.util.Scanner;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


public class DataInput {
    static Scanner scanner = new Scanner(System.in);

    public static String getValue(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine().trim();
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

//    public static void requestUpdate(String object)
//    {
//        System.out.println("Do you want to update " + object + " ? Press enter to skip");
//        String respone =
//    }

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


