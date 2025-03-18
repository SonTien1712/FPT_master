package Week7.ShopManagement.Controller;

public class Menu {
    public static int getShopMenu() {
        int choice = 0;
        while (choice < 1 || choice > 4) {  // Corrected condition to allow valid choices
            System.out.println("FRUIT SHOP SYSTEM");
            System.out.println("1. Create Fruit");
            System.out.println("2. View orders");
            System.out.println("3. Shopping (for buyer)");
            System.out.println("4. Exit");
            System.out.print("\n(Please choose 1 to create product, 2 to view order, 3 for shopping, 4 to Exit program): ");
            choice = DataInput.InputInteger();
        }
        return choice;
    }
}
