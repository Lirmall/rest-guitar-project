package ru.klokov.restguitarproject.controller.user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/progress")
public class ProgressController {

    @GetMapping("/show")
    public String show() {
        return "Accords: \n" +
                "Beats: \n" +
                "Fingerpickings: \n" +
                "Learn songs by lessons: \n" +
                "Learn songs outside the lessons: \n" +
                "Back";
    }
}
