package org.lessons.java.hello_spring_mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
@RequestMapping("/")
public class homeController {
    
    // public String getMethodName(@RequestParam String param) {
        //     return new String();
        // }
        
    @GetMapping("/")
    public String home(){

        return("home");
    }
}
