package org.example.products

fun main() {
    val products = ProductsRepository.products

    var filtered = filter(products) {it.productPrice > 500}
    filtered = filter(filtered) {it.productRating > 4}
    filtered = filter(filtered) {it.productCategory == ProductCategory.SPORTS }

    for (productCard in filtered) {
        println(productCard)
    }
}

fun filter(productCards: List<ProductCard>, isSuitable: (ProductCard) -> Boolean): List<ProductCard> {
    val result = mutableListOf<ProductCard>()
    for (card in productCards) {
        if (isSuitable(card))
            result.add(card)
    }
    return result
}