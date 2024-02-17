package me.tunisiaa.classi.es4;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Storage storage = new Storage();
        Scanner sc = new Scanner(System.in);
        while(true){
            printMenu();
            switch(sc.nextInt()){
                case 0 -> System.exit(0);
                case 1 -> {
                    System.out.println("Scrivi i dati del tuo prodotto in questo modo : nome, descrizione, prezzo, quantità : ");
                    String[] dati = sc.nextLine().split(", ");
                    storage.addItem(dati[0], dati[1], dati[2], dati[3]);
                };
                case 2 -> System.exit(0);
                case 3 -> System.exit(0);
                case 4 -> System.exit(0);
                case 5 -> System.exit(0);
            }
        }
    }

    public static void printMenu(){
        System.out.println("\t\tCosa vuoi fare?\n");
        System.out.println("\t1.\tAggiungi prodotto.");
        System.out.println("\t2.\tRimuovi prodotto.");
        System.out.println("\t3.\tModifica prodotto.");
        System.out.println("\t4.\tControlla prodotto.");
        System.out.println("\t5.\tMostra tutti i prodotti.");
        System.out.println("\t0.\tEsci.");
    }
}
