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

    /* ricerca, probabilmente sostituito da stringaUtente()

    public Utente getUtente(String cf){
        for(Utente u : utenti){
            if(u.getCodiceFiscale() == cf){
                return u;
            }
        }
        return null;
    }*/

    /**
     *
     * @param utente utente da aggiungere alla palestra
     * @return vero se l'utente è stato aggiunto, altrimenti falso
     */

    public boolean aggiungi(Utente utente){
        for(Utente u : utenti){
            if(u.getCodiceFiscale() == utente.getCodiceFiscale()){
                return false;
            }
        }
        utenti.add(utente);
        return true;
    }

    /**
     *
     * @param cf codice fiscale dell'utente da modificare
     * @param abbonamento abbonamento con cui sostituire il precedente
     * @return vero se l'utente viene modificato, falso altrimenti
     */

    public boolean modificaAbbonamento(String cf, Abbonamento abbonamento){
        for(Utente u : utenti){
            if(u.getCodiceFiscale() == cf){
                u.setAbbonamento(abbonamento);
                return true;
            }
        }
        return false;
    }

    /**
     *
     * @param cf codice fiscale dell'utente da modificare
     * @param nuovoNome nome e cognome con cui sostituire i precedenti
     * @return vero se l'utente viene modificato, falso altrimenti
     */

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

    /**
     *
     * @param cf codice fiscale dell'utente da eliminare
     * @return vero se l'utente è stato eliminato, falso altrimenti
     */

    public boolean elimina(String cf){
        for(Utente u : utenti){
            if(u.getCodiceFiscale() == cf){
                utenti.remove(u);
                return true;
            }
        }
        return false;
    }

    /**
     *
     * @param cf codice fiscale dell'utente da visualizzare
     * @return una stringa contenente i dati dell'utente con il codice fiscale cf
     */

    public String stringaUtente(String cf){
        for(Utente u : utenti){
            if(u.getCodiceFiscale() == cf){
                System.out.println(u.toString());
            }
        }
        return "Utente non trovato";
    }

    /**
     *
     * @return I dati di tutti gli utenti
     */

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
