package com.example.kadai11.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RoginController {
    @GetMapping("rogin")
    public String getLogin(Model model) {
        return "rogin"; // rogin.htmlに画面遷移
    }

    @PostMapping("rogin")
    public String postLogin(Model model) {
        return "rogin";
    }
}
