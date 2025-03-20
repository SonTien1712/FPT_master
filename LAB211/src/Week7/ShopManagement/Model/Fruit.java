package Week7.ShopManagement.Model;

public class Fruit {

    private String id;
    private String name;
    private int price;
    private int quantity;
    private String origin;

    public Fruit(String id, String name, int price, int quantity, String origin) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.origin = origin;
    }

    public String getOrigin() {
        return origin;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getPrice() {
        return price;
    }

    public Fruit(){}
    public String getName() {
        return name;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", origin='" + origin + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }
}
