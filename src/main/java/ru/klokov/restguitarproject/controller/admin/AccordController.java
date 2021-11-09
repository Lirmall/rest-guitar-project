package ru.klokov.restguitarproject.controller.admin;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import ru.klokov.restguitarproject.model.dto.AccordDTO;
import ru.klokov.restguitarproject.service.AccordService;

import javax.validation.constraints.NotBlank;


@RestController
@RequestMapping("/admin/accord")
public class AccordController {

    AccordService accordService;

    public AccordController(AccordService accordService) {
        this.accordService = accordService;
    }

    @PostMapping(value = "/upload", consumes = {"multipart/form-data"})
    public void add(@RequestPart("name") @NotBlank String name,
                    @RequestPart("fingerPosition") @NotBlank String fingerPosition,
                    @RequestPart("image") @NotBlank MultipartFile image) {

        AccordDTO accordDTO = new AccordDTO(name, fingerPosition, image);
        accordService.add(accordDTO);
    }

    public void edit() {

    }

    public void delete() {

    }
}
