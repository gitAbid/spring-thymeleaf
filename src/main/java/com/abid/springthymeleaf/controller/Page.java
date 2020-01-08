package com.abid.springthymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class Page {
    ArrayList names = new ArrayList(Arrays.asList("Abid", "adAdasd", "asdasdasd"));

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("message", "Abid");
        model.addAttribute("names", names);
        return "index";
    }
}
