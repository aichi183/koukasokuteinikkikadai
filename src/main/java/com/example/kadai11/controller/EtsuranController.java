package com.example.kadai11.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EtsuranController {
  @GetMapping("etsuran")
  public String index(Model model) {
    model.addAttribute("message", "こんにちは");
    return "etsuran";
  }
}
