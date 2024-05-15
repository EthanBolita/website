/** This is the accountController class, which takes user account information,
 * and stores it.
* @ authors: Ethan
* @ date of oldest edition: April 27 
* @ version: 3 
*/

package com.velm.website;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class accountController {
    
    
    /** 
     * @param name
     * @param model
     * @return String
     */
    @GetMapping("/myaccount")
    public String accountPage(@RequestParam("name") String name, Model model) {
        // Add the name to the model
        model.addAttribute("name", name);
        
        // return the view name
        return "account"; 
    }
}


