package com.velm.website;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ShopController {

    @GetMapping("/Shop")
    public String shopPage() {
        return "Shop"; // Assuming "shop.html" is in the templates directory
    }
}
