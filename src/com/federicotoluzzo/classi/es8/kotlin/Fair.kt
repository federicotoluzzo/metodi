package com.federicotoluzzo.classi.es8.kotlin

class Fair {
    val sellers = mutableListOf<Seller>()

    fun addSeller(seller: Seller) {
        sellers.add(seller)
    }

    fun removeSeller(id:Int) {
        sellers.remove(seller)
    }

    fun editSeller(id:Int) {
        sellers.add(seller)
    }

    fun getSellers():String {
        var sellersString = ""
        for (seller in sellers) {
            sellersString += seller.toString()
        }
        return sellersString
    }
}