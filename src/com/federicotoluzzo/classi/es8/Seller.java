package com.federicotoluzzo.classi.es8;

class Seller {
    static int lastID = 0;

    int id = ++lastID;
    double revenue = 0.0;

    public String toString(){
        var seller = "";
        seller += "ID\t:\t$id\n";
        seller += "Revenue\t:\t$revenue\n";
        return seller;
    }
}