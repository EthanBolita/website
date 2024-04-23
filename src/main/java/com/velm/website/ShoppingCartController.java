package com.velm.website;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ShoppingCartController {

    @GetMapping("/shoppingcart.html")
    public String showShoppingCart() {
        return "shoppingcart"; // This will return the name of the HTML file (without the extension) to be displayed
    }
}