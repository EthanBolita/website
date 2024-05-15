/**
 * This is the WebsiteController class, which takes the website to the index page
 * @ authors: Ethan
 * @ date of oldest edition: April 17 
 * @ version: 2 
 */
package com.velm.website;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebsiteController {

    
    /** 
     * @return String
     */
    @RequestMapping("/")
    public String welcome() {
        return "index";
    }
}