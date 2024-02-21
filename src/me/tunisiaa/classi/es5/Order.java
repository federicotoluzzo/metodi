package me.tunisiaa.classi.es5;

import java.util.HashMap;

public class Order {
    private HashMap<Type, Integer> plants; // pianta, quantità
    public float getOrderPrice(){
        float price = 0;
        for(Type type : plants.keySet()){
            price += type.getPrice() * plants.get(type);
        }
    }
}
