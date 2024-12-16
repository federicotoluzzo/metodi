package com.federicotoluzzo.classi.pathfinder1;

import java.util.HashSet;

enum State{
    VISITED,
    EMPTY,
    OPEN
}

public class Node {
    private Node parent;
    private int value;
    private HashSet<Node> connected;
    private State state;

    public Node getParent() {
        return parent;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
