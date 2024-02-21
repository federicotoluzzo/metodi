package me.tunisiaa.classi.es5;

public class Type {
    private String name;
    private float price;
    private boolean hasFlowers;
    private int quantity;
    private float salaryBonus;
    private Gardener gardener;

    public Type(String name, float price, boolean hasFlowers) {
        this.name = name;
        this.price = price;
        this.hasFlowers = hasFlowers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public boolean hasFlowers() {
        return hasFlowers;
    }

    public void setHasFlowers(boolean hasFlowers) {
        this.hasFlowers = hasFlowers;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getSalaryBonus() {
        return salaryBonus;
    }

    public void setSalaryBonus(float salaryBonus) {
        this.salaryBonus = salaryBonus;
    }
}
