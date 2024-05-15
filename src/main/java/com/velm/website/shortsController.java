/**
 * shortsController: This controller class takes any input from any 
 * of the buttons that reference the endpoint of shorts.html, once it gets that
 * request it takes you to the shorts.html which shows the html page for the shorts product
 * @Ethan and Veronica
 * @ 4/25
 * @ Version 2
 */

package com.velm.website;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class shortsController {
    
    
    /** 
     * @return String
     */
    @GetMapping("/shorts")
    public String shortsPage() {
        return "shorts"; 
    }
}
