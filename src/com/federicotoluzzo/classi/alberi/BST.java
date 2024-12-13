package com.federicotoluzzo.classi.alberi;

public class BST {
    Node root;

    public Node add(Node root, int val){
        if(root == null){
            root = new Node(val);
        } else {
            if(root.getValue() > val){
                root.setLeft(add(root.getLeft(), val));
                return root;
            } else if (root.getValue() < val){
                root.setRight(add(root.getRight(), val));
                return root;
            }
        }
        return root;
    }

    public Node get(Node root, int val){
        if(root == null){
            root = new Node(val);
        } else {
            if(root.getValue() == val){
                return root;
            }else if(root.getValue() > val){
                return get(root.getLeft(), val);
            } else {
                return get(root.getRight(), val);
            }
        }
        return root;
    }
}
