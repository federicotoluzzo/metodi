package com.federicotoluzzo.classi.es8.kotlin

fun main(args: Array<String>) {
    var fair = Fair();
    var seller1 = Seller()
    var seller2 = Seller()
    seller1.revenue = 1000.0;
    seller2.revenue = 1200.0;
    fair.addSeller(seller1)
    fair.addSeller(seller2)
    println(fair.getSellers())
}
