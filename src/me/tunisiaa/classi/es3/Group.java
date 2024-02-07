package me.tunisiaa.classi.es3;

import java.util.ArrayList;
import java.util.HashSet;

public class Group {
    private ArrayList<Person> group;
    private HashSet<String> codes;

    public Group(){
        group = new ArrayList<Person>();
    }

    /**
     * Aggiunge una persona al gruppo.
     *
     * @param  person una persona
     */
    public void addPerson(Person person){
        if(!codes.contains(person.getCode())){
            this.group.add(person);
            this.codes.add(person.getCode());
        }else{
            System.out.println("Esiste già una persona con quel codice fiscale. Non posso aggiungerne un'altra");
        }
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
        int age = Integer.parseInt(info[2]);
        String code = info[3];
        Person person = new Person(name, surname, age, code);
        this.group.add(person);
    }

    public void removePerson(String code){
        for(Person p : group){
            if(p.getCode().equals(code)){
                group.remove(p);
                return;
            }
        }
    }


    /**
     * Restituisce una persona se appartiene al gruppo, altrimenti null
     *
     * @param code codice fiscale della persona da cercare
     */

    public Person getPerson(String code){
        for(Person p : group){
            if(p.getCode().equals(code)){
                return p;
            }
        }
        return null;
    }


    /**
     * Restituisce una stringa contenente i dati di tutte le persone del gruppo, suddivise da linee di trattini
     */
    public String toString(){
        String s = "";
        for(Person p : group){
            s += "- - - - - - - - - - - - - - - - - - -\n";
            s += p.toString();
        }
        return s;
    }
}
