package com.federicotoluzzo.classi.es8;

import javax.swing.*;

public class Main extends JFrame {
    public static void main(String[] args) {
        Main frame = new Main();

        Fair fair = new Fair();
        Seller seller1 = new Seller();
        Seller seller2 = new Seller();
        seller1.setRevenue(1000.0);
        seller2.setRevenue(1200.0);
        fair.addSeller(seller1);
        fair.addSeller(seller2);
        System.out.println(fair.getSellers());

        frame.add(fair);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);


    }
}
