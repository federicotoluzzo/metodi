package com.federicotoluzzo.classi.es13;
import com.federicotoluzzo.classi.es10.Palestra.Abbonamento;

public class Utente {
    private String nome;
    private String cognome;
    private String codiceFiscale;

    private Utente prossimoUtente;

    /**
     *
     * @param nome nome dell'utente
     * @param cognome cognome dell'utente
     * @param codiceFiscale codice fiscale dell'utente
     */

    public Utente(String nome, String cognome, String codiceFiscale) {
        this.nome = nome;
        this.cognome = cognome;
        this.codiceFiscale = codiceFiscale;
    }

    /**
     *
     * @return tutti i dati dell'utente in forma di stringa formattata
     */

    public String toString() {
        String res = "Nome: " + nome + "\n";
        res += "Cognome: " + cognome + "\n";
        res += "CodiceFiscale: " + codiceFiscale + "\n";
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

    public Utente getProssimoUtente() {
        return prossimoUtente;
    }

    public void setProssimoUtente(Utente prossimoUtente) {
        this.prossimoUtente = prossimoUtente;
    }

    /*    I metodi della classe Utente sono:
            -costruttore, i metodi get, i metodi set, stampa*/
}
