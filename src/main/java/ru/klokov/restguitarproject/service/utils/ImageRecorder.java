package ru.klokov.restguitarproject.service.utils;

import org.springframework.stereotype.Component;
import ru.klokov.restguitarproject.model.dto.AdminDTO;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

@Component
public class ImageRecorder implements FileRecorder {

    public void add(AdminDTO adminDTO) throws IOException {
        String filePath = getFilePath(adminDTO);
        write(adminDTO, filePath);
    }

    public void write(AdminDTO adminDTO, String filePath) throws IOException {
        BufferedOutputStream bufferedStream = new BufferedOutputStream(new FileOutputStream(filePath + adminDTO.getName() + ".jpg"));
        byte[] imageBytes = adminDTO.getFile().getBytes();
        bufferedStream.write(imageBytes);
        bufferedStream.close();
    }

    public String getFilePath(AdminDTO adminDTO) {
        String filePath;
        switch (adminDTO.getType()) {
            case ACCORD:
                filePath = "J:\\Develop\\rest-guitar-project\\src\\main\\resources\\static\\images\\accords\\";
                break;
            case BEAT:
                filePath = "J:\\Develop\\rest-guitar-project\\src\\main\\resources\\static\\images\\beats\\";
                break;
            default:
                filePath = "J:\\Develop\\rest-guitar-project\\src\\main\\resources\\static\\images\\";
                break;
        }
        return filePath;
    }
}
