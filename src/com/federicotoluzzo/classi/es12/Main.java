package com.federicotoluzzo.classi.es12;

public class Main {
    public static void main(String[] args) {
        CLI cli = new CLI();
        cli.start();
    }
}

/*
Creare una classe Coda per gestire le richieste degli utenti di una palestra.
La coda è gestita tramite arrayList<Richiesta> e inoltre è presente anche l'attributo maxNumeroElementi.

I metodi della classe sono: inserisci, estrai, stampa.

Creare una classe Richiesta con i seguenti attributi:
-nome, cognome, tipoRichiesta, data
I metodi della classe Richiesta: costruttore, stampa, get, set
La Coda è limitata al massimo numero di elementi.

Creare un menu da riga di comando per gestire la Coda (funzione di inserimento, estrazione, stampa).
 */