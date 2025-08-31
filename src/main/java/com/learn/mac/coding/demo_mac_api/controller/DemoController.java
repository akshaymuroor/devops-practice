package com.learn.mac.coding.demo_mac_api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

@GetMapping("/hello")
public String getHello() {
    return "Hi Akshay! Welcome to sample API!";
}

}
