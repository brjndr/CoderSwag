package com.brj.coderswag.Services

import com.brj.coderswag.Model.Category
import com.brj.coderswag.Model.Product

object DataService {
    val categories = listOf(
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hattimage"),
        Category("DIGITAL", "digitalgoodsimage")
    )

    val hats = listOf(
        Product("Devslopes Graphic Beanie", "$20", "hat1"),
        Product("Devslopes Hat Black", "$21", "hat2"),
        Product("Devslopes Hat White", "$22", "hat3"),
        Product("Devslopes Hat Snapback", "$23", "hat4")
        )
    val hoodies = listOf(
        Product("Devslopes Hoodie Gray", "$20", "hoodie1"),
        Product("Devslopes Hoodie Black", "$21", "hoodie2"),
        Product("Devslopes Hoodie White", "$22", "hoodie3"),
        Product("Devslopes Hoodie Red", "$23", "hoodie4")
    )
    val shirts = listOf(
        Product("Devslopes Shirt Brown", "$20", "shirt1"),
        Product("Devslopes Shirt Black", "$21", "shirt2"),
        Product("Devslopes Shirt White", "$22", "shirt3"),
        Product("Devslopes Shirt Red", "$23", "shirt4"),
        Product("Devslopes Shirt Hustle", "$25", "shirt5")
    )
}