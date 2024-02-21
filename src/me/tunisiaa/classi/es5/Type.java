package me.tunisiaa.classi.es5;

public class Type {
    private String name;
    private int id;
    private float basePrice;
    private boolean hasFlowers;
    private int quantity;

    public Type(String name, float basePrice, boolean hasFlowers) {
        this.name = name;
        this.basePrice = basePrice;
        this.hasFlowers = hasFlowers;
    }
}
