package com.velm.website;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebsiteController {

    @RequestMapping("/")
    public String welcome() {
        return "index";
    }
}