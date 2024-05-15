/**
 * ShopController: This controller class takes any input from any 
 * of the buttons that reference the endpoint of shop.html, once it gets that
 * request it takes you to the shop.html page
 * @ Ethan and Lyle
 * @ 4/18
 * @ Version 12
 */

package com.velm.website;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class ShopController {

    // Map of products and their prices
    private Map<String, String> products = new HashMap<String, String>() {{
        put("Classic Sweatpants", "$30.00");
        put("Sweater", "$49.99");
        put("Women's Shorts", "$19.99");
        put("shirt", "$14.99");

    }};

    
    /** 
     * @return String
     */
    @GetMapping("/Shop")
    public String shopPage() {
        return "hello"; 
    }

    
    /** 
     * @param query
     * @param model
     * @return String
     */
    @PostMapping("/search")
    public String search(@RequestParam("query") String query, Model model) {
        // Here you can add your logic to search for the products
        Map<String, String> foundProducts = new HashMap<>();
        for (Map.Entry<String, String> entry : products.entrySet()) {
            if (entry.getKey().toLowerCase().contains(query.toLowerCase())) {
                foundProducts.put(entry.getKey(), entry.getValue());
            }
        }
        model.addAttribute("foundProducts", foundProducts);
        System.out.println("Search query: " + query);

        // Return the search page showing the search results
        return "search";
    }
}
