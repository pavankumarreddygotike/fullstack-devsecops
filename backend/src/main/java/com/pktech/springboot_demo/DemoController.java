package com.pktech.springboot_demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/")
    public String home() {
        return "Hello from Backend!";
    }
    @GetMapping("/welcome")
    public String home1() {
        return "Hello from welcome!";
    }

    @GetMapping("/")
    public String home2() {
        return "Hello from Backend!";
    }
    @GetMapping("/welcome")
    public String home3() {
        return "Hello from welcome!";
    }
}
