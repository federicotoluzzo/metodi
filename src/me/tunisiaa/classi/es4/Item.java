package me.tunisiaa.classi.es4;

public class Item {
    private String name;
    private String description;
    private float price;
    private int quantity;
    private int id;

    public Item(String name, String description, float price, int quantity, int id) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.id = id;
    }

    public String toString(){
        return String.format("Name : %s\n" +
                             "Description : %s\n" +
                             "Price : %f\n" +
                             "Quantity : %d\n" +
                             "ID : %d", name, description, price, quantity, id);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
