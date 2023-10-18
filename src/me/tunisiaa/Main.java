package me.tunisiaa;

import java.awt.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        count(1, 15);
//        System.out.println(cmd(5));
//        System.out.println(recursiveCMD(5));
//        System.out.println(multiples(5, 10));
//        hundred();
//        System.out.println(between(5, 10, 5));
//        System.out.println(recursiveMultiples(5, 10));
//        System.out.println(recursiveBetween(5, 10, 5));
//        System.out.println(popolazione(2000, 6000000000L, 1.01, 2023));
//        System.out.println(recursivePopolazione(2000, 6000000000L, 1.01, 2023));
//        System.out.println(velocita(20, 0.7493));
//        System.out.println(pendolo(1.2));
//        System.out.println(distanza(1, 1, 4, 5));
//        System.out.println(perimetro(1, 1, 4, 5, 1, 5));
//        int[] rgb = new int[]{128, 140, 55};
//        int[] cmy = toCMY(rgb);
//        System.out.printf("%s %s %s in RGB è uguale a %s %s %s in CMY\n", rgb[0], rgb[1], rgb[2], cmy[0], cmy[1], cmy[2]);
//        System.out.println(getMCD(24, 18));
//        System.out.printf("123 / 9 può essere semplificato a %s / %s.\n",simplify(123, 9)[0], simplify(123, 9)[1]);
//        System.out.println("Il primo intero maggiore di 3.141592654 è " + roundUp(3.141592654));
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
        double deltaX = Math.abs(x1 - x2);
        double deltaY = Math.abs(y1 - y2);
        return Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2));
    }

    public static double perimetro(double x1, double y1, double x2, double y2, double x3, double y3){
        double deltaX1 = Math.abs(x1 - x2);
        double deltaY1 = Math.abs(y1 - y2);
        double deltaX2 = Math.abs(x2 - x3);
        double deltaY2 = Math.abs(y2 - y3);
        double deltaX3 = Math.abs(x3 - x1);
        double deltaY3 = Math.abs(y3 - y1);
        double d1 = Math.sqrt(Math.pow(deltaX1, 2) + Math.pow(deltaY1, 2));
        double d2 = Math.sqrt(Math.pow(deltaX2, 2) + Math.pow(deltaY2, 2));
        double d3 = Math.sqrt(Math.pow(deltaX3, 2) + Math.pow(deltaY3, 2));
        return d1 + d2 + d3;
    }

    /*
    Esercizio 4
    Le macchine fotografiche digitali rappresentano i
    colori come combinazione del rosso, del verde e
    del blu: il colore di ogni singolo punto dell'imma-
    gine è rappresentato da un numero compreso tra
    0 e 255; le stampanti digitali rappresentano i co-
    lori come combinazione del celeste, del magen-
    ta e del giallo: anche in questo caso il colore di
    ogni singolo punto della stampa è rappresentato
    da un numero compreso tra 0 e 255. Le seguen-
    ti formule consentono di trasformare i colori dal
    sistema rosso/verde/blu nei colori del sistema
    celeste/magenta/giallo:
    Celeste = 255 - Rosso
            Magenta = 255 - Verde
    Giallo = 255 - Blu
    Scrivere una funzione C++ che determini le sin-
    gole componenti di un colore di stampa (celeste,
    magenta e giallo) a partire dalle singole compo-
    nenti di un colore fotografico (rosso, verde e blu).*/

    public static int[] toCMY(int[] rgb){
        int cyan = 255 - rgb[0];
        int magenta = 255 - rgb[1];
        int yellow = 255 - rgb[2];
        return new int[]{cyan, magenta, yellow};
    }

    /*Scrivere una funzione C++ che determini il MCD
            (massimo comune divisore) tra due numeri interi
    m ed n (con m > n) utilizzando il seguente algorit-
    mo attribuito ad Euclide:
            1) determinare il resto della divisione tra m ed n;
    2) se r è uguale a 0 terminare: il massimo comu-
    ne divisore tra m ed n è n;
    3) porre m uguale al valore di n;
    4) porre n uguale al valore di r e riprendere dal
    passo 1.
    Scrivere un programma C++ che calcoli il MCD
    tra due numeri forniti in input utilizzando la fun-
    zione precedente.*/

    public static int getMCD(int a, int b){
        int r = 0;
        do{
            r = a % b;
            if(r == 0){
                return b;
            }
            a = b;
            b = r;
        } while(r != 0);
        return b;
    }

    /*Scrivere una funzione C++ che, a partire dal va-
    lore di due parametri interi che rappresentano
    rispettivamente il numeratore e il denominatore
    di una frazione, li modifichi in modo da rendere la
    frazione risultante ridotta ai minimi termini?.*/

    public static int[] simplify(int numerator, int denominator){
        int fractionMCD = getMCD(numerator, denominator);
        return new int[]{numerator / fractionMCD, denominator / fractionMCD};
    }

    /*Scrivere una funzione C++ che aggiorni il valore
    di una variabile numerica non intera fornita come
    argomento al valore dell'intero più prossimo.*/

    public static int roundUp(double d){
        return ((int) d) + 1;
    }
}