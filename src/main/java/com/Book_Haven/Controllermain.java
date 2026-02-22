package com.Book_Haven;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Controllermain {

    @GetMapping("/")
    String Controllermain() {

        return "index";
    }
}
