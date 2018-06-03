package com.matveyenka.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author i.sukach
 */
@Controller
public class HomeController {

    @GetMapping("/home")
    public String showHomePage() {
        return "home";
    }
}
