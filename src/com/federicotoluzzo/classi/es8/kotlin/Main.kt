package com.federicotoluzzo.classi.es8.kotlin

class Main {
    fun main(args: Array<String>) {
        var fair = Fair();
        var seller1 = Seller()
        var seller2 = Seller()
        seller1.revenue = 1000.0;
        seller2.revenue = 1200.0;
        println(fair.getSellers())
    }
}