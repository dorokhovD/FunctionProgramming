package org.example.products

class ConditionMoreThan500: Condition {
    override fun isSuitable(productCard: ProductCard): Boolean {
        return productCard.productPrice > 500
    }
}