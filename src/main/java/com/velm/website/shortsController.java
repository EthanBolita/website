package com.velm.website;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class shortsController {
    @GetMapping("/shorts")
    public String shortsPage() {
        return "shorts"; 
    }
}
