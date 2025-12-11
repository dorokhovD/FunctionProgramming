package org.example.products

import org.example.extensions.filter
import org.example.extensions.transform

fun main() {
    ProductsRepository.products.also {
        println("Filter by category CLOTHING")
    }.filter { it.productCategory == ProductCategory.CLOTHING }.also {
        println("Increase price")
    }.map { it.copy(productPrice = it.productPrice * 2) }.also {
        println("Convert to string")
    }.map { "${it.id} - ${it.productName} - ${it.productPrice}" }.also {
     println("Print info")
    }.forEach { println(it) }

//    var filtered = filter(products) {it.productCategory == ProductCategory.CLOTHING }
//    filtered = transform(filtered) {  }
//    val filteredAsString = transform(filtered) { "${it.id} - ${it.productName} - ${it.productPrice}" }

}

