package com.gmail.erofeev.st.alexei.service.impl;

import com.gmail.erofeev.st.alexei.repository.FileRepository;
import com.gmail.erofeev.st.alexei.repository.impl.FileRepositoryImpl;
import com.gmail.erofeev.st.alexei.service.FileService;
import com.gmail.erofeev.st.alexei.service.NumberAdderService;

import java.util.List;
import java.util.stream.Collectors;

public class FileServiceImpl implements FileService {
    private static FileService instance;

    private FileServiceImpl() {
    }

    private FileRepository fileRepository = FileRepositoryImpl.getInstance();
    private NumberAdderService numberAdderService = NumberAdderServiceImpl.getInstance();

    public static FileService getInstance() {
        if (instance == null) {
            instance = new FileServiceImpl();
        }
        return instance;
    }

    @Override
    public String getPatternStringFromFile(String fileName) throws RuntimeException{
        List<String> lines = fileRepository.getLines(fileName);
        String result = lines.stream()
                .map(line -> numberAdderService.add(line) + "")
                .collect(Collectors.joining(","));
        return result;
    }
}
