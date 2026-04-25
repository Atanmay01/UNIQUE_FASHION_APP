package com.menswear.shop;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {

    @GetMapping("/")
    public String index() {
        // This looks for index.html in src/main/resources/static
        return "index.html";
    }
}