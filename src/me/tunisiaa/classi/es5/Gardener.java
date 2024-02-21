package me.tunisiaa.classi.es5;

import java.util.HashSet;

public class Gardener {
    private static float salaryPerPlant = 500.0f;
    private HashSet<Type> plants;
    private float salary = 0;

    public Gardener() {
        this.plants = new HashSet<>();
    }

    public void addType(Type type){
        plants.add(type);
    }

    public void removeType(Type type){
        plants.add(type);
    }


    public HashSet<Type> getType() {
        return plants;
    }

    public float getSalary() {
        salary = plants.size() * Gardener.salaryPerPlant;
        return salary;
    }
}
