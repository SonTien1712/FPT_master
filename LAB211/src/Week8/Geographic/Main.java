package Week8.Geographic;

import Week8.CandidateManagement.Menu;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Country> lc = new ArrayList<>();
        //loop until user want to exist
        while (true) {
            int choice = Menu.getMenu();
            switch (choice) {
                case 1:
                    ManageEastAsiaCountry.inputCountry(lc);
                    break;
                case 2:
                    ManageEastAsiaCountry.printCountry(lc);
                    break;
                case 3:
                    ManageEastAsiaCountry.searchByName(lc);
                    break;
                case 4:
                    ManageEastAsiaCountry.printCountrySorted(lc);
                    break;
                case 5:
                    return;
            }
        }
    }
}
