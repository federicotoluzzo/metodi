package me.tunisiaa.classi.es4;

import java.util.HashSet;

public class Storage {
    private HashSet<Item> items;
    private int id = 1;

    public Storage(){
        items = new HashSet<Item>();
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
