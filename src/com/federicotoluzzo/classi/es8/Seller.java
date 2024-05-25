package com.federicotoluzzo.classi.es8;

import javax.swing.*;
import java.awt.*;

class Seller extends JPanel {
    static int lastID = 0;

    private int id = ++lastID;
    private double revenue = 0.0;

    private JLabel labelID = new JLabel("ID : " + id);
    private JLabel labelRevenue = new JLabel("Revenue : " + revenue);

    public Seller(){
        setBackground(new Color(0xAAAAAA));
        setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        add(labelID);
        add(labelRevenue);
    }

    public String toString(){
        var seller = "";
        seller += String.format("ID\t:\t%s\n", id);
        seller += String.format("Revenue\t:\t%s\n", revenue);
        return seller;
    }

    public int getId() {
        return id;
    }

    public double getRevenue() {
        return revenue;
    }

    public void setRevenue(double revenue) {
        this.revenue = revenue;
        labelRevenue.setText("Revenue : " + revenue);
    }
}