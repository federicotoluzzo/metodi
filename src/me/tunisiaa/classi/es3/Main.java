package me.tunisiaa.classi.es3;

import java.util.Scanner;

public class Main { public static void main(String[] args) {
        String menu = "\n\t\t- - - MENU - - -\n\n\t1)\tAggiungi una persona.\n\t2)\tRimuovi una persona.\n\t3)\tStampa tutto il gruppo.\n\t4)\tStampa una persona.\n\t0)\tEsci.";
        Group g = new Group();
        System.out.println(menu);
        Scanner s = new Scanner(System.in);
        while(true){
            System.out.println(menu);
            switch(s.nextInt()){
                case 1:
                    System.out.println("Scrivi, divisi da spazi, nome, cognome, età e codice fiscale della persona da aggiungere.");
                    System.out.println("Esempio : Mario Rossi 69 A123A123A123");
                    Scanner sc1 = new Scanner(System.in);
                    g.addPerson(sc1.nextLine());
                    break;
                case 2:
                    System.out.println("Scrivi, il codice fiscale della persona da rimuovere");
                    Scanner sc2 = new Scanner(System.in);
                    g.removePerson(sc2.nextLine());
                    break;
                case 3:
                    System.out.println(g);
                    break;
                case 4:
                    System.out.println("Scrivi, il codice fiscale della persona da Stampare");
                    Scanner sc3 = new Scanner(System.in);
                    System.out.println(g.getPerson(sc3.nextLine()));
                    break;
                case 0:
                    System.exit(0);
                default:
                    continue;
            }
        }
    }
}
