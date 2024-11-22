package com.federicotoluzzo.classi.alberi;

public class NodoLista {
    private Node head;

    public NodoLista() {
        head = null;
    }

    public void addValue(int val){
        if(head == null){
            head = new Node(val);
        }else{
            Node n = head;
            while(n.getLeft() != null){
                n = n.getLeft();
            }
            n.setLeft(new Node(val));
        }
    }

    public void removeValue(int val){
        if(head == null){
            return;
        }
        Node n = head;
        while(n.getLeft() != null){
            n = n.getLeft();
        }
    }

    public void addAll(NodoLista lista){

    }

    @Override
    public String toString() {
        String res = "[";
        Node n = head;
        while(n != null){
            res += n.getValue() + ", ";
        }
        res += "]";
        return res;
    }
}
