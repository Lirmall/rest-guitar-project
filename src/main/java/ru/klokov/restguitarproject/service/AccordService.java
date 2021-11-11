package ru.klokov.restguitarproject.service;

import org.springframework.stereotype.Service;
import ru.klokov.restguitarproject.model.dto.AccordDTO;
import ru.klokov.restguitarproject.service.utils.FileRecorder;

@Service
public class AccordService {

    FileRecorder imageRecorder;
    private static final String imagePath = "J:\\Develop\\rest-guitar-project\\src\\main\\resources\\static\\images\\accords\\";

    public AccordService(FileRecorder imageRecorder) {
        this.imageRecorder = imageRecorder;
    }

    public void add (AccordDTO accordDTO) {
        imageRecorder.add(accordDTO, imagePath);
    }
}
