package com.example.onlinecinema.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SerialsController {
    @GetMapping("/serials")
    public String serials() {
        return "serials";
    }
}
