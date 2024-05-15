/**
 * hoodieController: This controller class takes any input from any 
 * of the buttons that reference the endpoint of hoodie.html, once it gets that
 * request it takes you to the hoodie.html which shows the html page for the hoodie product
 * @Ethan and Veronica
 * @ 4/25
 * @ Version 2
 */

package com.velm.website;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class hoodieController {
    
    
    /** 
     * @return String
     */
    @GetMapping("/hoodie")
    public String hoodiePage() {
        return "hoodie"; 
    }
}
