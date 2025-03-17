package Week7.ShopManagement.Model;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Objects;

public class Shopping
{
    private FruitList fruitList = new FruitList();

    private Hashtable<String,FruitList> OrderList = new Hashtable<String, FruitList>();

    public Shopping()
    {
        this.OrderList.put(null,null);
    }


    public FruitList getFruitList() {
        return fruitList;
    }

    public void addShopping(String customer, FruitList order)
    {
        this.OrderList.put(customer,order);
    }

    public Hashtable<String, FruitList> getOrderList() {
        return OrderList;
    }





//    public void addOrder(Fruit fruit)
//    {
//        fruitList.addFruit(fruit);
//    }

    @Override
    public String toString() {
        return "Shopping{" +
                "OrderList=" + OrderList +
                '}';
    }

    //    public void add
}
