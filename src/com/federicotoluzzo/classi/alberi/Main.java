package com.federicotoluzzo.classi.alberi;

public class Main {
    public static void main(String[] args) {
        Tree t = new Tree(new Node(1));
        t.getRoot().setLeft(new Node(1));
        t.getRoot().setRight(new Node(2));
        t.getRoot().getRight().setLeft(new Node(3));
        t.getRoot().getRight().setRight(new Node(5));
        t.getRoot().getLeft().setLeft(new Node(8));
        t.getRoot().getLeft().setRight(new Node(13));

        System.out.println(t.getValuesDFS(t.getRoot()));
    }
}
