package com.matveyenka.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author i.sukach
 */
@Controller
public class AdminController {

    @GetMapping("/admin")
    public String showAdminPage() {
        return "admin";
    }
}
