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
    }

    public static void count(int n, int m) {
        System.out.println(n);
        if(n != m){
            count(n + 1, m);
        }
    }

    public static boolean cmd(int n){
        String val;
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < n; i++){
            val = sc.nextLine();
            if(val.equals("exit")){
                return true;
            }
        }
        return false;
    }

    public static boolean recursiveCMD(int n){
        if(n == 0){
            return false;
        }
        String val;
        Scanner sc = new Scanner(System.in);
        val = sc.nextLine();
        if(val.equals("exit")){
            return true;
        }
        return recursiveCMD(n - 1);
    }

//    Esercizio 9
//    Progettare un algoritmo che, dato un valore nu-
//    merico k, legga n numeri e conti quanti di questi
//    sono multipli di k scrivendo il risultato.

    public static int multiples(int k, int n){
        Scanner sc = new Scanner(System.in);
        int val;
        int multiples = 0;
        for(int i = 0; i < n; i++){
            val = sc.nextInt();
            if(val % k == 0){
                multiples++;
            }
        }
        return multiples;
    }

    public static int recursiveMultiples(int k, int n){
        if(n == 0){
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

    public static void hundred(){
        int val = 0;
        int sum = 0;
        int i = 0;
        Scanner sc = new Scanner(System.in);
        while(sum + val < 100){
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
    public static int between(int h, int k, int n){
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int val;
        for(int i = 0; i < n; i++){
            val = sc.nextInt();
            if(val > h && val < k){
                sum++;
            }
        }
        return sum;
    }

    public static int recursiveBetween(int h, int k, int n){
        if(n == 0){
            return 0;
        }
        Scanner sc = new Scanner(System.in);
        int val;
        val = sc.nextInt();
        if(val > h && val < k){
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

    public static int popolazione(){

    }
}

