package me.tunisiaa.classi.es4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Warehouse storage = new Warehouse();
        Scanner sc = new Scanner(System.in);
        while(true){
            printMenu();
            switch(Integer.parseInt(sc.nextLine())){
                case 0 -> System.exit(0);
                case 1 -> {
                    System.out.println("Scrivi i dati del tuo prodotto in questo modo : nome, descrizione, prezzo, quantità : ");
                    String[] dati = sc.nextLine().split(", ");
                    storage.addItem(dati[0], dati[1], Float.parseFloat(dati[2]), Integer.parseInt(dati[3]));
                }
                case 2 -> {
                    System.out.println("Scrivi il codice del prodotto da rimuovere.");
                    System.out.println(storage.removeItem(sc.nextInt()) ? "Prodotto rimosso con successo!" : "Non ci sono prodotti con quel codice.");
                }
                case 3 -> {
                    System.out.println("Scrivi il codice del prodotto da modificare.");
                    int id = sc.nextInt();
                    System.out.println("Vuoi modificare il prezzo (P) o la quantità (Q)?");
                    if(sc.nextLine().charAt(0) == 'P'){
                        System.out.println("Scrivi il nuovo prezzo del prodotto");
                        System.out.println(storage.editItemPrice(id, Float.parseFloat(sc.nextLine())) ? "Prodotto modificato con successo!" : "Non ci sono prodotti con quel codice.");
                    }else{
                        System.out.println("Scrivi la nuova quantità del prodotto");
                        System.out.println(storage.editItemQuantity(id, Integer.parseInt(sc.nextLine())) ? "Prodotto modificato con successo!" : "Non ci sono prodotti con quel codice.");
                    }
                }
                case 4 -> {
                    System.out.println("Scrivi il codice del prodotto da visualizzare.");
                    System.out.println(storage.getItem(sc.nextInt()));
                }
                case 5 -> System.out.println(storage.toString());
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
