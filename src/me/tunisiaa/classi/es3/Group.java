package me.tunisiaa.classi.es3;

import java.util.ArrayList;

public class Group {
    private ArrayList<Person> group;

    public Group(){
        group = new ArrayList<Person>();
    }

    /**
     * Aggiunge una persona al gruppo.
     *
     * @param  person una persona
     */
    public void addPerson(Person person){
        this.group.add(person);
    }

    /**
     * Aggiunge una persona al gruppo.
     *
     * @param  name nome della persona
     * @param  surname cognome della persona
     * @param  age età della persona
     * @param  code codice fiscale della persona
     */
    public void addPerson(String name, String surname, int age, String code){
        Person person = new Person(name, surname, age, code);
        this.group.add(person);
    }

    /**
     * Aggiunge una persona al gruppo.
     *
     * @param  data una stringa contenente tutti i dati della persona divisi da spazi
     */
    public void addPerson(String data){
        String[] info = data.split(" ");
        String name = info[0];
        String surname = info[1];
        int age = Integer.parseInt(info[0]);
        String code = info[3];
        Person person = new Person(name, surname, age, code);
        this.group.add(person);
    }

    public Person getPerson(String code){
        for(Person p : group){
            if(p.getCode().equals(code)){
                return p;
            }
        }
        return null;
    }

    public String toString(){
        String s = "";
        for(Person p : group){
            s += "- - - - - - - - - - - - - - - - - - -\n";
            s += p.toString();
        }
        return s;
    }
}
