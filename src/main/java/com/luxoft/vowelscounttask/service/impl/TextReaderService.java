package com.luxoft.vowelscounttask.service.impl;

import com.luxoft.vowelscounttask.exception.ServiceExceptions;
import com.luxoft.vowelscounttask.service.ITextReaderService;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TextReaderService implements ITextReaderService {
    private final String INPUT_FILE_NAME = "INPUT.TXT";
    private final String PATH = "src/main/resources/";

    @Override
    public String readTextFromResources() throws ServiceExceptions {
        String textContent = "";
        try {
            textContent = Files.readString(Paths.get(PATH + INPUT_FILE_NAME).toAbsolutePath());
        } catch (IOException e) {
            throw new ServiceExceptions(e);
        }
        return textContent;
    }
}
