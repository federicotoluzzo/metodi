package com.federicotoluzzo.dijkstra;

public class Main {
    public static void main(String[] args) {
        int[][] archi = {
                {0, 1, 6, 0, 0, 0, 0, 0},
                {1, 0, 0, 2, 8, 0, 0, 0},
                {6, 0, 0, 0, 1, 0, 0, 0},
                {0, 2, 0, 0, 2, 5, 0, 0},
                {0, 8, 1, 2, 0, 2, 2, 0},
                {0, 0, 0, 5, 2, 0, 0, 3},
                {0, 0, 0, 0, 2, 0, 0, 8},
                {0, 0, 0, 0, 0, 3, 8, 0}
        };
        Grafo grafo = new Grafo(archi);
        grafo.dijkstra(0);
        grafo.minDistance(1, 6);
    }
}
