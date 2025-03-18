package Week7.ShopManagement.Controller;

import Week7.ShopManagement.Model.Fruit;
import Week7.ShopManagement.Model.FruitList;
import Week7.ShopManagement.Model.Shopping;

public class ShopManagement {
    private FruitList fruitList = new FruitList();

    private Shopping shopping = new Shopping();

    public FruitList getFruitList() {
        return fruitList;
    }

    public void addFruit()
    {
        while(true){
            System.out.println("*** Create New Fruit ***");
            System.out.println("Enter fruit id: ");
            String id = DataInput.InputString();
            System.out.println("Enter fruit name: ");
            String name = DataInput.InputString();
            System.out.println("Enter fruit price: ");
            int price = DataInput.InputInteger();
            System.out.println("Enter fruit quantity: ");
            int quantity = DataInput.InputInteger();
            System.out.println("Enter fruit origin: ");
            String origin = DataInput.InputString();
            Fruit fruit = new Fruit(id, name, price, quantity, origin);
            fruitList.addFruit(fruit);
            String option;
            while (true) {
                System.out.print("Do you want to continue? (Y/N): ");
                option = DataInput.InputString().trim();

                if (option.equalsIgnoreCase("Y")) {
                    break;
                } else if (option.equalsIgnoreCase("N")) {
                    System.out.println("Exiting fruit entry...");
                    return;
                } else {
                    System.out.println("Invalid input. Please enter Y or N.");
                }
            }
        }
    }

    public void addCustomerOrder()
    {
        System.out.println("Fruit List");
        fruitList.toString();
        while(true) {
            FruitList temp = new FruitList();
            String choice;
            do{
                System.out.println("Add Fruit you want to buy :");
                String fruitName = DataInput.InputString();
                for (Fruit fruits : fruitList.getOrder()) {
                    if (fruits.getName().equals(fruitName)) {
                        System.out.println("Please Input Quantity");
                        fruits.setQuantity(DataInput.InputInteger());
                        temp.addFruit(fruits);
                    } else {
                        System.out.println("Invalid Fruit");
                        System.out.println("Enter again");
                    }
                }
                System.out.println("Do you want to order now (Y/N) :");
                 choice = DataInput.InputString();
            }while(!choice.equals('Y'));
            System.out.println("Your Choice");
            temp.toString();
            System.out.println("Total : " +temp.calTotal()+"$");
            System.out.println("Input your name");
            String name = DataInput.InputString();
            shopping.addShopping(name,temp);
        }
    }

    public void viewOrder()
    {
        System.out.println("Customer : " + shopping.getOrderList().keySet());
    }









//    public static void main(String[] args)
//    {
//    }
}
