package com.federicotoluzzo.classi.irlanda;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Stack;
import java.util.concurrent.TimeUnit;

public class Irlanda {
    private String[] città = {"Dublino", "Belfast", "Galway", "Cork", "Waterford", "Londonderry", "Limerick"};
    private int[][] distanze = {
            {0, 168, 207, 253, 165, 0, 176},
            {168, 0, 0, 0, 0, 113, 0},
            {207, 0, 0, 0, 0, 0, 0},
            {253, 0, 0, 0, 0, 0, 99},
            {165, 0, 0, 0, 0, 0, 0},
            {0, 113, 0, 0, 0, 0, 0},
            {176, 0, 0, 99, 0, 0, 0}
    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Irlanda ir = new Irlanda();
        while(true){
            for (int i = 0; i < ir.città.length; i++) {
                System.out.printf("%s : %d\n", ir.città[i], i);
            }
            System.out.println("Tra che città vuoi calcolare il percorso? Indica i numeri separati da uno spazio. Per uscire, digitare qualsiasi altra cosa");
            String dati = sc.nextLine();
            int start = -1;
            int end = -1;
            try{
                start = Integer.parseInt(dati.split(" ")[0]);
                end = Integer.parseInt(dati.split(" ")[1]);
            } catch (Exception e){
                System.out.println("Grazie per aver usato questo programma :)");
                System.exit(0);
            }

            System.out.println();
            ir.printDistance(start, end);
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println();
            System.out.println();
        }
    }

    public void printDistance(int start, int end){
        String[] nodi = new String[this.distanze.length];
        int distanza = 0;
        int[] u = new int[this.distanze.length];  //vettore u
        for(int i = 0;i < u.length;i = i + 1){
            u[i] = -1;
        }
        for(int i = 0;i < nodi.length;i = i + 1){
            nodi[i] = "NV";
        }
        int [] pesi = new int[this.distanze.length];
        for(int i = 0; i < pesi.length; i = i + 1){
            pesi[i] = 1000000;
        }
        pesi[start]=0;
        while(true) {
            int min = -1;
            for (int i = 0; i < pesi.length; i = i + 1) {
                if ((min == -1) && (nodi[i].equals("NV"))) {
                    min = i;
                } else {
                    if ((nodi[i].equals("NV"))&&(pesi[i] < pesi[min])) {
                        min = i;
                    }
                }
            }
            if (min == -1) {break;}
            nodi[min] = "V";
            for (int i = 0; i < distanze.length; i = i + 1) {
                if ((distanze[min][i] != 0) && (nodi[i].equals("NV")) && (pesi[min] + distanze[min][i] < pesi[i])) {
                    pesi[i] = pesi[min] + distanze[min][i];
                    u[i]=min;
                }
            }
        }

        System.out.printf("Distanza tra %s e %s : %d\n", città[start], città[end], pesi[end]);

        int padre = end;
        Stack<String> path = new Stack<>();
        while(padre != -1){
            path.push(città[padre]);
            padre = u[padre];
        }
        System.out.print("Percorso : ");
        System.out.print(path.pop());
        while(!path.isEmpty()){
            System.out.print(" -> ");
            System.out.print(path.pop());
        }
        System.out.println();
    }
}
