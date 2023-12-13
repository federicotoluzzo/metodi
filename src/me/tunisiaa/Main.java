package me.tunisiaa;

import java.awt.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;
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
//        stats(5);
//        int[] arr = new int[]{1, 2, 3, 4, 5};
//        printArr(arr);
//        invert(arr);
//        printArr(arr);
//        printArr(new double[]{10, 2, 4, 5, 7, 123, 6 ,3.1415926535});
//        printArr(datiElaborati(new double[]{10, 2, 4, 5, 7, 123, 6 ,3.1415926535}));
//        int[] arr = randomArray(200000000);
//        long t1 = System.currentTimeMillis();
//        System.out.println(contains(arr, 11));
//        long t2 = System.currentTimeMillis();
//        System.out.println(t2 - t1);
//        t1 = System.currentTimeMillis();
//        System.out.println(recursiveSearch(arr, 11));
//        t2 = System.currentTimeMillis();
//        System.out.println(t2 - t1);
//        System.out.println(fib(45));
//        int[] arr = {0, 5, -5, 6, 2, 8};
//        bubbleSort(arr);
//        printArr(arr);
//        System.out.println(find(arr, 5));
//        System.out.println(isPalindrome("itopinonavevanonipoti"));
//        System.out.println(codificaDiCesare("CI.AO"));
//        System.out.println(deCodificaDiCesare(codificaDiCesare("CIAO, PROFESSORE")));
//        System.out.println(rot13("HELLO"));
//        System.out.println(contaParole("Test conta parole.\nFrase a capo"));
//        System.out.println(metodo("asd", "abd"));
//        odotem();
    }
    public static int[] randomArray(int length){
        int[] arr = new int[length];
        Random r = new Random();
        for (int i = 0; i < length; i++) {
            arr[i] = r.nextInt();
        }
        return arr;
    }
    public static void printArr(int[] arr){
        for (int number : arr){
            System.out.print(number + " ");
        }
        System.out.println();
    }
    public static void printArr(double[] arr){
        for (double number : arr){
            System.out.print(number + " ");
        }
        System.out.println();
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

    /*Scrivere un programma Java che acquisisca da
    tastiera un vettore di interi di dimensione N e cal-
    coli minimo, massimo e media degli elementi.*/
    public static void stats(int n) {
        int[] vett = new int[n];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        double average = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Scrivi un numero : ");
            vett[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            average += vett[i]/(double) n;
            if(vett[i] < min){
                min = vett[i];
            }
            if(vett[i] > max){
                max = vett[i];
            }
        }
        System.out.printf("Min : %s | Max : %s | Average : %s", min, max, average);
    }

    /*Scrivere una funzione C/C++ che restituisca true,
    se un valore numerico intero positivo fornito
    come argomento è presente almeno una volta tra
    gli elementi di un vettore fornito anch'esso come
    argomento, false altrimenti.

    Scrivere un programma C++ che, utilizzando la
    funzione precedente e costruendo il vettore a
    partire da valori forniti da tastiera, visualizzi, in ri-
    sposta a singoli valori successivamente richiesti
    all'utente, «Vero» in caso di presenza nel vettore
    o «Falso» altrimenti (la richiesta terminerà in cor-
    rispondenza dell'inserimento del valore 0).*/

    public static boolean contains(int[] arr, int n){
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == n){
                return true;
            }
        }
        return false;
    }

    public static void nonSoComeChiamareQuestoMetodoHoFinitoLaCreatività(){
        Scanner sc = new Scanner(System.in);
        int input = 0;
        int[] vett = new int[10];
        System.out.println("Scrivi i 10 numeri da inserire nel vettore :");
        for (int i = 0; i < 10; i++) {
            vett[i] = sc.nextInt();
        }
        do{
            input = sc.nextInt();
            if(contains(vett, input)){
                System.out.println("Vero");
            }else{
                System.out.println("Falso");
            }
        }while(input != 0);
    }

    /*Scrivere una funzione C++ che inverta la posizio-
    ne degli elementi di un vettore di interi di cui sia
• fornita la dimensione (risolvere il problema senza
            usare vettori ulteriori). Scrivere un programma
    C++ che, dopo avere acquisito da tastiera un
    vettore di valori interi, lo visualizzi trasformato
    dall' invocazione della precedente funzione.*/

    public static void swap(int[] arr, int pos1, int pos2){
        int temp = arr[pos1];
        arr[pos1] = arr[pos2];
        arr[pos2] = temp;
    }

    public static void invert(int[] arr){
        for(int i = 0; i < arr.length/2; i++){
            swap(arr, i, arr.length - i - 1);
        }
    }

    /*Uno strumento di misura fornisce un dato ogni
minuto nell'arco di un'ora. Per ovviare a possibili
errori si vogliono elaborare i valori rilevati sosti-
tuendoli con una media a tre punti: ogni elemento
viene sostituito dalla media di sé stesso, dell'ele-
mento che lo precede e quello che lo segue; per i
due elementi estremi viene considerato due vol-
te il valore dell'elemento stesso e il successivo
o il precedente nel caso si tratti rispettivamente
del primo o dell'ultimo elemento. Realizzare un
programma C++ che implementi l'elaborazione
descritta acquisendo i dati da tastiera.*/


    public static double[] copyDoubleArray(double[] arr){
        double[] temp = new double[arr.length];
        for(int i = 0; i < arr.length; i++){
            temp[i] = arr[i];
        }
        return temp;
    }


    public static double threePointAverage(double[] arr, int pos){
        return (arr[pos - 1] + arr[pos] + arr[pos + 1]) / 3;
    }


    public static double[] datiElaborati(double[] arr){
        double[] tempArr = copyDoubleArray(arr);
        tempArr[0] = (arr[0] + arr[0] + arr[1]) / 3;
        tempArr[arr.length - 1] = (arr[arr.length - 1] + arr[arr.length - 1] + arr[arr.length - 2]) / 3;
        for (int i = 1; i < arr.length - 1; i++) {
            tempArr[i] = threePointAverage(arr, i);
        }
        return tempArr;
    }


