/**
<<<<<<< HEAD
 * LoginController: This controller class takes any input from any 
 * of the buttons that reference the endpoint of login.html, once it gets that
 * request it takes you to the login.html page
 * @Ethan
 * @ 4/15
 * @ Version 2
 */

=======
 * This is the ShopController class, which
 * @ authors: Ethan
 * @ date of oldest edition: April 17 
 * @ version: 2 
 */
>>>>>>> origin/main
package com.velm.website;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class ShopController {

    // List of products
    private String[] products = {"Classic Sweatpants", "Sweater", "Women's Shorts"};

    @GetMapping("/Shop")
    public String shopPage() {
        return "Shop"; // Assuming "shop.html" is in the templates directory
    }

}