package Week7.ShopManagement;

import Week7.ShopManagement.Controller.Menu;
import Week7.ShopManagement.Controller.ShopManagement;
import Week7.ShopManagement.Model.Fruit;

public class Main {

    public static void main(String[] args)
    {

        ShopManagement shopManagement = new ShopManagement();
        shopManagement.getFruitList().addFruit(new Fruit("1","Mango",2,3,"VietNam"));
        shopManagement.getFruitList().addFruit(new Fruit("2","Apple",2,34,"Laos"));
        shopManagement.getFruitList().addFruit(new Fruit("3","Durian",4,3,"ThaiLan"));
        shopManagement.getFruitList().addFruit(new Fruit("4","StrawBerry",5,4,"korea"));
        while(true) {
            int choice = Menu.getShopMenu();
            switch (choice) {
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
}
