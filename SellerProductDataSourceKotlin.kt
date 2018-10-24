package com.enpassio.endatasource.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Seller(
        val sellerId: Int? = null,
        val sellerName: String? = null) : Parcelable

@Parcelize
data class Product(
        val productId: Int? = null,
        val productName: String? = null,
        val productPrice: Int? = null) : Parcelable

class SellerProductList {
    fun getProductList(): ArrayList<Product> {
        val productArrayList = ArrayList<Product>()
        productArrayList.add(Product(1, "pencil", 5))
        productArrayList.add(Product(2, "bottle", 150))
        productArrayList.add(Product(3, "chair", 500))
        productArrayList.add(Product(4, "apple", 100))
        productArrayList.add(Product(5, "paper", 20))
        productArrayList.add(Product(6, "cup", 50))
        productArrayList.add(Product(7, "keyboard", 950))
        productArrayList.add(Product(8, "mobile", 2000))
        productArrayList.add(Product(9, "bag", 500))
        productArrayList.add(Product(10, "bulb", 100))
        return productArrayList
    }

    fun getSellerList(): ArrayList<Seller> {
        val sellerList = ArrayList<Seller>()
        sellerList.add(Seller(1, "Kolonial"))
        sellerList.add(Seller(2, "Waynord"))
        sellerList.add(Seller(3, "Currys"))
        sellerList.add(Seller(4, "Flipkart"))
        sellerList.add(Seller(5, "Apple"))
        sellerList.add(Seller(6, "Alibaba"))
        return sellerList
    }

}