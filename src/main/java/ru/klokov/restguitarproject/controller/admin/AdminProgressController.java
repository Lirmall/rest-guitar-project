package ru.klokov.restguitarproject.controller.admin;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin/progress")
public class AdminProgressController {

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
