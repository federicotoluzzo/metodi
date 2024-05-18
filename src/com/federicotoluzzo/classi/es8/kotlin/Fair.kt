package com.federicotoluzzo.classi.es8.kotlin

class Fair {
    val sellers = mutableListOf<Seller>()

    fun addSeller(seller: Seller) {
        sellers.add(seller)
    }

    fun removeSeller(id:Int) {
        for (seller in sellers) {
            if (seller.id == id) {
                sellers.remove(seller)
            }
        }
    }

    fun editSeller(id:Int) {
        println("TODO: add edit seller with id: $id")
    }

    fun getSellers():String {
        var sellersString = ""
        for (seller in sellers) {
            sellersString += seller.toString()
        }
        return sellersString
    }
}