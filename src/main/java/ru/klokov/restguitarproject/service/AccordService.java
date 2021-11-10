package ru.klokov.restguitarproject.service;

import org.springframework.stereotype.Service;
import ru.klokov.restguitarproject.controller.admin.response.Response;
import ru.klokov.restguitarproject.model.dto.AccordDTO;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

@Service
public class AccordService {

    public void add(AccordDTO accordDTO) {
        try (BufferedOutputStream bufferedStream = new BufferedOutputStream(
                new FileOutputStream(
                        "J:\\Develop\\rest-guitar-project\\src\\main\\resources\\static\\images\\accords\\" + accordDTO.getName() + ".jpg"))) {
            byte[] imageBytes = accordDTO.getImage().getBytes();
            bufferedStream.write(imageBytes);
        } catch (Exception e) {
            System.out.println("File not upload " + e);
        }

    }

}
