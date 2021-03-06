package ru.klokov.restguitarproject.controller.admin;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import ru.klokov.restguitarproject.controller.admin.response.Response;
import ru.klokov.restguitarproject.model.dto.AccordDTO;
import ru.klokov.restguitarproject.service.AccordService;

import javax.validation.constraints.NotBlank;
import java.io.IOException;


@RestController
@RequestMapping("/admin/accord")
public class AccordController {

    AccordService accordService;

    public AccordController(AccordService accordService) {
        this.accordService = accordService;
    }

    @PostMapping(value = "/upload", consumes = MediaType.MULTIPART_FORM_DATA_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Response add(@RequestParam("name") @NotBlank String name ,
                        @RequestParam("fingerPosition") @NotBlank String fingerPosition,
                        @RequestPart("image") @NotBlank MultipartFile image) throws IOException {

        AccordDTO accordDTO = new AccordDTO(name, fingerPosition, image);
        accordService.add(accordDTO);

        return new Response("Result of uploading", "No error", "No error");

    }

    public void edit() {

    }

    public void delete() {

    }
}
