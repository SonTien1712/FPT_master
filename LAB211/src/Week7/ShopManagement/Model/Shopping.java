package Week7.ShopManagement.Model;

import java.util.HashMap;

public class Shopping {
    private HashMap<String, FruitList> OrderList = new HashMap<>();

    public Shopping() {
        // Constructor remains empty
    }

    public void addShopping(String customer, FruitList order) {
        if (customer == null || order == null) {
            throw new IllegalArgumentException("Customer and order cannot be null.");
        }
        this.OrderList.put(customer, order);
    }

    public HashMap<String, FruitList> getOrderList() {
        return OrderList;
    }

    @Override
    public String toString() {
        return "Shopping{" +
                "OrderList=" + OrderList +
                '}';
    }
}

