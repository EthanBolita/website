/**
 * This is the SweatpantsController class, which
 * @ authors: Ethan
 * @ date of oldest edition: April 17 
 * @ version: 2 
 */


package com.velm.website;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class ShoppingCartController {

    @GetMapping("/shoppingcart")
    public String showShoppingCart() {
        return "shoppingcart"; // This will return the name of the HTML file (without the extension) to be displayed
    }

    // In-memory representation of the shopping cart
    private List<data> shoppingCart = new ArrayList<>();

    @PostMapping("/add-to-cart")
    public String addToCart(@RequestBody String data) {
       

        // Add the item to the shopping cart
        ((ShoppingCartController) shoppingCart).addToCart(data);

        return "Item added to cart successfully";
    }

    // Define a class to represent the data structure of the request body
    static class data {
        private String size;
        private String color;
        private int quantity;

        // Getters and setters
        public String getSize() {
            return size;
        }

        public void setSize(String size) {
            this.size = size;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public int getQuantity() {
            return quantity;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }
    }
}
