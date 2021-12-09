package ru.klokov.restguitarproject.service;

import org.springframework.stereotype.Service;
import ru.klokov.restguitarproject.model.dto.AccordDTO;
import ru.klokov.restguitarproject.persistence.admin.AdminAccordRepository;
import ru.klokov.restguitarproject.service.utils.FileRecorder;

import java.io.IOException;

@Service
public class AccordService {

    FileRecorder imageFileRecorder;
    AdminAccordRepository adminAccordRepository;

    public AccordService(FileRecorder imageFileRecorder, AdminAccordRepository adminAccordRepository) {
        this.imageFileRecorder = imageFileRecorder;
        this.adminAccordRepository = adminAccordRepository;
    }

    public void add(AccordDTO accordDTO) throws IOException {
        imageFileRecorder.add(accordDTO);
        adminAccordRepository.add(accordDTO);
    }
}
