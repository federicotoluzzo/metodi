package com.federicotoluzzo.classi.pathfinder1;

public class Main {
    public static void main(String[] args) {
        int[][] mat = Graph.mat;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.print(mat[i][j] + "  ");
            }
            System.out.println();
        }
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if(mat[i][j] != mat[j][i]) {
                    System.out.printf("%d, %d è sbagliato\n", i, j);
                }
            }
        }
    }
}
