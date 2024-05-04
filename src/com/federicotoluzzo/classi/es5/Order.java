package com.federicotoluzzo.classi.es5;

import java.util.HashMap;

public class Order {
    private HashMap<Type, Integer> plants;
    public void addPlants(Type type, int quantity){
        for(Type t : plants.keySet()){
            if(t == type){
                plants.remove(t);
                return;
            }
        }
        plants.put(type, quantity);
    }
    public void removePlants(Type type){
        for(Type t : plants.keySet()){
            if(t == type){
                plants.remove(t);
                return;
            }
        }
    }
    public void removePlants(String name){
        for(Type t : plants.keySet()){
            if(t.getName().equals(name)){
                plants.remove(t);
                return;
            }
        }
    }
    public float getOrderPrice(){
        float price = 0;
        for(Type type : plants.keySet()){
            price += type.getPrice() * plants.get(type);
        }
        return price;
    }

    public String toString(){
        String order = "";
        for(Type type : plants.keySet()){
            order += String.format("%s\t:\t%f\n", type.getName(), type.getPrice() * plants.get(type));
        }
        order += String.format("Total\t:\t%f\n", getOrderPrice());
        return order;
    }
}
