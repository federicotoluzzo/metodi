package com.federicotoluzzo.classi.es10;

import java.util.Scanner;

public class InterfacciaGrafica {
    public Palestra palestra;

    public static final String PROMPT =
            "|\tMenu principale\n|\n" +
            "|\t1)\tAggiungi utente\n" +
            "|\t2)\tRimuovi utente\n" +
            "|\t3)\tModifica nome e cognome utente\n" +
            "|\t4)\tModifica abbonamento utente\n" +
            "|\t5)\tStampa utente\n" +
            "|\t6)\tStampa tutti gli utenti\n|\n" +
            "|\t0)\tTermina il programma\n";

    public InterfacciaGrafica() {
        palestra = new Palestra();
    }

    public void start(){
        while(true){
            Scanner sc = new Scanner(System.in);
            int choice = 0;
            System.out.println(PROMPT);
            choice = sc.nextInt();
            switch (choice) {
                case 1 -> aggiungiUtente();
                case 2 -> elimina();
                case 3 -> modificaNomeCognome();
                case 4 -> modificaAbbonamento();
                case 5 -> stampaUtente();
                case 6 -> stampaTutto();
                case 0 -> System.exit(0);
            }
        }
    }
    private void aggiungiUtente(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Scrivi il nome e il cognome dell'utente da aggiungere, separati da uno spazio : ");
        String nome = sc.nextLine();
        System.out.println("Scrivi il codice fiscale dell'utente da aggiungere : 0");
        String codiceFiscale = sc.nextLine();

        Palestra.Abbonamento abbonamento = null;
        do{
            System.out.println("Scrivi il tipo di abbonamento dell'utente da aggiungere (Gold, Silver, Bronze, Prova Gratuita) : ");
            String tipo = sc.nextLine();
            switch (tipo.toLowerCase()) {
                case "gold" -> abbonamento = Palestra.Abbonamento.GOLD;
                case "silver" -> abbonamento = Palestra.Abbonamento.SILVER;
                case "bronze" -> abbonamento = Palestra.Abbonamento.BRONZE;
                case "prova gratuita" -> abbonamento = Palestra.Abbonamento.TRIAL;
                default -> System.out.println("Errore : Tipo di abbonamento non valido");
            }
        } while (abbonamento == null);


        palestra.aggiungi(new Utente(nome.split(" ")[0], nome.split(" ")[1], codiceFiscale, abbonamento));
    }

    private void modificaAbbonamento(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Scrivi il codice fiscale dell'utente di cui modificare l'abbonamento : ");
        String codiceFiscale = sc.nextLine();
        Palestra.Abbonamento abbonamento = null;
        do{
            System.out.println("Scrivi l'abbonamento con cui sostituire quello precedente : ");
            String tipo = sc.nextLine();
            switch (tipo.toLowerCase()) {
                case "gold" -> abbonamento = Palestra.Abbonamento.GOLD;
                case "silver" -> abbonamento = Palestra.Abbonamento.SILVER;
                case "bronze" -> abbonamento = Palestra.Abbonamento.BRONZE;
                case "prova gratuita" -> abbonamento = Palestra.Abbonamento.TRIAL;
                default -> System.out.println("Errore : Tipo di abbonamento non valido");
            }
        } while (abbonamento == null);
        if(!palestra.modificaAbbonamento(codiceFiscale, abbonamento)){
            System.out.println("L'utente non è stato modificato perchè non esiste.");
        }
    }

    private void modificaNomeCognome(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Scrivi il codice fiscale dell'utente di cui modificare il nome e cognome : ");
        String codiceFiscale = sc.nextLine();
        System.out.println("Scrivi il nuovo nome e cognome separati da uno spazio : ");
        String nomeCognome = sc.nextLine();
        if(!palestra.modificaNomeCognome(codiceFiscale, nomeCognome)){
            System.out.println("L'utente non è stato modificato perchè non esiste.");
        }
    }

    public void elimina(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Scrivi il codice fiscale dell'utente da eliminare : ");
        String codiceFiscale = sc.nextLine();
        if(!palestra.elimina(codiceFiscale)){
            System.out.println("L'utente non esiste.");
        }
    }


    public void stampaUtente(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Scrivi il codice fiscale dell'utente da visualizzare : ");
        String codiceFiscale = sc.nextLine();
        System.out.println(palestra.stringaUtente(codiceFiscale));
    }

    public void stampaTutto(){
        System.out.println(palestra.stringaUtenti());
    }
}
