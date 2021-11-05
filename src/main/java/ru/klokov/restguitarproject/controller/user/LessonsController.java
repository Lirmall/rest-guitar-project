package ru.klokov.restguitarproject.controller.user;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lessons")
public class LessonsController {

    @GetMapping("/show")
    public String show() {
        return "Lessons: ";
    }
}
