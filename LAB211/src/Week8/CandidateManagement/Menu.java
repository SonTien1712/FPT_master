package Week8.CandidateManagement;

import Week7.ShopManagement.Controller.DataInput;

public class Menu {
    public static int getMenu()
    {
        int choice = 0;
        while (choice < 1 || choice > 5) {  // Corrected condition to allow valid choices
            System.out.println("1. Experience");
            System.out.println("2. Fresher");
            System.out.println("3. Internship");
            System.out.println("4. Searching");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = DataInput.InputInteger();
        }
        return choice;
    }
}
