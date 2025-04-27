package org.lessons.java.hello_spring_mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
@RequestMapping("/")
public class generalController {
    
    // public String getMethodName(@RequestParam String param) {
        //     return new String();
        // }
        
    @GetMapping("/")
    public String home(){

        return("home");
    }

    @GetMapping("/store")
    public String store(@RequestParam(name = "name") String name, @RequestParam(name = "price") int price, Model model) {
        model.addAttribute("titolo", "Benvenuto nel nostro store");
        model.addAttribute("name", name);
        model.addAttribute("price", price);
        return ("store");
    }
    
}
