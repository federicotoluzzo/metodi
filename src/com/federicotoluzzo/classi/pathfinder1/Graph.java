package com.federicotoluzzo.classi.pathfinder1;

import java.util.HashSet;

public class Graph {
    public static String[] cittàEsempio = {"Belluno", "Padova", "Rovigo", "Treviso", "Venezia", "Verona", "Vicenza", "Graspo d'Uva"};
    public static int[][] mat = {
            {0, 1, 6, 0, 0, 0, 0, 0},
            {1, 0, 0, 2, 8, 0, 0, 0},
            {6, 0, 0, 0, 1, 0, 0, 0},
            {0, 2, 0, 0, 2, 0, 0, 0},
            {0, 8, 0, 2, 5, 2, 0, 0},
            {0, 0, 0, 5, 0, 0, 0, 3},
            {0, 0, 0, 0, 2, 0, 0, 8},
            {0, 0, 0, 0, 0, 3, 8, 0}
    };

    private HashSet<Node> nodes;

    public Graph() {
        nodes = new HashSet<>();
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                Node n = new Node();
                nodes.add(n);
            }
        }
    }

    public void visitAll(){
        HashSet<Node> closed = new HashSet<>();
        HashSet<Node> open = new HashSet<>();
    }
}
