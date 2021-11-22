package ru.klokov.restguitarproject;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.test.web.servlet.MockMvc;
import ru.klokov.restguitarproject.service.AccordService;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.multipart;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest
public class AccordControllerTests {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private AccordService accordService;


    @Test
    public void add() throws Exception {

        Mockito.doNothing().when(accordService).add(Mockito.any());

        MockMultipartFile testFile = new MockMultipartFile("image", (byte[]) null);


        mockMvc.perform(multipart("http://localhost:8080/admin/accord/upload").file(testFile)
                        .param("name", "Am")
                        .param("fingerPosition","II2")
                        .contentType(MediaType.MULTIPART_FORM_DATA))
                .andExpect(status().isOk())
                .andReturn();
    }
}
