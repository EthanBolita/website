package com.velm.website;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class addToCart {

    @PostMapping("/AddToCartServlet")
    @ResponseBody
    public String addProductToCart(
            @RequestParam("productName") String productName,
            @RequestParam("productPrice") double productPrice,
            @RequestParam("sizes") String selectedSize,
            @RequestParam("color") String selectedColor) {

        // Create a product object
        product product = new product(productName, productPrice, selectedSize, selectedColor);

        // Get the shopping cart instance
        shoppingCart cart = shoppingCart.getInstance();

        // Add the product to the shopping cart
        cart.addToCart(product);

        // Return response
        return "Product added to cart successfully!";
    }
}
