package com.federicotoluzzo.classi.alberi;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        BST tree = new BST();
        ArrayList<Integer> list = new ArrayList<>();

        long start = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            fillTree(tree, 128);
        }
        System.out.printf("Average time elapsed = %sns\n", (System.nanoTime() - start) / 1000);
        start = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            fillArray(list, 128);
        }
        System.out.printf("Average time elapsed = %sns\n", (System.nanoTime() - start) / 1000);

        Random r = new Random();
        for (int i = 0; i < 1000; i++) {
            tree.get(tree.root, r.nextInt());
        }
        System.out.printf("Average time elapsed = %sns\n", (System.nanoTime() - start) / 1000);
        start = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            list.indexOf(r.nextInt());
        }
        System.out.printf("Average time elapsed = %sns\n", (System.nanoTime() - start) / 1000);


    }

    public static void fillTree(BST tree, int len){
        tree.root = null;
        Random r = new Random();
        for(int i = 0; i < len; i++){
            tree.add(tree.root, r.nextInt());
        }
    }

    public static void fillArray(ArrayList<Integer> list, int len){
        list = new ArrayList<Integer>();
        Random r = new Random();
        for(int i = 0; i < len; i++){
            list.add(r.nextInt());
        }
    }
}
