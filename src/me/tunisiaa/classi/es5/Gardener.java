package me.tunisiaa.classi.es5;

import java.util.HashSet;

public class Gardener {
    private HashSet<Type> plants;
    private int salary = 0;

    public Gardener() {
        this.plants = new HashSet<>();
    }

    public void addType(Type type){
        plants.add(type);
        salary += 500;
    }

    public void removeType(Type type){
        plants.add(type);
        salary += 500;
    }


    public HashSet<Type> getType() {
        return plants;
    }

    public int getSalary() {
        return salary;
    }
}
