package ru.klokov.restguitarproject;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.mock.web.MockMultipartFile;
import ru.klokov.restguitarproject.model.dto.AccordDTO;
import ru.klokov.restguitarproject.service.utils.ImageRecorder;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@ExtendWith(MockitoExtension.class)
public class ImageRecorderTests {

    MockMultipartFile testMockMultipartFile;

    AccordDTO testAccordDTO;

    ImageRecorder spyImageRecorder = Mockito.spy(ImageRecorder.class);

    @Test
    public void addNormal() throws IOException {
        String expectedFilePath = "J:\\Develop\\rest-guitar-project\\src\\main\\resources\\static\\images\\accords\\";

        String testFileName = "test_filename";
        String testFingerPosition = "test_fingerPosition";
        testMockMultipartFile = new MockMultipartFile("testFile", (byte[]) null);

        testAccordDTO = new AccordDTO(testFileName, testFingerPosition, testMockMultipartFile);

        Mockito.doNothing().when(spyImageRecorder).write(Mockito.any(), Mockito.any());

        spyImageRecorder.add(testAccordDTO);

        assertEquals(spyImageRecorder.getFilePath(testAccordDTO), expectedFilePath);
    }

    @Test
    public void addWithException() {

        assertThrows(NullPointerException.class, () -> spyImageRecorder.add(null));
    }
}
