package Week6.ContactManagement;

import Week6.ContactManagement.Controller.ContactManagement;
import Week6.ContactManagement.Model.Contact;
import Week6.ContactManagement.Controller.Menu;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ContactManagement lc = new ContactManagement();
        lc.addContact(new Contact(1, "Iker Casillas", "Star", "Spain", "1234567890", "Iker", "Casillas"));
        lc.addContact(new Contact(2, "John Terry", "Star", "England", "1234567890", "John", "Terry"));
        lc.addContact(new Contact(3, "Raul Gonzalez", "Star", "Spain", "1234567890", "Raul", "Gonzalez"));
        //loop until user want to exit
        while (true) {
            int choice = Menu.displayMenu();
            switch (choice) {
                case 1:
                    lc.addContact();
                    break;
                case 2:
                    lc.printAllContact();
                    break;
                case 3:
                    lc.deleteContactId();
                    break;
                case 4:
                    return;
            }
        }
    }
}
