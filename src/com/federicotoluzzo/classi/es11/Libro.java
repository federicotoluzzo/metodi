package com.federicotoluzzo.classi.es11;

public class Libro {
    private String titolo;
    private String autore;
    private float prezzo;

    public Libro(String titolo, String autore, float prezzo) {
        this.titolo = titolo;
        this.autore = autore;
        this.prezzo = prezzo;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public float getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(float prezzo) {
        this.prezzo = prezzo;
    }

    public void stampa(){
        System.out.printf("Titolo : %s\nAutore : %s\nPrezzo : %s", titolo, autore, prezzo);
    }
}
/*
// Creare la classe Libro con gli attributi per rappresentare dei libri.
//I metodi sono: costruttore, get, set, stampa.
//Creare una classe PilaLibri gestita tramite ArrayList<Libro>.
//Inoltre aggiungere un attributo nMazElementi.
//(La Pila è LIMITATA).
//I metodi sono: inserimento, estrazione e la stampa.
