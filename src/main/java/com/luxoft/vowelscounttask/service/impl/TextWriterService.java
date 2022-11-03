package com.luxoft.vowelscounttask.service.impl;

import com.luxoft.vowelscounttask.entity.Result;
import com.luxoft.vowelscounttask.exception.ServiceExceptions;
import com.luxoft.vowelscounttask.service.ITextWriterService;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class TextWriterService implements ITextWriterService {
    private final String OUTPUT_FILE_NAME = "OUTPUT.TXT";
    private final String PATH = System.getProperty("user.dir") + "/src/main/resources/";

    @Override
    public void writeResultToFile(List<Result> resultList) {
        try {
            FileWriter writer = new FileWriter(PATH + OUTPUT_FILE_NAME);
            for (Result result : resultList) {
                writer.write(result.toStringFinal() + System.lineSeparator());
            }
            writer.close();
        } catch (IOException e) {
            new ServiceExceptions(e);
        }
    }
}
