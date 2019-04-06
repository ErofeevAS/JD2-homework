package com.gmail.erofeev.st.alexei.repository;

import com.gmail.erofeev.st.alexei.repository.impl.FileRepositoryImpl;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class FileServiceImplTest {
    private final static String TEST_FILE = "src\\test\\resources\\file.txt";

    @Test
    public void shouldReturnCollectionOfStringsNotNull() {
        FileRepository fileService = FileRepositoryImpl.getInstance();
        List<String> lines = fileService.getLines(TEST_FILE);
        Assert.assertNotNull(lines);

    }
}
