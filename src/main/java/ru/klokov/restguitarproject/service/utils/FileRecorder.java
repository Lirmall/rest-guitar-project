package ru.klokov.restguitarproject.service.utils;

import ru.klokov.restguitarproject.model.dto.AccordDTO;

public interface FileRecorder {

    void add(AccordDTO accordDTO, String filePath);

}
