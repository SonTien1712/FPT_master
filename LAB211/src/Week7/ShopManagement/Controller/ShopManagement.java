package Week7.ShopManagement.Controller;

import Week7.ShopManagement.Model.Fruit;
import Week7.ShopManagement.Model.FruitList;
import Week7.ShopManagement.Model.Shopping;

import java.util.List;
import java.util.Map;

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

//    public void addCustomerOrder()
//    {
//        System.out.println("Fruit List");
//        fruitList.toString();
//        while(true) {
//            FruitList temp = new FruitList();
//            String choice;
//            do{
//                System.out.println("Add Fruit you want to buy :");
//                String fruitName = DataInput.InputString();
//                for (Fruit fruits : fruitList.getOrder()) {
//                    if (fruits.getName().equals(fruitName)) {
//                        System.out.println("Please Input Quantity");
//                        fruits.setQuantity(DataInput.InputInteger());
//                        temp.addFruit(fruits);
//                    } else {
//                        System.out.println("Invalid Fruit");
//                        System.out.println("Enter again");
//                    }
//                }
//                System.out.println("Do you want to order now (Y/N) :");
//                 choice = DataInput.InputString();
//            }while(!choice.equals('Y'));
//            System.out.println("Your Choice");
//            temp.toString();
//            System.out.println("Total : " +temp.calTotal()+"$");
//            System.out.println("Input your name");
//            String name = DataInput.InputString();
//            shopping.addShopping(name,temp);
//        }
//    }

//    public void viewOrder()
//    {
//        System.out.println("Customer : " + shopping.getOrderList().keySet());
//    }


    public void addCustomerOrder() {
        System.out.println("=== Fruit List ===");
        displayFruitList();

        FruitList tempOrder = new FruitList(); // Temporary order list
        String choice;

        while (true) {
            System.out.println("Enter the item number of the fruit you want to buy:");
            int itemNumber = DataInput.InputInteger();


            if (itemNumber < 1 || itemNumber > fruitList.getOrder().size()) {
                System.out.println("Invalid item number. Please try again.");
                continue;
            }

            Fruit selectedFruit = fruitList.getOrder().get(itemNumber - 1); // Get fruit by index
            System.out.println("You selected: " + selectedFruit.getName());

            // Ask for quantity
            int quantity;
            while (true) {
                System.out.println("Please input quantity:");
                quantity = DataInput.InputInteger();

                if (quantity > 0 && quantity <= selectedFruit.getQuantity()) {
                    break; // Valid quantity entered
                } else {
                    System.out.println("Invalid quantity. Available stock: " + selectedFruit.getQuantity());
                }
            }

            // Add fruit to temporary order
            tempOrder.addFruit(new Fruit(
                    selectedFruit.getId(),
                    selectedFruit.getName(),
                    selectedFruit.getPrice(),
                    quantity,
                    selectedFruit.getOrigin()
            ));

            // Reduce available stock
            selectedFruit.setQuantity(selectedFruit.getQuantity() - quantity);

            // Ask if they want to continue shopping
            System.out.println("Do you want to order now (Y/N):");
            choice = DataInput.InputString().trim();

            if (choice.equalsIgnoreCase("Y")) {
                break; // Proceed to checkout
            } else if (!choice.equalsIgnoreCase("N")) {
                System.out.println("Invalid input. Returning to fruit list.");
            }

            // Show updated fruit list before next selection
            displayFruitList();
        }

        // Show order summary
        System.out.println("\n=== Your Order Summary ===");
        displayOrderSummary(tempOrder);

        // Get customer's name
        System.out.println("Input your name:");
        String customerName = DataInput.InputString();

        // Add order to shopping records
        shopping.addShopping(customerName, tempOrder);

        System.out.println("Order placed successfully! Returning to the main menu...\n");
    }

    private void displayFruitList() {
        System.out.println("| ++ Item ++ | ++ Fruit Name ++ | ++ Origin ++ | ++ Price ++ | ++ Available ++ |");
        List<Fruit> fruits = fruitList.getOrder();
        int itemNumber = 1;

        for (Fruit fruit : fruits) {
            System.out.printf("| %-6d | %-12s | %-10s | %-6d$ | %-10d |\n",
                    itemNumber++, fruit.getName(), fruit.getOrigin(), fruit.getPrice(), fruit.getQuantity());
        }
    }

    private void displayOrderSummary(FruitList tempOrder) {
        System.out.println("| Product  | Quantity | Price | Amount |");
        int total = 0;

        for (Fruit fruit : tempOrder.getOrder()) {
            int amount = fruit.getQuantity() * fruit.getPrice();
            total += amount;

            System.out.printf("| %-8s | %-8d | %-5d$ | %-6d$ |\n",
                    fruit.getName(), fruit.getQuantity(), fruit.getPrice(), amount);
        }

        System.out.println("Total: " + total + "$");
    }

    public void viewOrder() {
        if (shopping.getOrderList().isEmpty()) {
            System.out.println("No orders found.");
            return;
        }

        System.out.println("===== Customer Orders =====");
        for (Map.Entry<String, FruitList> entry : shopping.getOrderList().entrySet()) {
            String customer = entry.getKey();
            FruitList order = entry.getValue();

            System.out.println("Customer: " + customer);
            System.out.println("Order details: " + order);
            System.out.println("------------------------");
        }
    }

//    public void









//    public static void main(String[] args)
//    {
//    }
}
