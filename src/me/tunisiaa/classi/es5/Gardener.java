package me.tunisiaa.classi.es5;

import java.util.HashSet;

public class Gardener {
    private String name;
    private String surname;
    private HashSet<Type> plants;
    private float baseSalary;

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
        float salary = baseSalary;
        for(Type type : plants){
            salary += type.getSalaryBonus();
        }
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
