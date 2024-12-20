package com.federicotoluzzo.dijkstra;

public class Grafo {
    public static int[][] arcs = {
            {0, 1, 6, 0, 0, 0, 0, 0},
            {1, 0, 0, 2, 8, 0, 0, 0},
            {6, 0, 0, 0, 1, 0, 0, 0},
            {0, 2, 0, 0, 2, 0, 0, 0},
            {0, 8, 0, 2, 5, 2, 0, 0},
            {0, 0, 0, 5, 0, 0, 0, 3},
            {0, 0, 0, 0, 2, 0, 0, 8},
            {0, 0, 0, 0, 0, 3, 8, 0}
    };

    public NodeState[] nodes;
    public int[] distances;
    public int[] parents;

    public Grafo(int[][] arcs){
        this.arcs = arcs;
        this.distances = new int[arcs.length];
        this.parents = new int[arcs.length];
        this.nodes = new NodeState[arcs.length];

        for (int i = 0; i < arcs.length; i++) {
            this.distances[i] = Integer.MAX_VALUE;
            this.parents[i] = -1;
            this.nodes[i] = NodeState.UNVISITED;
        }
    }

    public void minDistance(int start, int end){

        String [] nodi = new String[this.arcs.length];
        int [] u = new int[this.arcs.length];  //vettore u
        for(int i = 0; i < u.length; i = i+1){
            u[i] = -1;
        }
        for(int i = 0 ; i < nodi.length ; i = i + 1){
            nodi[i] = "NV";
        }
        int [] pesi = new int[this.arcs.length];
        for(int i = 0 ; i < pesi.length; i = i + 1){
            pesi[i] = 1000000;
        }
        pesi[start] = 0;
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
            if (min == end) {break;}
            nodi[min] = "V";
            //aggiorno peso dei nodi adiacenti
            for (int i = 0; i < arcs.length; i = i + 1) {
                if ((arcs[min][i] != 0) && (nodi[i].equals("NV")) && (pesi[min] + arcs[min][i] < pesi[i])) {
                    pesi[i] = pesi[min] + arcs[min][i];
                    u[i] = min;
                }
            }
        }
        System.out.println("Distanza tra %d e %d = %d", start, end, );
    }

    public void dijkstra (int n){
        String [] nodi = new String[this.arcs.length];
        int [] u = new int[this.arcs.length];  //vettore u
        for(int i=0;i<u.length;i=i+1){
            u[i]=-1;
        }
        for(int i=0;i<nodi.length;i=i+1){
            nodi[i]="NV";
        }
        int [] pesi=new int[this.arcs.length];
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
            for (int i = 0; i < arcs.length; i = i + 1) {

                if ((arcs[min][i] != 0) && (nodi[i].equals("NV")) && (pesi[min] + arcs[min][i] < pesi[i])) {
                    pesi[i] = pesi[min] + arcs[min][i];
                    u[i]=min;
                }
            }
        }
        System.out.println("vettore u:");
        for(int i=0;i<u.length;i=i+1){
            System.out.println("predecessore-padre del nodo "+i+" nell'ALB dei cammini minimi è il nodo: "+ u[i]);
        }
    }
}
