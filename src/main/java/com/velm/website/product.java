package com.velm.website;

public class product {
    double productPrice;
    String selectedSize;
    String selectedColor;
    int quantity;

    public product(double productPrice, String selectedSize, String selectedColor, int quantity) {
        this.selectedColor = selectedColor;
        this.productPrice = productPrice;
        this.selectedSize = selectedSize;
        this.quantity = quantity;
    }

    public product() {
        //TODO Auto-generated constructor stub
    }

    public double getPrice() {
        return productPrice;
    }

    public String getColor() {
        return selectedColor;
    }

    public int getquantity() {
        return quantity;
    }

    public String getSize() {
        return selectedSize;
    }

    public String toString() {
        String item = "Color: " + selectedColor + " Size: " + selectedSize + " Price: " + productPrice + " Quantity: " + quantity;
        return item;
    }
}
