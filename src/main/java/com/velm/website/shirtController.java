/**
 * shirtController: This controller class takes any input from any 
 * of the buttons that reference the endpoint of shirt.html, once it gets that
 * request it takes you to the shirt.html which shows the html page for the shirt product
 * @Ethan and Veronica
 * @ 4/25
 * @ Version 2
 */

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

    
    /** 
     * @return String
     */
    @GetMapping("/shirt")
    public String shirtPage() {
        return "shirt"; 
    }
    
    /** 
     * @return String
     */
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