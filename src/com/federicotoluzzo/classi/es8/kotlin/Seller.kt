package com.federicotoluzzo.classi.es8.kotlin

class Seller {
    companion object {
        var lastID = 0
    }

    val id:Int = ++lastID
    var revenue:Double = 0.0

    override fun toString():String{
        var seller = "";
        seller += "ID : $id\n"
        seller += "Revenue : $revenue\n"
        return seller
    }
}