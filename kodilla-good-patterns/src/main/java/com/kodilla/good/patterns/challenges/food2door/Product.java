package com.kodilla.good.patterns.challenges.food2door;

public class Product {
    private String productName;
    private int productQuantity;
    private String productType;

    public Product(String productName, int productQuantity, String productType) {
        this.productName = productName;
        this.productQuantity = productQuantity;
        this.productType = productType;
    }

    public String getProductName() {
        return productName;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public String getProductType() {
        return productType;
    }
}

