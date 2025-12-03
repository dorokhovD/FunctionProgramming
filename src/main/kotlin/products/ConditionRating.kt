package org.example.products

class ConditionRating: Condition {
    override fun isSuitable(productCard: ProductCard): Boolean {
        return productCard.productRating > 4.0
    }
}