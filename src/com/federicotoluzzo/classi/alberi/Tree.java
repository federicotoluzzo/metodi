package com.federicotoluzzo.classi.alberi;

import java.util.ArrayList;

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

    public NodoLista visitaPreordine2(Node n){
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
    }
}