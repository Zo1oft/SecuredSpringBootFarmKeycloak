package com.example.SpringBootFarm.model;

import org.springframework.stereotype.Component;

@Component
public class Pig implements Animal {
    @Override
    public String speak() {
        return "Хрююю!";
    }
}
