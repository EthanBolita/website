/**
 * This is the SweatpantsController class, which
 * @ authors: Ethan
 * @ date of oldest edition: April 17 
 * @ version: 2 
 */
package com.velm.website;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SweatpantsController {

    @GetMapping("/sweaptants")
    public String sweaptantsPage() {
        return "sweatpants"; // Assuming "sweaptants.html" is in the templates directory
    }
}
