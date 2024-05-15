/**
 * This is the product class, which creates an instance of a product
 * and provides get methods for each attribute.
 * @ authors: Ethan and Michael
 * @ date of oldest edition: April 25 
 * @ version: 3 
 */

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

    
    /** 
     * @return double
     */
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
