package com.federicotoluzzo.classi.es12;

import java.util.Scanner;

public class CLI {
    public static final String PROMPT =
            """
            |\tMenu principale
            |
            |\t1)\tAggiungi richiesta
            |\t2)\tLeggi richiesta
            |\t3)\tStampa tutte le richieste
            |
            |\t0)\tTermina il programma
            """;

    Coda c;

    public CLI() {
        c = new Coda(10);
    }

    /**
     * mostra le opzioni e sceglie correttamente gli input
     */

    public void start(){
        while(true){
            Scanner sc = new Scanner(System.in);
            int choice = 0;
            System.out.println(PROMPT);
            choice = sc.nextInt();
            switch (choice) {
                case 1 -> aggiungiRichiesta();
                case 2 -> leggiRichiesta();
                case 3 -> stampaTutto();
                case 0 -> System.exit(0);
            }
        }
    }

    /**
     * chiede nella riga di comando i dati e aggiunge una richiesta alla coda
     */
    private void aggiungiRichiesta(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Scrivi il nome e il cognome dell'utente che ha una richiesta, separati da uno spazio : ");
        String nome = sc.nextLine();
        System.out.println("Scrivi il codice fiscale dell'utente da aggiungere : 0");
        String codiceFiscale = sc.nextLine();

        Richiesta.Tipo tipoRichiesta = null;
        do{
            System.out.println("Scrivi il tipo di abbonamento dell'utente da aggiungere (iscrizione, cancellazione, lamentela) : ");
            String tipo = sc.nextLine();
            switch (tipo.toLowerCase()) {
                case "iscrizione" -> tipoRichiesta = Richiesta.Tipo.ISCRIZIONE;
                case "cancellazione" -> tipoRichiesta = Richiesta.Tipo.CANCELLAZIONE;
                case "lamentela" -> tipoRichiesta = Richiesta.Tipo.LAMENTELA;
                default -> System.out.println("Errore : Tipo di abbonamento non valido");
            }
        } while (tipoRichiesta == null);


        c.inserisci(new Richiesta(nome.split(" ")[0], nome.split(" ")[1], tipoRichiesta));
    }

    /**
     * stampa una richiesta
     */

    public void leggiRichiesta(){
        c.estrai().stampa();
    }

    /**
     * stampa tutte le richieste
     */

    public void stampaTutto(){
        c.stampa();
    }

}
