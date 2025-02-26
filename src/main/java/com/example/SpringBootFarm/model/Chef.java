package com.example.SpringBootFarm.model;

import org.springframework.stereotype.Component;

@Component
public class Chef {
    public String speak() {
        return "Приятного аппетита!";
    }
}
