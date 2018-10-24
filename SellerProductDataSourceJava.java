package com.enpassio.endatasource.model;
import java.util.ArrayList;

public class SellerProductDataSource {

    public static ArrayList<Product> getProductData() {

        ArrayList<Product> productArrayList = new ArrayList<>();

        productArrayList.add(new Product(1, "pencil", 5));
        productArrayList.add(new Product(2, "bottle", 150));
        productArrayList.add(new Product(3, "chair", 500));
        productArrayList.add(new Product(4, "apple", 100));
        productArrayList.add(new Product(5, "paper", 20));
        productArrayList.add(new Product(6, "cup", 50));
        productArrayList.add(new Product(7, "keyboard", 950));
        productArrayList.add(new Product(8, "mobile", 2000));
        productArrayList.add(new Product(9, "bag", 500));
        productArrayList.add(new Product(10, "bulb", 100));
        return productArrayList;
    }

    public static ArrayList<Seller> getSellerData() {

        ArrayList<Seller> productArrayList = new ArrayList<>();

        productArrayList.add(new Seller(1, "Kolonial"));
        productArrayList.add(new Seller(2, "Waynord"));
        productArrayList.add(new Seller(3, "Currys"));
        productArrayList.add(new Seller(4, "Flipkart"));
        productArrayList.add(new Seller(5, "Apple"));
        productArrayList.add(new Seller(6, "Alibaba"));
        return productArrayList;
    }
}