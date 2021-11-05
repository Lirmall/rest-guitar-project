package ru.klokov.restguitarproject.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lessons")
public class LessonsController {

    @GetMapping("/showLessons")
    public String showLessons () {
        return "Lessons: ";
    }
}
