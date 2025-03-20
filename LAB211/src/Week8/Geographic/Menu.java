package Week8.Geographic;

import Week7.ShopManagement.Controller.DataInput;

public class Menu {
    public int getMenu()
    {
        int choice = 0;
        while (choice < 1 || choice > 5) {  // Corrected condition to allow valid choices
            System.out.println("1. Input the information of 11 countries in East Asia");
            System.out.println("2. Display the information of country you've just input");
            System.out.println("3. Search the information of country by user-entered name");
            System.out.println("4. Display the information of countries sorted name in ascending");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = DataInput.InputInteger();
        }
        return choice;
    }


}
