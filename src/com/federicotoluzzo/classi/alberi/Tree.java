package com.federicotoluzzo.classi.alberi;

import java.util.ArrayList;
import java.util.Queue;

public class Tree {
    private Node root;

    public ArrayList<Integer> visitaPreordine1(Node n){
        ArrayList<Integer> values = new ArrayList<>();
        if(n == null){
            return values;
        }
        values.add(n.getValue());
        values.addAll(visitaPreordine1(n.getLeft()));
        values.addAll(visitaPreordine1(n.getRight()));
        return values;
    }

    public ArrayList<Integer> visitaOrdine1(Node n){
        ArrayList<Integer> values = new ArrayList<>();
        if(n == null){
            return values;
        }
        values.addAll(visitaPreordine1(n.getLeft()));
        values.add(n.getValue());
        values.addAll(visitaPreordine1(n.getRight()));
        return values;
    }

    public ArrayList<Integer> visitaPostordine1(Node n){
        ArrayList<Integer> values = new ArrayList<>();
        if(n == null){
            return values;
        }
        values.addAll(visitaPreordine1(n.getLeft()));
        values.addAll(visitaPreordine1(n.getRight()));
        values.add(n.getValue());
        return values;
    }

    /*public NodoLista visitaPreordine2(Node n){
        NodoLista values = new NodoLista();
        if(n == null){
            return values;
        }
        values.addValue( n.getValue());
        values.addAll(visitaPreordine1(n.getLeft()));
        values.addAll(visitaPreordine1(n.getRight()));
        return values;
    }

    public NodoLista visitaOdine2(Node n){
        NodoLista values = new NodoLista();
        if(n == null){
            return values;
        }
        values.addAll(visitaPreordine1(n.getLeft()));
        values.addValue(n.getValue());
        values.addAll(visitaPreordine1(n.getRight()));
        return values;
    }

    public NodoLista visitaPostordine2(Node n){
        NodoLista values = new NodoLista();
        if(n == null){
            return values;
        }
        values.addAll(visitaPreordine1(n.getLeft()));
        values.addAll(visitaPreordine1(n.getRight()));
        values.addValue(n.getValue());
        return values;
    }*/

    public static Node crea2(Integer[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }

        Node radice = new Node(nums[0]);
        ArrayList<Node> queue = new ArrayList<>();
        queue.add(radice);
        int i = 1;
        while (i < nums.length) {
            Node currentNode = queue.remove(0);
            if (i < nums.length) {
                currentNode.setLeft(new Node(nums[i++]));
                queue.add(currentNode.getLeft());
            }
            if (i < nums.length) {
                currentNode.setRight(new Node(nums[i++]));
                queue.add(currentNode.getRight());
            }
        }
        return radice;
    }

    /*public ArrayList<Integer> creaArray() {
        ArrayList<Integer> values = new ArrayList<>();

        int i = 1;
        while (i < nums.length) {
            Node currentNode = queue.remove(0);
            if (i < nums.length) {
                currentNode.setLeft(new Node(nums[i++]));
                queue.add(currentNode.getLeft());
            }
            if (i < nums.length) {
                currentNode.setRight(new Node(nums[i++]));
                queue.add(currentNode.getRight());
            }
        }
        return values;
    }*/
}