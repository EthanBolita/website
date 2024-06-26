/** This is the LoginController class, which takes user to login page,
 * and checks to see if information is part of what is stored.
* @ authors: Ethan
* @ date of oldest edition: April 22 
* @ version: 3 
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

   
   /** 
    * @return String
    */
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
public String loginSubmit(@RequestParam("username") String username, Model model, RedirectAttributes redirectAttributes) {
    if ("Ethan2203".equalsIgnoreCase(username) || "Vero526".equalsIgnoreCase(username)) {
        redirectAttributes.addFlashAttribute("username", username);
        return "redirect:/thankyou";
    } else {
        // Add a message to display on the login page
        redirectAttributes.addFlashAttribute("errorMessage", "Try again");
        return "redirect:/login"; // Redirect to the login page
    }
}


   
   /** 
    * @return String
    */
   @GetMapping("/thankyou")
   public String thankyouPage() {
       return "thankyou";
   }

   @GetMapping("/index")
   public String indexPage() {
       return "index";
   }
}