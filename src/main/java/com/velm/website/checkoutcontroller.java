package com.velm.website;

// CheckoutController.java

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class checkoutcontroller {

    @GetMapping("/checkout")
    public String showCheckoutPage() {
         return "checkout";
    }

    @PostMapping("/confirm")
    public String confirmOrder(Model model, @RequestParam("address") String address,
                               @RequestParam("email") String email) {
        // Process the order confirmation
        
        
        // Display confirmation message with entered details
        model.addAttribute("address", address);
        model.addAttribute("email", email);
        return "confirmation";
    }
}

