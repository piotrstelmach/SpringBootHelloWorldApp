package com.piotrstelmach.myhelloworld;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeController {

    @Value("${welcome.message}")
    private String message;


    @GetMapping("/")
    public String HomePage(Model model){
        model.addAttribute("message",message);
        return "home";
    }

}
