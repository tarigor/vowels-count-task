package com.luxoft.vowelscounttask.service;

import com.luxoft.vowelscounttask.entity.Result;

import java.util.List;

public interface ITextWriterService {
    void writeResultToFile(List<Result> resultList);
}
