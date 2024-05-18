package com.federicotoluzzo.classi.es8;

import java.util.ArrayList;

class Fair {
    ArrayList<Seller> sellers = new ArrayList<>();

    void addSeller(Seller seller) {
        sellers.add(seller);
    }

    public void removeSeller(int id) {
        for (Seller seller : sellers) {
            if (seller.id == id) {
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