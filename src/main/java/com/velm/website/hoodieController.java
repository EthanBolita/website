package com.velm.website;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class hoodieController {
    
    @GetMapping("/hoodie")
    public String hoodiePage() {
        return "hoodie"; 
    }
}
