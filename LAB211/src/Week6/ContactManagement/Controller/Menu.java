package Week6.ContactManagement.Controller;

import java.util.Scanner;

public class Menu {
    public static int displayMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("== Contact Program ==");
        System.out.println("1. Add a Contact");
        System.out.println("2. Display all Contacts");
        System.out.println("3. Delete a Contact");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");

        int choice = scanner.nextInt();
        return choice;
    }

}
