package ru.klokov.restguitarproject.controller.admin;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import javax.validation.constraints.NotBlank;

@RestController
@RequestMapping("/admin/accord")
public class AccordController {

    @PostMapping(consumes = {"multipart/form-data"})
    public void add(@RequestPart("name") @NotBlank String name, @RequestPart("fingerPosition") String fingerPosition, @RequestPart("image") MultipartFile image) {

    }

    public void edit() {

    }

    public void delete() {

    }
}
