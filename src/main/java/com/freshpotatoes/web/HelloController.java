package com.freshpotatoes.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private static final String template = "Hello, %s!";

    @RequestMapping("/")
    public String test(@RequestParam(value="name", defaultValue = "World") String name) {
        return String.format(template, name);
    }
}
