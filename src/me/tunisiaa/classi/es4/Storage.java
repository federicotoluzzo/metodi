package me.tunisiaa.classi.es4;

import java.util.ArrayList;

public class Storage {
    private ArrayList<Item> items;
    private int id = 1;

    public Storage(){
        items = new ArrayList<Item>();
    }

    public void addItem(String name, String description, float price, int quantity){
        items.add(new Item(name, description, price, quantity, id++));
    }


    public String toString(){
        String s = "- - - - - - - - - -\n";
        for(Item i : items){
            s += i.toString();
            s += "- - - - - - - - - -\n";
        }
        return s;
    }
}
