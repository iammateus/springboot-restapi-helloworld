package com.example.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.AbstractMap;
import java.util.HashMap;

@RestController
public class HelloWorldController {

    @GetMapping("/greeting")
    public AbstractMap<String, String> greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        HashMap<String, String> map = new HashMap<>();
        map.put("message", "Hello world!");
        return map;
    }
}
