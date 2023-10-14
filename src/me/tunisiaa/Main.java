package me.tunisiaa;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //count(1, 15);
        //System.out.println(cmd(5));
        //System.out.println(recursiveCMD(5));
        //System.out.println(multiples(5, 10));
        //hundred();
        //System.out.println(between(5, 10, 5));
        //System.out.println(recursiveMultiples(5, 10));
        //System.out.println(recursiveBetween(5, 10, 5));
//        System.out.println(popolazione(2000, 6000000000L, 1.01, 2023));
//        System.out.println(recursivePopolazione(2000, 6000000000L, 1.01, 2023));
        System.out.println(velocita(20, 0.7493));
        System.out.println(pendolo(1.2));
    }

    public static void count(int n, int m) {
        System.out.println(n);
        if (n != m) {
            count(n + 1, m);
        }
    }

    public static boolean cmd(int n) {
        String val;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            val = sc.nextLine();
            if (val.equals("exit")) {
                return true;
            }
        }
        return false;
    }

    public static boolean recursiveCMD(int n) {
        if (n == 0) {
            return false;
        }
        String val;
        Scanner sc = new Scanner(System.in);
        val = sc.nextLine();
        if (val.equals("exit")) {
            return true;
        }
        return recursiveCMD(n - 1);
    }

//    Esercizio 9
//    Progettare un algoritmo che, dato un valore nu-
//    merico k, legga n numeri e conti quanti di questi
//    sono multipli di k scrivendo il risultato.

    public static int multiples(int k, int n) {
        Scanner sc = new Scanner(System.in);
        int val;
        int multiples = 0;
        for (int i = 0; i < n; i++) {
            val = sc.nextInt();
            if (val % k == 0) {
                multiples++;
            }
        }
        return multiples;
    }

    public static int recursiveMultiples(int k, int n) {
        if (n == 0) {
            return 0;
        }
        Scanner sc = new Scanner(System.in);
        int val;
        val = sc.nextInt();
        return ((val % k == 0) ? 1 : 0) + recursiveMultiples(k, n - 1);
    }

//    Esercizio 10
//    Progettare un algoritmo che legga una sequenza
//    di valori numerici fino a che la loro somma è mi-
//    nore di 100 e scriva la somma ottenuta e quanti
//    sono i valori letti.

    public static void hundred() {
        int val = 0;
        int sum = 0;
        int i = 0;
        Scanner sc = new Scanner(System.in);
        while (sum + val < 100) {
            sum += val;
            val = sc.nextInt();
            i++;
        }
        System.out.println("The sum of the " + (i - 1) + " numbers given is " + sum);
    }

    /*  Esercizio 11
        I Progettare un algoritmo che, dati due valori nu-
        merici h e k, legga n valori e conti quanti di essi
        sono compresi tra h e k scrivendo il risultato.
    */
    public static int between(int h, int k, int n) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int val;
        for (int i = 0; i < n; i++) {
            val = sc.nextInt();
            if (val > h && val < k) {
                sum++;
            }
        }
        return sum;
    }

    public static int recursiveBetween(int h, int k, int n) {
        if (n == 0) {
            return 0;
        }
        Scanner sc = new Scanner(System.in);
        int val;
        val = sc.nextInt();
        if (val > h && val < k) {
            return recursiveBetween(h, k, n - 1) + 1;
        }
        return recursiveBetween(h, k, n - 1);
    }

//    L'accrescimento della popolazione umana è gui-
//    dato da una semplice legge matematica: l'incre-
//    mento della popolazione tra un anno e il succes-
//    sivo è dato dal prodotto di una costante (il tasso
//di accrescimento) per la dimensione della popo-
//    lazione. Realizzare l'algoritmo che consente di
//    simulare anno per anno i valori della dimensione
//    della popolazione a partire da:
//            • l'anno iniziale della simulazione;
//            • il valore della dimensione iniziale della popolazione;
//            • il valore del tasso di accrescimento;
//            • l'anno finale della simulazione.

    public static long popolazione(int annoIniziale, long popolazioneIniziale, double k, int annoFinale) {
        long popolazioneFinale = popolazioneIniziale;
        int deltaTime = annoFinale - annoIniziale;
        for(int i = 0; i < deltaTime; i++){
            popolazioneFinale *= k;
        }
        return popolazioneFinale;
    }

    public static long recursivePopolazione(int annoIniziale, long popolazioneIniziale, double k, int annoFinale) {
        long popolazioneFinale = popolazioneIniziale;
        if(annoIniziale == annoFinale){
            return popolazioneFinale;
        }
        return (long) (recursivePopolazione(annoIniziale + 1, popolazioneIniziale, k, annoFinale)*k);
    }

    /*Il tachimetro per biciclette determina la velocità
    espressa in metri/minuto a partire dal numero g
    di giri della ruota conteggiati in un periodo di 10 s
    in base alla seguente formula:
    v = 3,1416 - d • g • 6
    dove d è il diametro della ruota espresso in metri.
    Scrivere una funzione C++ che, a partire dal dia-
    metro della ruota e dal numero di giri conteggiati in
    10 s. determini la velocità in km/h della bicicletta.*/

    public static double velocita(int giri, double diametro){
        return Math.PI * diametro * giri * 6 / 1000 * 60;
    }

    /*Un pendolo oscilla con un periodo P espresso in
    secondi che è funzione della lunghezza / in metri del
    filo di sospensione secondo la seguente formula:
    dove la costante g è l'accelerazione di gravità, che
    sulla Terra vale 9,8 m/s?. Scrivere una funzione C++
    che determini la lunghezza di un pendolo, dato
    come parametro il periodo con cui deve oscillare.*/

    public static double pendolo(double p){
        return p*p*Math.TAU*Math.TAU/9.8;
    }

    /*Scrivere una funzione C++ che, a partire dalle
    coordinate cartesiane di due punti, ne calcoli la
    distanza.


    Scrivere un programma C++ che, dopo
    avere richiesto all'utente le coordinate di tre pun-
    ti nel piano cartesiano, calcoli il perimetro del
    triangolo avente i tre punti come vertici.*/

    public static double distanza(double x1, double y1, double x2, double y2){

    }
}