package Week7.ShopManagement.Model;

import java.util.ArrayList;

public class FruitList {
    private ArrayList<Fruit> order = new ArrayList<>();

    public ArrayList<Fruit> getOrder() {
        return order;
    }

//    public FruitList()
//    {
//
//    }

    @Override
    public String toString() {
        return "FruitList{" +
                "order=" + order +
                '}';
    }

    public void addFruit(Fruit f)
    {
        order.add(f);
    }

    public int calTotal()
    {
        int total=0;
        for(Fruit fruit : order)
        {
            total+=fruit.getPrice()*fruit.getQuantity();
        }
        return total;
    }
}
