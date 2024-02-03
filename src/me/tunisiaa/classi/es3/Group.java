package me.tunisiaa.classi.es3;

import java.util.ArrayList;

public class Group {
    private ArrayList<Person> group;

    public Group(){
        group = new ArrayList<Person>();
    }

    public void addPerson(Person p){
        this.group.add(p);
    }

    public String toString(){
        String s = "";
        for(Person p : group){
            s += "- - - - - - - - - - - - - - - - - - -\n";
            s += p.toString();
            s += "\n";
        }
        return s;
    }
}
