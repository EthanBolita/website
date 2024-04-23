/**
 * This is the LoginController class, which
 * @ authors: Ethan
 * @ date of oldest edition: April 17 
 * @ version: 2 
 */


package com.velm.website;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String loginForm() {
        return "login";
    }
/**
 * This post request is taken from login and needs paramter name
 * and once it gets that name, it takes you to the thankyou.html page
 * @param name
 * @param model
 * @param redirectAttributes
 * @return
 */
    @PostMapping("/login")
    public String loginSubmit(@RequestParam("name") String name, Model model, RedirectAttributes redirectAttributes) {
        redirectAttributes.addFlashAttribute("name", name);
        return "redirect:/thankyou";
    }

    @GetMapping("/thankyou")
    public String thankyouPage() {
        return "thankyou";
    }

    @GetMapping("/index")
    public String indexPage() {
        return "index";
    }
}