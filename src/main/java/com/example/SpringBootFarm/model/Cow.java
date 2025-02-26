package com.example.SpringBootFarm.model;

import org.springframework.stereotype.Component;

@Component
public class Cow implements Animal {
    @Override
    public String speak() {
        return "Муууу!";
    }
}
