package org.example.products

class ConditionCategorySports: Condition {
    override fun isSuitable(productCard: ProductCard): Boolean {
        return productCard.productCategory == ProductCategory.SPORTS
    }
}