/*Dato un vettore di valori numerici, scrivere una
funzione C++ che conti quanti elementi del vetto-
re sono compresi tra un valore minimo e un valo-
re massimo forniti come argomenti alla funzione
stessa insieme alla dimensione del vettore.


Scrivere un programma C++ che, utilizzando la fun-
zione precedente e costruendo il vettore a partire
da valori acquisiti da tastiera, visualizzi il risulta-
to del conteggio dopo avere richiesto all'utente i
valori minimo e massimo.*/


    public static int numeroCompresi(int[] arr, int min, int max){
        int counter = 0;
        for (int n : arr) {
            if(n >= min && n <= max){
                counter++;
            }
        }
        return counter;
    }


    public static int inputInt(){
        System.out.print("Scrivi un numero :");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
    public static void nomeMetodoCreativo(){
        int len;
        int min;
        int max;
        int input;
        System.out.print("Quanto lunga deve essere la lista?");
        len = inputInt();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = inputInt();
        }
        System.out.println("Scrivi il minimo");
        min = inputInt();
        System.out.println("Scrivi il massimo");
        max = inputInt();
        System.out.printf("%s numeri sono compresi tra %s e %s.",compresi(arr, min, max), min, max);
    }


/*Scrivere una funzione C/C++ che, a partire da un
vettore numerico di dimensione N fornito come
parametro, copi in un secondo vettore (anch'es-
       so fornito come parametro) i soli elementi del
primo vettore compresi tra un valore minimo a e
un valore massimo b (anch'essi argomenti della
       funzione): la funzione deve restituire la dimensio-
ne del secondo vettore. Scrivere un programma
C++ che, utilizzando la funzione precedente, vi-
sualizzi gli elementi del secondo vettore dopo
avere richiesto l'inserimento da tastiera dei valori
del primo vettore.*/


    public static int[] compresi(int[] arr, int min, int max){
        int len = 0;
        int[] temp1 = new int[1];
        int[] temp2;
        for (int n : arr) {
            if(n >= min && n <= max){
                temp2 = new int[++len];
                for (int i = 0; i < temp2.length; i++) {
                    try{
                        temp2[i] = temp1[i];
                    } catch (Exception e){


                    }
                }
                temp1 = new int[len];
                for (int i = 0; i < temp1.length; i++) {
                    try{
                        temp1[i] = temp2[i];
                    } catch (Exception e){


                    }
                }
                temp1[len - 1] = n;
            }
        }
        return temp1;
    }

    /*Scrivere una funzione C++ avente il seguente
    prototipo:
    void derive (float data[], int n, float difference[]);
    che, a parure dal vettore data di dimensione n, co-
    struisca il vettore difference contenente le diffe
    renze tra due elementi adiacenti del vettore data.
    Cioé il primo elemento di difference dovra esse
    re la differenza tra il secondo e il primo elemento
    di data, il secondo elemento di difference dovra
    essere la differenza tra terzo e il secondo ele-
    mento di data e cosi via. Scrivere un programma
    C++ che, utilizzando la funzione precedente e co-
    struendo il vettore a partire da valori acquisiti da
    tastiera, visualizzi il vettore risultato del calcolo.*/

    public static void derive(double data[], double difference[]){
        difference = new double[data.length - 1];
        for (int i = 0; i < difference.length; i++) {
            difference[i] = data[i + 1] - data[i];
        }
    }

    public static void inputDerive(){
        int len = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Quanto lungo deve essere l'array?");
        len = sc.nextInt();
        double[] arr = new double[len];
        double[] derive = new double[len - 1];
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextDouble();
        }
        printArr(derive);
    }
    /*Scrivere una funzione C++ avente il seguente
    * prototipo:
    float scalarProduct (loat all, float bl],
                         int N);
    dove N rappresenta la dimensione dei vettori a
    e b, che restituisca il prodotto scalare tra a e b,
    cioè la somma dei prodotti tra gli elementi corri-
    spondenti (il primo con il primo, il secondo con il
            secondo e così via) dei due vettori.*/
    double scalarProduct(double[] arr1, double[] arr2){
        double product = 0;
        for (int i = 0; i < arr1.length; i++) {
            product += arr1[i] * arr2[i];
        }
        return product;
    }

    /*Scrivere una funzione C/C++ che, a partire da un
    vettore di 12 numeri corrispondenti alle singole
    cifre di un codice a barre, restituisca la cifra di
    controllo calcolata con le regole illustrate.*/

    public static int controllo(int[] arr){
        int cifra = 0;
        for (int i = 0; i < arr.length; i++) {
            cifra += i % 2 == 0 ? arr[i] : arr[i] * 3;
        }
        return cifra % 10;
    }

    public static boolean recursiveSearch(int[] arr, int val){
        if(arr.length == 1){
            return arr[0] == val;
        }
        int[] firstHalf = new int[arr.length / 2];
        int[] secondHalf = new int[arr.length / 2];
        for (int i = 0; i < arr.length / 2; i++) {
            firstHalf[i] = arr[i];
            secondHalf[i] = arr[i + arr.length / 2];
        }
        return recursiveSearch(firstHalf, val) || recursiveSearch(secondHalf, val);
    }

    public static int fib(int pos){
        if(pos < 1){
            return 1;
        }
        return fib(pos - 1) + fib(pos - 2);
    }

    public static void bubbleSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if(arr[j] > arr[j + 1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    /*public static boolean find(int[] arr, int value){
        if(arr.length == 1){
            return arr[0] == value;
        }
        int start = arr[arr.length / 2] > value ? 0 : arr.length / 2;
        int end = arr[arr.length / 2] > value ? arr.length / 2 : arr.length;
        return find(arr, value, start, end);
    }
    public static boolean find(int[] arr, int value, int start, int end){
        if(end == start){
            return arr[start] == value;
        }
        int begin = arr[(end - start) / 2 + start] > value ? 0 : arr.length / 2 + 1;
        int finish = arr[(end - start) / 2 + start] > value ? arr.length / 2 + 1 : arr.length;
        return find(arr, value, begin, finish);
    }*/

    public static boolean find(int[] arr, int value){
        int begin = 0;
        int end = arr.length;
        for (int i = 0; begin != end; i++) {
            if(arr[(end - begin) / 2] > value){
                end = (end - begin) / 2 + begin;
            }else{
                begin += (end - begin) / 2;
            }
        }
        return arr[begin] == value;
    }

    /*Scrivere una funzione C/C++ che accettata come
    parametro una stringa s, ne calcoli il numero del-
    le consonanti o delle vocali sulla base di un altro
    opportuno parametro che indichi il tipo di con-
    teggio da effettuare (per esempio: «C» = conso-
    nanti, «V» = vocali).*/

    public static int contaVocali(String s, boolean vocali){
        char[] voc = {'a', 'e', 'i', 'o', 'u'};
        int counter = 0;
        if(vocali){
            for(char c : s.toCharArray()){
                boolean isVocale = false;
                for (char v: voc) {
                    if(c == v){
                        isVocale = true;
                    }
                }
                if(isVocale){
                    counter++;
                }
            }
        }else{
            for(char c : s.toCharArray()){
                boolean isVocale = false;
                for (char v: voc) {
                    if(c == v){
                        isVocale = true;
                    }
                }
                if(!isVocale){
                    counter++;
                }
            }
        }
        return counter;
    }

    /*Data una stringa di caratteri, scrivere una funzio-
    ne che verifichi se la stringa è o meno palindro-
    ma (cioè tale che, leggendo la stringa da sinistra
            verso destra o viceversa, si ottiene sempre la
                stessa sequenza di caratteri).*/

    public static boolean isPalindrome(String s){
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != s.charAt(s.length() - i - 1)){
                return false;
            }
        }
        return true;
    }

    /*Nel De bello gallico Giulio Cesare racconta di
    avere utilizzato un codice segreto per comuni-
    care in forma scritta con i propri generali: ogni
    singola lettera del messaggio veniva sostituita
    con la lettera che la seguiva nell'ordinamento al-
    fabetico (A - B, B - C, ...,Z → A), i simboli delle
    cifre numeriche e i segni di punteggiatura erano
    lasciati invariati. Scrivere due programmi C++: il
    primo deve codificare secondo la regola di Ce-
    sare una stringa di testo inserita dall'utente e vi-
    sualizzare il risultato, il secondo deve accettare
    una stringa segreta e decodificaria visualizzando
    il testo originale.*/

    public static String codificaDiCesare(String s){
        String cesare = "";
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) > 64 && s.charAt(i) < 90){
                cesare += (char)(s.charAt(i) + 1);
            }else if(s.charAt(i) == 'Z'){
                cesare += 'A';
            }else{
                cesare += s.charAt(i);
            }
        }
        return cesare;
    }

    public static String deCodificaDiCesare(String s){
        String cesare = "";
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) > 65 && s.charAt(i) < 91){
                cesare += (char)(s.charAt(i) - 1);
            }else if(s.charAt(i) == 'A'){
                cesare += 'Z';
            }else{
                cesare += s.charAt(i);
            }
        }
        return cesare;
    }

    /*Il ROT13 e una tecnica di codifica del testo ba-
    sata sulla sostituzione di ogni singolo carattere
    alfabetico con il carattere che lo segue esatta-
    mente di 13 posizioni nella sequenza alfabetica:
    se si supera la posizione della «Z» si prosegue
    riprendendo dalla «A». La FIGURA 10 illustra
    la codifica della parola «HELLO», che diviene
«URYYB»…
    Tenendo conto che lo stesso algoritmo si utilizza
    sia per la codifica sia per la decodifica, scrivere
    una funzione C/C++ che codifichi/decodifichi se-
    condo la regola ROT13 una stringa di testo.*/

    public static String rot13(String s){
        String rot13 = "";
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) > 64 && s.charAt(i) < 91){
                rot13 += (char)(65 + (s.charAt(i) - 65 + 13) % 26);
            }else{
                rot13 += s.charAt(i);
            }
        }
        return rot13;
    }

    /*Scrivere una funzione C/C++ che determini il nu-
    mero di parole presenti in una stringa tenendo
    conto dei vari caratteri di separazione (spazi,
    punteggiatura ecc.)*/

    public static int contaParole(String s){
        int parole = 1;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ' ' || s.charAt(i) == '\n'){ // gli spazi tanto si trovano sia dopo le virgole che dopo i punti quindi bastano quelli.
                parole++;
            }
        }
        return parole;
    }

    /*Scrivere una funzione C/C++ che abbia come pa-
    rametri due stringhe e restituisca:
            • -1 se la prima stringa precede in ordine alfabe-
    tico la seconda stringa;
• O se le due stringhe sono uguali;
• 1 se la seconda stringa precede in ordine alfa-
    betico la prima stringa.
    Scrivere un programma C++ che, dopo avere ri-
    chiesto all'utente l'inserimento da tastiera di tre
    stringhe, le visualizzi sullo schermo in ordine al-
    fabetico.*/

    public static int metodo(String s1, String s2){
        if(s1.equals(s2)) {
            return 0;
        }else{
            return s1.compareTo(s2) > 0 ? 1 : -1;
        }
    }

    public static void odotem(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Scrivi tre parole : ");
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String s3 = sc.nextLine();
        System.out.println(ordinaTreParole(s1, s2, s3));
    }
    public static String ordinaTreParole(String s1, String s2, String s3){
        String[] s = {s1, s2, s3};
        String ordinate = "";
        for (int i = 0; i < 3; i++) {
            for (int j = i; j < 3; j++) {
                if(metodo(s[i], s[j]) > 0){
                    String temp = s[i];
                    s[i] = s[j];
                    s[j] = temp;
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            ordinate += s[i] + " ";
        }
        return ordinate;
    }
    /*Restituire la somma di due matrici*/
    public static int[][] matrixSum(int[][] mat1, int[][] mat2){
        if(mat1.length != mat2.length || mat1[0].length != mat2[0].length){
            throw new IllegalArgumentException("Le matrici devono avere la stessa dimensione");
        }
        int[][] sum = new int[mat1.length][mat1[0].length];
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[0].length; j++) {
                sum[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        return sum;
    }
    /*Restituire la somma di due matrici*/
    public static int[][] matrixProduct(int[][] mat, int fact){
        int[][] product = new int[mat.length][mat[0].length];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                product[i][j] = mat[i][j] * fact;
            }
        }
        return product;
    }
    /*
    Es 14
    Scrivere una funzione C/C++ che restituisca il va-
    lore massimo di una matrice di dimensioni N x N
    fornita come argomento; la funzione deve fornire
    anche le coordinate (indice di riga e indice di co-
    lonna) di tale valore. Scrivere un programma C++
    che, utilizzando la funzione precedente, visualizzi
    il valore massimo e le relative coordinate di una
    matrice i cui elementi sono inseriti da tastiera.*/

    public static int[] findMax(int[][] mat){
        int max = 0;
        int posX = 0;
        int posY = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if(mat[i][j] > max){
                    max = mat[i][j];
                    posX = j;
                    posY = i;
                }
            }
        }
        return new int[]{max, posX, posY};
    }

    /*
    Es 15
    Scrivere una funzione C/C++ che determini, pro-
    ducendo come risultato true o false, se una ma-
    trice quadrata di N x N elementi è simmetrica,
    cioè se gli elementi in posizione simmetrica ri-
    spetto alla diagonale principale sono tutti uguali.*/

    public static boolean isSymmetric(int[][] mat){
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if(mat[i][j] != mat[mat.length - j - 1][mat[0].length - i - 1]){
                    return false;
                }
            }
        }
        return true;
    }

    /*
    Es 16 A
    Scrivere una funzione C/C++ che costruisca, in
    una matrice quadrata di N × N elementi passa-
    ta come argomento, la trasposta di una matrice
    quadrata di N × N elementi fornita anch'essa
    come argomento. La trasposta di una matrice*/

    public static void trasposta(int[][] mat1, int[][] mat2){
        if(mat1.length != mat2.length || mat1[0].length != mat2[0].length){
            throw new IllegalArgumentException("Le matrici devono avere la stessa dimensione");
        }
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[0].length; j++) {
                mat1[j][i] = mat2[i][j];
            }
        }
    }

    /*
    Es 16 B
    Scrivere un programma C++ che, utilizzando la
    funzione precedente e costruendo la matrice ini-
    ziale a partire da valori forniti da tastiera, visua-
    lizzi la matrice trasposta disponendo gli elementi
    su più righe.*/

    public static void userTrasposta(){
        final int DIM = 4;
        int[][] mat2 = new int[DIM][DIM];
        int[][] mat1 = new int[DIM][DIM];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < DIM; i++) {
            for (int j = 0; j < DIM; j++) {
                mat2[i][j] = sc.nextInt();
            }
        }
        trasposta(mat1, mat2);
        for (int i = 0; i < DIM; i++) {
            for (int j = 0; j < DIM; j++) {
                System.out.printf("%d ", mat1);
            }
            System.out.println();
        }
    }

    /*
    Es 17
    Un'area vulcanica viene monitorata dalla Prote-
    zione civile mediante alcuni sensori di tempe-
    ratura numerati (0, 1, 2, ...), che periodicamente
    forniscono una misura della temperatura del ter-
    reno in cui sono posizionati.
    Si intende realizzare un programma C++ che con-
    senta di inserire e memorizzare i valori di tem-
    peratura dei singoli sensori ogni volta che sono
    disponibili calcolandone i valori medio, minimo
    e massimo;.*/
    
    public static void temperature(int[][] data){
        double[] average = new double[data.length];
        double[] min = new double[data.length];
        double[] max = new double[data.length];
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[0].length; j++) {
                if(data[i][j] > max){
                    max[i] = data[i][j];
                }
                if(data[i][j] <min){
                    min[i] = data[i][j];
                }
            }
        }
    }
}
