package com.velm.website;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class shirtController {

    @GetMapping("/shirt")
    public String shirtPage() {
        return "shirt"; 
    }
    @PostMapping("/ShoppingCar")
    public String ShoppingCar(){
        return "ShoppingCar";
    }
}
