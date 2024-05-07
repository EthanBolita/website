package com.velm.website;

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
        // Check if the email is ethanbolita2203@gmail.com
        if (!email.equals("ethanbolita2203@gmail.com")) {
            // If the email is not correct, return an error message
            model.addAttribute("error", "Invalid email address.");
            return "checkout"; // Assuming you have an error.html template for displaying errors
        }

        // Process the order confirmation
        // Add your order processing logic here

        // Display confirmation message with entered details
        model.addAttribute("address", address);
        model.addAttribute("email", email);
        return "confirmation";
    }
}
