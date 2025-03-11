package Week6.ContactManagement.Controller;

import Week6.ContactManagement.Model.Contact;
import Week6.ContactManagement.Model.ContactList;
import week3.BinarySearch.Array;

import java.util.Arrays;
import java.util.Scanner;

public class ContactManagement {
    private static ContactList contactList = new ContactList();

    public static void addContact() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Add a Contact ---");

        int id = contactList.addId();

        System.out.print("Enter Full Name: ");
        String fullName = scanner.nextLine();

        System.out.print("Enter Group: ");
        String group = scanner.nextLine();

        System.out.print("Enter Address: ");
        String address = scanner.nextLine();


        System.out.println("Please input Phone in one of the following formats:");
        System.out.println("• 1234567890");
        System.out.println("• 123-456-7890");
        System.out.println("• 123-456-7890 x1234");
        System.out.println("• 123-456-7890 ext1234");
        System.out.println("• 123.456.7890");
        System.out.println("• 123 456 7890");
        String phone = DataInput.InputPhone();

        String[] nameParts = fullName.trim().split("\\s+");

        String firstName = nameParts[0];
        String lastName = (nameParts.length > 1) ? nameParts[nameParts.length - 1] : "";
        Contact contact = new Contact(id, fullName, group, address, phone, firstName, lastName);
        contactList.addContact(contact);
    }


}
