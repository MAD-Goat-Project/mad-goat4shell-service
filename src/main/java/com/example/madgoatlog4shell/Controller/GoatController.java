package com.example.madgoatlog4shell.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GoatController {

    @GetMapping("/goatShell")
    public String goat() {
        return "Goat";
    }
}
