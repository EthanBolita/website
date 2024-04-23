/**
 * LoginController: This controller class takes any input from any 
 * of the buttons that reference the endpoint of login.html, once it gets that
 * request it takes you to the login.html page
 * @Ethan
 * @ 4/15
 * @ Version 2
 */

package com.velm.website;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class ShopController {

    @GetMapping("/Shop")
    public String shopPage() {
        return "Shop"; 
    }

}