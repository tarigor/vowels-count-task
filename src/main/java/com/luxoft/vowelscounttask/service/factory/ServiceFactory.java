package com.luxoft.vowelscounttask.service.factory;

import com.luxoft.vowelscounttask.service.impl.TextHandlerService;
import com.luxoft.vowelscounttask.service.impl.TextReaderService;
import com.luxoft.vowelscounttask.service.impl.TextWriterService;

public class ServiceFactory {
    private static final ServiceFactory serviceFactory = new ServiceFactory();
    private final TextReaderService textReaderService;
    private final TextHandlerService textHandlerService;
    private final TextWriterService textWriterService;

    public ServiceFactory() {
        textReaderService = new TextReaderService();
        textHandlerService = new TextHandlerService();
        textWriterService = new TextWriterService();
    }

    public static ServiceFactory getInstance() {
        return serviceFactory;
    }

    public TextReaderService getTextReaderService() {
        return textReaderService;
    }

    public TextHandlerService getTextHandlerService() {
        return textHandlerService;
    }

    public TextWriterService getTextWriterService() {
        return textWriterService;
    }

}
