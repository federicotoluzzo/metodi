package com.federicotoluzzo.classi.irlanda;

import java.util.Stack;

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
        Irlanda ir = new Irlanda();
        ir.dijkstra(0);
        ir.printDistance(5, 3);
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
            System.out.println("ho visitato nodo: "+min);
            //aggiorno peso dei nodi adiacenti
            for (int i = 0; i < distanze.length; i = i + 1) {
                if ((distanze[min][i] != 0) && (nodi[i].equals("NV")) && (pesi[min] + distanze[min][i] < pesi[i])) {
                    pesi[i] = pesi[min] + distanze[min][i];
                    u[i]=min;
                }
            }
        }
        System.out.println("vettore u:");
        for(int i=0;i<u.length;i=i+1){
            System.out.println("predecessore-padre del nodo " + i + " nell'ALB dei cammini minimi è il nodo: " + u[i]);
        }
        int padre = u[end];
        Stack<String> path = new Stack<>();
        while(padre != -1){
            path.push(città[padre]);
            distanza += pesi[padre];
            padre = u[padre];
        }
        while(!path.isEmpty()){
            System.out.println(path.pop());
        }

        System.out.printf("distanza tra %s e %s : %d\n", città[start], città[end], distanza);
    }

    public void dijkstra (int n){
        //trova il cammino di lunghezza minima partendo da nodo n verso tutti gli altri nodi del grafo
        String [] nodi=new String[this.distanze.length];
        int [] u=new int[this.distanze.length];  //vettore u
        for(int i=0;i<u.length;i=i+1){
            u[i]=-1;
        }
        for(int i=0;i<nodi.length;i=i+1){
            nodi[i]="NV";
        }
        int [] pesi=new int[this.distanze.length];
        for(int i=0;i<pesi.length;i=i+1){
            pesi[i]=1000000;
        }
        pesi[n]=0;
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
            System.out.println("ho visitato nodo: "+min);
            //aggiorno peso dei nodi adiacenti
            for (int i = 0; i < distanze.length; i = i + 1) {
                if ((distanze[min][i] != 0) && (nodi[i].equals("NV")) && (pesi[min] + distanze[min][i] < pesi[i])) {
                    pesi[i] = pesi[min] + distanze[min][i];
                    u[i]=min;
                }
            }
        }
        System.out.println("vettore u:");
        for(int i=0;i<u.length;i=i+1){
            System.out.println("predecessore-padre del nodo " + i + " nell'ALB dei cammini minimi è il nodo: " + u[i]);
        }
    }
}
