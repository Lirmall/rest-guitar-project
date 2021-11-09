package ru.klokov.restguitarproject.model.dto;

import org.springframework.web.multipart.MultipartFile;


public class AccordDTO {
    String name;
    String fingerPosition;
    MultipartFile image;

    public AccordDTO(String name, String fingerPosition, MultipartFile image) {
        this.name = name;
        this.fingerPosition = fingerPosition;
        this.image = image;
    }

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

    public MultipartFile getImage() {
        return image;
    }

    public void setImage(MultipartFile image) {
        this.image = image;
    }


}
