package ru.klokov.restguitarproject.controller.admin;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lessons")
public class AdminLessonsController {

    @GetMapping("/show")
    public String show() {
        return "Lessons: ";
    }
}
