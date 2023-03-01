package com.au.oas_project.Model

data class Product(
    val name: String,
    val description: String,
    val price: Double,
    val date: String,
    val time: String,
    var imageUrl: String,
    var id: String = ""
)

