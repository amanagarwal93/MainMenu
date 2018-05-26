package com.example.pc.mainmenu;

public class Product {
    String ProductName;
    Double ProductPrice;
    int    ProductImage;
    int    CartQuantity=0;

    public Product(String productName, Double productPrice, int productImage) {
        ProductName = productName;
        ProductPrice = productPrice;
        ProductImage = productImage;
    }

}
