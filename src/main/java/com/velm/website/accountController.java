package com.velm.website;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class accountController {
    
    @GetMapping("/myaccount")
    public String accountPage(@RequestParam("name") String name, Model model) {
        // Add the name to the model
        model.addAttribute("name", name);
        
        // Return the view name
        return "account"; 
    }
}



