package com.federicotoluzzo.classi.es12;

import java.util.ArrayList;

public class Coda extends ArrayList<Richiesta> {
    public int maxNumeroElementi;

    public Coda(int maxNumeroElementi) {
        this.maxNumeroElementi = maxNumeroElementi;
    }

    public boolean inserisci(Richiesta richiesta) {
        if(size() < maxNumeroElementi) {
            add(richiesta);
            return true;
        }
        return false;
    }

    public Richiesta estrai(){
        Richiesta r = get(0);
        remove(0);
        return r;
    }

    public void stampa(){
        for (Richiesta r : this){
            r.stampa();
            System.out.println();
        }
    }
}

/*
Creare una classe Coda per gestire le richieste degli utenti di una palestra.
La coda è gestita tramite arrayList<Richiesta> e inoltre è presente anche l'attributo maxNumeroElementi.

I metodi della classe sono: inserisci, estrai, stampa.
 */