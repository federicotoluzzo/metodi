package me.tunisiaa.classi.es3;

public class Person {
    private String nome;
    private String cognome;
    private int eta;
    private String codice;

    public Person(String nome, String cognome, int eta, String codice){
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
        this.codice = codice;
    }

    public String toString(){
        String s = "";
        s += String.format("Nome : %s %s\n", nome, cognome);
        s += String.format("Età : %d\n", eta);
        s += String.format("Codice Fiscale : %s\n", codice);
        return s;
    }
}
