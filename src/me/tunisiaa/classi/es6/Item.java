package me.tunisiaa.classi.es6;

public abstract class Item {
    protected String name;
    protected int quantity;
    public abstract void use();

    public Item(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public Item(){

    }

    public void print(){
        System.out.println("quantity : " + quantity);
        System.out.println("name : " + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


}
