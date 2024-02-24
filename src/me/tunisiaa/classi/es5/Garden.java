package me.tunisiaa.classi.es5;

import java.util.HashSet;

public class Garden {
    private HashSet<Type> types;
    private HashSet<Gardener> gardeners;
    public void addGardener(Gardener gardener){
        gardeners.add(gardener);
    }
    public void addGardener(String name, String surname, float baseSalary){
        gardeners.add(new Gardener(name, surname, baseSalary));
    }
}
