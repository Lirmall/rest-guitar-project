package ru.klokov.restguitarproject.service;

import org.springframework.stereotype.Service;
import ru.klokov.restguitarproject.model.dto.AccordDTO;
import ru.klokov.restguitarproject.service.utils.FileRecorder;

@Service
public class AccordService {

    FileRecorder imageFileRecorder;

    public AccordService(FileRecorder imageFileRecorder) {
        this.imageFileRecorder = imageFileRecorder;
    }

    public void add(AccordDTO accordDTO) {
        imageFileRecorder.add(accordDTO);
    }
}
