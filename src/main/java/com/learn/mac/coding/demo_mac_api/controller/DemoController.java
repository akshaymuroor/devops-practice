package com.learn.mac.coding.demo_mac_api.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/hello")
    public String getHello() {
        return "Hi Akshay! Welcome to sample API!";
    }
    
    @GetMapping("/users")
    public List<User> getUsers() {
        List<User> users = new ArrayList<>();
        users.add(new User(1, "John Doe", "123 Main St", "123-456-7890"));
        users.add(new User(2, "Jane Smith", "456 Elm St", "987-654-3210"));
        users.add(new User(3, "Alice Johnson", "789 Oak St", "555-123-4567"));
        return users;
    }

    static class User {
        private int id;
        private String name;
        private String address;
        private String telephone;

        public User(int id, String name, String address, String telephone) {
            this.id = id;
            this.name = name;
            this.address = address;
            this.telephone = telephone;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public String getAddress() {
            return address;
        }

        public String getTelephone() {
            return telephone;
        }
    }
}
