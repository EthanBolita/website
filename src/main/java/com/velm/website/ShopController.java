package com.velm.website;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ShopController {

    @GetMapping("/Shop")
    public String shopPage() {
        return "Shop"; // Assuming "shop.html" is in the templates directory
    }

    @PostMapping("/search")
    public String search(@RequestParam("query") String query) {
        // Add logic to search for the products
        System.out.println("Search query: " + query);

        // Return a different page showing the search results
        return "redirect:/";
    }
}
