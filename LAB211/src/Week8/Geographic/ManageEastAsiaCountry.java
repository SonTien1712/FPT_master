package Week8.Geographic;

import java.util.ArrayList;
import java.util.Collections;

import static Week8.Geographic.DataInput.InputDouble;

public class ManageEastAsiaCountry {

    public static void inputCountry(ArrayList<Country> lc) {
        System.out.print("Enter code of contry: ");
        String countryCode = DataInput.InputString();
        //check code contry exist or not
        if (!checkCountryExist(lc, countryCode)) {
            System.err.println("Country exist.");
            return;
        }
        System.out.print("Enter name of contry: ");
        String countryName = DataInput.InputString();
        System.out.print("Enter total area: ");
        double countryArea = InputDouble();
        System.out.print("Enter terrain of contry: ");
        String countryTerrain = DataInput.InputString();
        lc.add(new Country(countryTerrain, countryCode, countryName, countryArea));
        System.err.println("Add successful.");
    }

    //display infomation of country
    public static void printCountry(ArrayList<Country> lc) {
        System.out.printf("%-10s%-25s%-20s%-25s\n", "ID", "Name", "Total Area",
                "Terrain");
        for (Country country : lc) {
            country.display();
        }
    }

    //display infomation sort name in ascending
    public static void printCountrySorted(ArrayList<Country> lc) {
        Collections.sort(lc);
        System.out.printf("%-10s%-25s%-20s%-25s\n", "ID", "Name", "Total Area",
                "Terrain");
        for (Country country : lc) {
            country.display();
        }
    }

    //allow user search infomation contry by name
    public static void searchByName(ArrayList<Country> lc) {
        System.out.print("Enter the name you want to search for: ");
        String countryName = DataInput.InputString();;
        System.out.printf("%-10s%-25s%-20s%-25s\n", "ID", "Name", "Total Area",
                "Terrain");
        for (Country country : lc) {
            if (country.getCountryName().equalsIgnoreCase(countryName)) {
                country.display();
            }
        }
    }

    //check country exist by code
    public static boolean checkCountryExist(ArrayList<Country> lc, String countryCode) {
        for (Country country : lc) {
            if (country.getCountryCode().equalsIgnoreCase(countryCode)) {
                return false;
            }
        }
        return true;
    }
}
