package com.federicotoluzzo.classi.irlanda;

public class Irlanda {
    private String[] città = {"Dublino", "Belfast", "Galway", "Cork", "Waterford", "Londonderry", "Limerick"};
    private int[][] distanze = {
            {0, 140, 186, 220, 134, 0, 176},
            {140, 0, 0, 0, 0, 100, 0},
            {186, 0, 0, 0, 0, 0, 0},
            {220, 0, 0, 0, 0, 0, 0},
            {134, 0, 0, 0, 0, 0, 112},
            {0, 100, 0, 0, 0, 0, 0},
            {176, 0, 0, 0, 112, 0, 0}
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
        while(padre != -1){
            distanza += pesi[padre];
            padre = u[padre];
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
