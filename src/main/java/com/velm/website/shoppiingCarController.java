/**
 * This is the shoppiingCarController class, which is a test class to help how the
 * code works
 * @ authors: Ethan
 * @ date of oldest edition: April 30 
 * @ version: 2 
 */

package com.velm.website;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class shoppiingCarController {
    
    
    /** 
     * @param model
     * @return String
     */
    @GetMapping("/ShoppingCar")
    public String showShoppingCart(Model model) {
        model.addAttribute("shoppingCart", shoppingCart.getInstance());
        return "ShoppingCar"; // This will return the name of the HTML file (without the extension) to be displayed
    }
}