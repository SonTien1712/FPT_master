package Week5.CourseManagement.Controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Year;
import java.util.Date;
import java.util.Scanner;
import java.util.StringTokenizer;

public class DataInput {
    static Scanner scanner = new Scanner(System.in);

    public static String getValue(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine().trim();
    }

    //    public static int countNumber(int prompt)
//    {
//        int result=0;
//        if(prompt==0) return -1;
//        while(prompt>0)
//        {
//            result++;
//            prompt/=10;
//        }
//        return result;
//    }
//    public static int countChar(String prompt)
//    {
//        int count=0;
//        for(char ch : prompt.toCharArray())
//        {
//            if(Character.isSpaceChar(ch)) continue;
//            count++;
//        }
//        return count;
//    }
//    public static void checkYearAdmission(Year p1, Year p2)
//    {
//
//
//    }
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

    public static Date inputFutureDate() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/mm/yyyy");
        simpleDateFormat.setLenient(false);
        Date date;
        while (true) {
            try {
                String dateString = inputString();
                date = simpleDateFormat.parse(dateString);
                LocalDate currentDate = LocalDate.now();
                if (date.after(simpleDateFormat.parse(String.valueOf(currentDate)))) {
                    return date;
                } else {
                    System.out.println("Data input is invalid : Date must be future");
                    System.out.println("Please input again: ");
                }

            } catch (ParseException e) {
                System.out.println("Data input is invalid : Date must be in form at dd/mm/yyyy");
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
                System.out.println("Data input is invalid : Input must not be empty");
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
                    System.out.println("Data input is invalid : Input must be a positive integer");
                    System.out.println("Please input again: ");
                }
            } catch (NumberFormatException e) {
                System.out.println("Data input is invalid : Input must be an integer");
                System.out.println("Please input again: ");
            }
        }
    }

    public static int inputAddMethod() {
        int check = -1;
        while (check == -1) {
            String result = inputString();
            if (result.trim().toLowerCase().equals('o')) {
                check = 0;
            } else if (!result.trim().toLowerCase().equals('f')) {
                check = 1;
            } else {
                System.out.println("Data input is invalid : Input must be O/F");
                System.out.println("Please input again: ");
            }
        }
        return check;
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
}

