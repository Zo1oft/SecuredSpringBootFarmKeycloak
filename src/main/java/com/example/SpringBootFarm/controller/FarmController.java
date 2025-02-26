package com.example.SpringBootFarm.controller;


import com.example.SpringBootFarm.model.Animal;
import com.example.SpringBootFarm.model.Chef;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Controller
public class FarmController {

    private final Animal pig;
    private final Animal cow;
    private final Chef chef;

    public FarmController(Animal pig, Animal cow, Chef chef) {
        this.pig = pig;
        this.cow = cow;
        this.chef = chef;
    }

    @GetMapping("/farm")
    public String getSound(Model model) {
        List<String> sound = Arrays.asList(pig.speak(), cow.speak(), chef.speak());
        String randomSound = sound.get(new Random().nextInt(sound.size()));
        model.addAttribute("sound", randomSound);
        return "farm";
    }
}