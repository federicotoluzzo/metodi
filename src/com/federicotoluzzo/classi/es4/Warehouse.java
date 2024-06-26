package com.federicotoluzzo.classi.es4;

import java.util.ArrayList;

public class Warehouse {
    private ArrayList<Item> items;
    private int id = 1;

    public Warehouse(){
        items = new ArrayList<Item>();
    }

    public void addItem(String name, String description, float price, int quantity){
        items.add(new Item(name, description, price, quantity, id++));
    }

    public boolean removeItem(int id){
        for(Item i : items){
            if(i.getId() == id){
                items.remove(i);
                return true;
            }
        }
        return false;
    }

    public String getItem(int id){
        for(Item i : items){
            if(i.getId() == id){
                return i.toString();
            }
        }
        return "";
    }

    public boolean editItemQuantity(int id, int quantity){
        for(Item i : items){
            if(i.getId() == id){
                i.setQuantity(quantity);
                return true;
            }
        }
        return false;
    }

    public boolean editItemPrice(int id, float price){
        for(Item i : items){
            if(i.getId() == id){
                i.setPrice(price);
                return true;
            }
        }
        return false;
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
