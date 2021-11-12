package ru.klokov.restguitarproject.model.dto;

import org.springframework.web.multipart.MultipartFile;

public class AccordDTO implements AdminDTO {
    String name;
    String fingerPosition;
    MultipartFile file;
    DTOType type = DTOType.ACCORD;

    public AccordDTO(String name, String fingerPosition, MultipartFile file) {
        this.name = name;
        this.fingerPosition = fingerPosition;
        this.file = file;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFingerPosition() {
        return fingerPosition;
    }

    public void setFingerPosition(String fingerPosition) {
        this.fingerPosition = fingerPosition;
    }

    public MultipartFile getFile() {
        return file;
    }

    public void setFile(MultipartFile file) {
        this.file = file;
    }

    @Override
    public DTOType getType() {
        return type;
    }
}
