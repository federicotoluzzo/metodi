package com.federicotoluzzo.classi.es3;

public class Person {
    private String name;
    private String surname;
    private int age;
    private String code;

    public Person(String name, String surname, int age, String code){
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.code = code;
    }

    /**
     * @param  data una stringa contenente tutti i dati della persona divisi da spazi
     */
    public Person(String data){
        String[] info = data.split(" ");
        name = info[0];
        surname = info[1];
        age = Integer.parseInt(info[2]);
        code = info[3];
    }

    /**
     * Restituisce una stringa contenente tutti i dati della persona suddivisi da \n.
     */
    public String toString(){
        String s = "";
        s += String.format("Nome : %s %s\n", name, surname);
        s += String.format("Età : %d\n", age);
        s += String.format("Codice Fiscale : %s\n", code);
        return s;
    }

    // getter e setter

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
