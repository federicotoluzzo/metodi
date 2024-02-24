package me.tunisiaa.classi.es5;

import java.util.HashSet;

public class Gardener {
    private String name;
    private String surname;
    private HashSet<Type> plants;
    private float baseSalary;
    private int id;
    private static int lastID = 0;

    public Gardener() {
        this.plants = new HashSet<>();
        this.id = ++lastID;
    }

    public Gardener(String name, String surname, float baseSalary) {
        this.name = name;
        this.surname = surname;
        this.baseSalary = baseSalary;
        this.plants = new HashSet<>();
        this.id = ++lastID;
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

    public static int getLastID() {
        return lastID;
    }

    public String toString(){
        String gardener = "";
        gardener += String.format("Name\t:\t%s\n" +
                                  "Surname\t:\t%s\n" +
                                  "Base Salary\t:\t%s\n", name, surname, baseSalary);
        gardener += "Plants : ";
        for(Type type : plants){
            gardener += type.getName();
        }
        return gardener + "\n";
    }
}
