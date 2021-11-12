package ru.klokov.restguitarproject.service.utils;

import org.springframework.stereotype.Component;
import ru.klokov.restguitarproject.model.dto.AdminDTO;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

@Component
public class ImageRecorder implements FileRecorder {

    private static final String imagePath = "J:\\Develop\\rest-guitar-project\\src\\main\\resources\\static\\images\\";

    public void add(AdminDTO adminDTO) {
        String endFilePath;
        endFilePath = getString(adminDTO);
        try (BufferedOutputStream bufferedStream = new BufferedOutputStream(
                new FileOutputStream(
                        imagePath + endFilePath + adminDTO.getName() + ".jpg"))) {
            byte[] imageBytes = adminDTO.getFile().getBytes();
            bufferedStream.write(imageBytes);
        } catch (Exception e) {
            System.out.println("File not upload " + e);
        }
    }

    private String getString(AdminDTO adminDTO) {
        String endFilePath;
        switch (adminDTO.getType()) {
            case ACCORD:
                endFilePath = "\\accords\\";
                break;
            case BEAT:
                endFilePath = "\\beats\\";
                break;
            default:
                endFilePath = "";
        }
        return endFilePath;
    }
}
