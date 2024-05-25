package com.federicotoluzzo.classi.es8;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

class Fair extends JPanel {
    ArrayList<Seller> sellers = new ArrayList<>();

    public Fair() {
        setBackground(new Color(0xBBBBBB));
    }

    void addSeller(Seller seller) {
        sellers.add(seller);
        add(seller);
    }

    public void removeSeller(int id) {
        for (Seller seller : sellers) {
            if (seller.getId() == id) {
                sellers.remove(seller);
            }
        }
    }

    public void editSeller(int id) {
        System.out.println("TODO: add edit seller with id: $id");
    }

    public String getSellers(){
        var sellersString = "";
        for (Seller seller : sellers) {
            sellersString += seller.toString();
        }
        return sellersString;
    }
}