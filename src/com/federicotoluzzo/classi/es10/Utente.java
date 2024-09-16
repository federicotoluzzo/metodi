package com.federicotoluzzo.classi.es10;
import com.federicotoluzzo.classi.es10.Palestra.Abbonamento;

public class Utente {
    private String nome;
    private String cognome;
    private String codiceFiscale;
    private Abbonamento abbonamento;

    public Utente(String nome, String cognome, String codiceFiscale, Abbonamento abbonamento) {
        this.nome = nome;
        this.cognome = cognome;
        this.codiceFiscale = codiceFiscale;
        this.abbonamento = abbonamento;
    }

    public String toString() {
        String res = "Nome: " + nome + "\n";
        res += "Cognome: " + cognome + "\n";
        res += "CodiceFiscale: " + codiceFiscale + "\n";
        res += "Abbonamento: ";
        res += switch(abbonamento){
            case GOLD -> "Gold";
            case SILVER -> "Silver";
            case BRONZE -> "Bronze";
            case TRIAL -> "Periodo di prova";
        };
        res += "\n";
        return res;
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

    public String getCodiceFiscale() {
        return codiceFiscale;
    }

    public void setCodiceFiscale(String codiceFiscale) {
        this.codiceFiscale = codiceFiscale;
    }

    public Palestra.Abbonamento getAbbonamento() {
        return abbonamento;
    }

    public void setAbbonamento(Palestra.Abbonamento abbonamento) {
        this.abbonamento = abbonamento;
    }

    /*    I metodi della classe Utente sono:
            -costruttore, i metodi get, i metodi set, stampa*/
}
