package ru.klokov.restguitarproject.service.utils;

import org.springframework.stereotype.Component;
import ru.klokov.restguitarproject.model.dto.AccordDTO;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

@Component
public class ImageRecorder implements FileRecorder {

    @Override
    public void add(AccordDTO accordDTO, String filePath) {
        try (BufferedOutputStream bufferedStream = new BufferedOutputStream(
                new FileOutputStream(
                        filePath + accordDTO.getName() + ".jpg"))) {
            byte[] imageBytes = accordDTO.getImage().getBytes();
            bufferedStream.write(imageBytes);
        } catch (Exception e) {
            System.out.println("File not upload " + e);
        }

    }
}
