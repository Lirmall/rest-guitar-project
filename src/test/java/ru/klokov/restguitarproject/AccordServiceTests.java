package ru.klokov.restguitarproject;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.mock.web.MockMultipartFile;
import ru.klokov.restguitarproject.model.dto.AccordDTO;
import ru.klokov.restguitarproject.service.AccordService;
import ru.klokov.restguitarproject.service.utils.FileRecorder;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class AccordServiceTests {

    @Mock
    FileRecorder testImageFileRecorder;

    MockMultipartFile testMockMultipartFile = new MockMultipartFile("testFile", (byte[]) null);

    @InjectMocks
    AccordService testAccordService;

    @Captor
    ArgumentCaptor<AccordDTO> accordDTOCaptor;

    @Test
    public void add() throws IOException {

        AccordDTO testAccordDTO = new AccordDTO("testAccordDTO", "II2", testMockMultipartFile);

        Mockito.doNothing().when(testImageFileRecorder).add(Mockito.any());

        testAccordService.add(testAccordDTO);

        Mockito.verify(testImageFileRecorder).add(accordDTOCaptor.capture());
        AccordDTO accordDTOCaptorValue = accordDTOCaptor.getValue();

        assertEquals(accordDTOCaptorValue.getName(), testAccordDTO.getName());
    }
}
