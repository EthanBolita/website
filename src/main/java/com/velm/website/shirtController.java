package com.velm.website;

import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class shirtController {

    @GetMapping("/shirt")
    public String shirtPage() {
        return "shirt"; 
    }
    @PostMapping("/ShoppingCar")
    public String ShoppingCar(){
        return "ShoppingCar";
    }
    @PostMapping("/addToCart")
    @ResponseBody
    public product addToCart(@RequestBody product product) {
        // Here you can add your logic to add the product to the cart
        // For example, you can create a new Product object and add it to the shopping cart
        shoppingCart.getInstance().addToCart(product);
    
        // Return the product
        return product;
    }
}