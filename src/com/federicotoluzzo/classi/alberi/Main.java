package com.federicotoluzzo.classi.alberi;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        BST tree = new BST();

        long start = System.nanoTime();
        for (int i = 0; i < 100; i++) {
            fillTree(tree, 1000);
        }
        System.out.printf("Average time elapsed = %sns\n", (System.nanoTime() - start) / 100);


    }

    public static void fillTree(BST tree, int len){
        tree.root = null;
        Random r = new Random();
        for(int i = 0; i < len; i++){
            tree.add(tree.root, r.nextInt());
        }
    }

    public static void fillArray(A)
}
