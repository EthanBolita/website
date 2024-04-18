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
