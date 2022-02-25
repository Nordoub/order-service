package com.example.demoorderservice.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/order")
public class OrderServiceController {

    @RequestMapping("/get")
    public Map<String, String> get() {
        HashMap<String, String> map = new HashMap<>();
        map.put("id", "5832646761962425508");
        map.put("title", "My Order");
        return map;
    }
}
