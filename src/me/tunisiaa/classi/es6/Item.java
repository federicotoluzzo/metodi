package me.tunisiaa.classi.es6;

public abstract class Item {
    private String name;
    private int quantity;
    public abstract void use();
    public void print(){
        System.out.println(quantity);
    }
}
