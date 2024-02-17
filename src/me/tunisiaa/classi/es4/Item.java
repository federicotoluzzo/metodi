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
}
