package com.andrew.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

    @GetMapping("/test")
    public String showMessage() {
        return "test";
    }
    @GetMapping("/test2")
    public String showSecondPage() {
        return "secondTest";
    }
}
