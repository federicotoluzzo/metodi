package com.federicotoluzzo.classi.es10;

import java.util.ArrayList;

public class Palestra{
    enum Abbonamento{
        GOLD,
        SILVER,
        BRONZE,
        TRIAL
    }
    private ArrayList<Utente> utenti;

    public Palestra(){
        utenti = new ArrayList<>();
    }

    public Utente getUtente(String cf){
        for(Utente u : utenti){
            if(u.getCodiceFiscale() == cf){
                return u;
            }
        }
        return null;
    }

    public boolean aggiungi(Utente utente){
        for(Utente u : utenti){
            if(u.getCodiceFiscale() == utente.getCodiceFiscale()){
                return false;
            }
        }
        utenti.add(utente);
        return true;
    }

    public boolean modificaAbbonamento(String cf, Abbonamento abbonamento){
        for(Utente u : utenti){
            if(u.getCodiceFiscale() == cf){
                u.setAbbonamento(abbonamento);
                return true;
            }
        }
        return false;
    }

    public boolean modificaNomeCognome(String cf, String nuovoNome){
        for(Utente u : utenti){
            if(u.getCodiceFiscale() == cf){
                u.setNome(nuovoNome.split(" ")[0]);
                u.setCognome(nuovoNome.split(" ")[1]);
                return true;
            }
        }
        return false;
    }

    public boolean elimina(String cf){
        for(Utente u : utenti){
            if(u.getCodiceFiscale() == cf){
                utenti.remove(u);
                return true;
            }
        }
        return false;
    }

    public String stringaUtente(String cf){
        for(Utente u : utenti){
            if(u.getCodiceFiscale() == cf){
                System.out.println(u.toString());
            }
        }
        return "Utente non trovato";
    }

    public String stringaUtenti(){
        String stringaUtenti = "";
        for(Utente u : utenti){
            stringaUtenti += u.toString() + "\n\n";
        }
        return stringaUtenti;
    }
}
/*
    I metodi della classe Palestra sono:
            -costruttore, ricerca, aggiungi, modifica, elimina, stampaUtente, stampaTutti.
*/
