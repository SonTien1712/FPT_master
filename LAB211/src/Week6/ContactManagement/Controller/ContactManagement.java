package Week6.ContactManagement.Controller;

import Week6.ContactManagement.Model.Contact;

import java.util.ArrayList;
import java.util.Scanner;

public class ContactManagement {
    private static ArrayList<Contact> contacts = new ArrayList<>();

    private static int idCounter = 1;

    public ArrayList<Contact> getContacts() {
        return contacts;
    }



    public void addContact(Contact contact)
    {
        contacts.add(contact);
    }

    public void displayAll()
    {
        for(Contact contact : contacts)
        {
            System.out.println(contact);
        }
    }

    public void updateContact(int id)
    {
        for(Contact contact : contacts)
        {
            if(contact.getId()==id)
            {
                contact.setAddress(DataInput.InputNullString());
                contact.setGroup(DataInput.InputNullString());
                contact.setPhone(DataInput.InputNullString());
                contact.setFullname(DataInput.InputNullString());
            }
        }
    }

    public static int addId()
    {
        if(contacts.isEmpty())
        {
            return 1;
        }else
        {
            return idCounter++;
        }
    }

    public void renewId()
    {
        if(!contacts.isEmpty()) {
            for(Contact contact : contacts)
            {

            }

        }

    }

    public static void addContact() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Add a Contact ---");

        int id = addId();

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

//        String[] nameParts = fullName.trim().split("\\s+");
//
//        String firstName = nameParts[0];
//        String lastName = (nameParts.length > 1) ? nameParts[nameParts.length - 1] : "";
//        Contact contact = new Contact(id, fullName, group, address, phone, firstName, lastName);
        Contact contact = new Contact(id, fullName, group, address, phone);
        contacts.add(contact);
    }

    public static void printAllContact() {
        System.out.printf("%-5s%-25s%-20s%-20s%-20s%-20s%-20s\n", "Id", "Name",
                "First name", "Last name", "Group", "Address", "Phone");
        //print information of contact from first to last list contact
        for (Contact contact : contacts) {
            String[] nameParts = contact.getFullname().trim().split("\\s+");
            System.out.printf("%-5d%-25s%-20s%-20s%-20s%-20s%-20s\n",
                    contact.getId(), contact.getFullname(),
                    contact.getFistname(), contact.getLastname(),
                    contact.getGroup(), contact.getAddress(), contact.getPhone());
        }
    }

    public static void deleteContactId() {
        boolean found = false;
        System.out.print("Enter id: ");
        int idDelete = DataInput.InputInteger();
        while(true)
        {
            idDelete = DataInput.InputInteger();
            if
            (idDelete>=1&&idDelete<=contacts.size())
            {
                break;
            }
            else {
                System.out.println("Invalid, input again");
            }
        }
        Contact contactDelete = getContactById(idDelete);
        if (!(contactDelete == null)) {
            contacts.remove(contactDelete);
            found=true;
        }
        if (found) {
            // Reassign IDs to keep them sequential
            reassignIds();
        } else {
            System.out.println("Fruit with ID " + idDelete + " not found.");
        }
        System.err.println("Delete successful.");
    }

    private static void reassignIds() {
        idCounter = 1; // Reset ID counter
        for (Contact contact : contacts) {
            contact.setId(idCounter++);
        }
    }

    public static Contact getContactById(int idDelete) {
        for (Contact contact : contacts) {
            if (contact.getId() == idDelete) {
                return contact;
            }
        }
        return null;
    }
}



