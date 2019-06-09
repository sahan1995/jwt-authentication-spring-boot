package lk.techCloud.springSec.dto;

public class Items {

    private int ID;

    private String name;

    private double price;

    public Items(int ID, String name, double price) {
        this.ID = ID;
        this.name = name;
        this.price = price;
    }

    public Items() {
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Items{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
