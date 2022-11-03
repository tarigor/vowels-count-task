package com.luxoft.vowelscounttask.service;

import com.luxoft.vowelscounttask.exception.ServiceExceptions;

public interface ITextReaderService {
    String readTextFromResources() throws ServiceExceptions;
}
