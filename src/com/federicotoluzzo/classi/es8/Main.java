package com.federicotoluzzo.classi.es8;

public class Main {
    public static void main(String[] args) {
        Fair fair = new Fair();
        Seller seller1 = new Seller();
        Seller seller2 = new Seller();
        seller1.revenue = 1000.0;
        seller2.revenue = 1200.0;
        fair.addSeller(seller1);
        fair.addSeller(seller2);
        System.out.println(fair.getSellers());
    }
}
