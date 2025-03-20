package Week8.CandidateManagement;





import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Pattern;

public class DataInput {
    private static final String PHONE_REGEX ="^(\\d{10}|\\d{3}[-.\\s]\\d{3}[-.\\s]\\d{4}|\\d{3}[-.\\s]\\d{3}[-.\\s]\\d{4}\\s?(x|ext)\\d{1,5})$";
    ;
    private static final String EMAIL_VALID
            = "^[A-Za-z0-9.+-_%]+@[A-Za-z.-]+\\.[A-Za-z]{2,4}$";

    private static Scanner scanner = new Scanner(System.in);

    public static String InputString() {
        while (true) {
            String result = scanner.nextLine();
            if (!result.isEmpty()) {
                return result;
            } else {
                System.out.println("Input empty");
                System.out.println("Enter again");
            }
        }
    }

    public static String InputEmail() {
        //loop until user input correct
        while (true) {
            String result = InputString();
            //check user input email valid
            if (result.matches(EMAIL_VALID)) {
                return result;
            } else {
                System.err.println("Email with format <account name>@<domain>");
                System.out.print("Enter again: ");
            }
        }
    }

    //Input date
    public static Date InputDate() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-mm-yyyy");
        simpleDateFormat.setLenient(false);
        Date date;
        while (true) {
            try {
                String input = InputString();
                date = simpleDateFormat.parse(input);
            } catch (ParseException e) {
                System.out.println(" Date must be in form dd-mm-yyyy");
                System.out.println("enter again");
            }
        }
    }
    //input format phone number
    public static String InputPhone()
    {
        while(true)
        {
            String result = InputString();
            if(Pattern.matches(PHONE_REGEX,result))
            {
                return result;
            }
            else {
                System.out.println("Invalid Phone number");
                System.out.println("enter again");
            }
        }
    }

    public static double InputDouble() {
        //loop until user input correct
        while (true) {
            try {
                double result = Double.parseDouble(Week8.Geographic.DataInput.InputString());
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Please input number double");
                System.out.print("Enter again: ");
            }
        }
    }


    //Input Positive Integer
    public static int InputInteger() {
        while (true) {
            try {
                int input = Integer.parseInt(scanner.nextLine());
                if (input >= 0) {
                    return input;
                } else {
                    System.out.println("not a positive int");
                    System.out.println("enter again");
                }
            } catch (NumberFormatException e) {
                System.out.println("must be integer");
                System.out.println("enter again");
            }


        }
    }

    public static String InputNullString()
    {
        String result = scanner.nextLine();
        if(result.isEmpty())
        {
            return null;
        }
        else {
            return result;
        }
    }
}

