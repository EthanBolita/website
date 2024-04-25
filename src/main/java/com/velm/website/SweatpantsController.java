/**
 * SweatpantsController: This controller class takes any input from any 
 * of the buttons that reference the endpoint of sweatpants.html, once it gets that
 * request it takes you to the sweatpants.html which shows the html page for the sweatpants product
 * @Ethan
 * @ 4/15
 * @ Version 2
 */


package com.velm.website;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SweatpantsController {

    @GetMapping("/sweatpants")
    public String sweaptantsPage() {
        return "sweatpants"; 
    }
}
