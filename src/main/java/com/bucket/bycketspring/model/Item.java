package com.bucket.bycketspring.model;

import java.util.Objects;

public class Item {
    private final int ID;
    private final String productName;

    public Item(int ID, String productName) {
        this.ID = ID;
        this.productName = productName;
    }

    @Override
    public String toString(){
        return "{\n id: " + ID +
                "\n product name:" + productName +
                "\n}";
    }
    @Override
    public int hashCode(){
        return Objects.hash(ID, productName);
    }

    public int getID() {
        return ID;
    }

    public String getProductName() {
        return productName;
    }
}
