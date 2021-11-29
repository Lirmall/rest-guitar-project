package ru.klokov.restguitarproject.service.utils;

import ru.klokov.restguitarproject.model.dto.AdminDTO;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface FileRecorder {

    void add(AdminDTO adminDTO) throws IOException;

    void write(AdminDTO adminDTO, String filePath) throws IOException;

}
