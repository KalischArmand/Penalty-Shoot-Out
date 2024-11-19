package com.example.joconlinefotbal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GameController {

    @GetMapping("/game")
    public String game(Model model) {
        model.addAttribute("message", "Penalty Shootout!");
        return "game";
    }
}
