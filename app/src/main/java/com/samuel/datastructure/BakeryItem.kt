package com.samuel.datastructure

//Challenge 1
data class BakeryItem (
    val name: String,
    val sold: Double,
    val price: Double
){
    //Challenge 2
    fun revenue(): Double {
        return sold * price
    }
}