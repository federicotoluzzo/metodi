package me.tunisiaa.classi.es5;

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
}
