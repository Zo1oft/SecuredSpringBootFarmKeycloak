package com.example.SpringBootFarm.model;

public class NewAnimal implements Animal {
    private final String sound;

    public NewAnimal(String sound) {
        this.sound = sound;
    }

    @Override
    public String speak() {
        return sound;
    }
}
