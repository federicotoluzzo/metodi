package com.federicotoluzzo.classi.es12;

import java.util.Date;

public class Richiesta {
    private String nome;
    private String cognome;
    private Tipo tipoRichiesta;
    private long data;

    enum Tipo {
        ISCRIZIONE,
        CANCELLAZIONE,
        LAMENTELA
    }

    public Richiesta(String nome, String cognome, Tipo tipoRichiesta) {
        this.nome = nome;
        this.cognome = cognome;
        this.tipoRichiesta = tipoRichiesta;
        this.data = System.currentTimeMillis();
    }

    public void stampa(){
        System.out.printf("\tNome:\t%s\n\tCognome:\t%s\n\tTipo richiesta:\t%s\t\nData:\t%s\n", nome, cognome, tipoRichiesta, new Date(data));
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public Tipo getTipoRichiesta() {
        return tipoRichiesta;
    }

    public void setTipoRichiesta(Tipo tipoRichiesta) {
        this.tipoRichiesta = tipoRichiesta;
    }

    public long getData() {
        return data;
    }

    public void setData(long data) {
        this.data = data;
    }
}

/*
Creare una classe Richiesta con i seguenti attributi:
-nome, cognome, tipoRichiesta, data
I metodi della classe Richiesta: costruttore, stampa, get, set
La Coda è limitata al massimo numero di elementi.
*/