package Week7.ShopManagement;

import Week7.ShopManagement.Controller.Menu;
import Week7.ShopManagement.Controller.ShopManagement;

public class Main {

    public static void main(String[] args)
    {
        ShopManagement shopManagement = new ShopManagement();
        int choice = Menu.getShopMenu();
        switch (choice)
        {
            case 1:
                shopManagement.addFruit();
                break;
            case 2:
                shopManagement.viewOrder();
                break;
            case 3:
                shopManagement.addCustomerOrder();
                break;
            case 4:
                System.out.println("Exit");
                System.exit(0);
                break;
        }
    }
}
