package ru.klokov.restguitarproject.controller.admin;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.NotBlank;
import java.io.*;


@RestController
@RequestMapping("/admin/accord")
public class AccordController {

    @PostMapping(value = "/upload", consumes = {"multipart/form-data"})
    public void add(@RequestPart("name") @NotBlank String name,
                    @RequestPart("fingerPosition") @NotBlank String fingerPosition,
                    @RequestPart("image") @NotBlank MultipartFile image) {

        try(BufferedOutputStream bufferedStream = new BufferedOutputStream(
                new FileOutputStream(
                        "J:\\Develop\\rest-guitar-project\\src\\main\\resources\\static\\images\\accords\\" + name + ".jpg"))) {
            byte [] imageBytes = image.getBytes();
            bufferedStream.write(imageBytes);
        } catch (Exception e) {
            System.out.println("File not upload " + e);
        }

    }

    public void edit() {

    }

    public void delete() {

    }
}
