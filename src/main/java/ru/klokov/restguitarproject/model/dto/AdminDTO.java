package ru.klokov.restguitarproject.model.dto;

import org.springframework.web.multipart.MultipartFile;

public interface AdminDTO {
    String getName();
    MultipartFile getFile();
    DTOType getType();
}
