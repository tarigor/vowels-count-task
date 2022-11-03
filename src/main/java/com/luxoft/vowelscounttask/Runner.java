package com.luxoft.vowelscounttask;

import com.luxoft.vowelscounttask.entity.Result;
import com.luxoft.vowelscounttask.exception.ServiceExceptions;
import com.luxoft.vowelscounttask.service.factory.ServiceFactory;

import java.util.List;

public class Runner {
    public static void main(String[] args) throws ServiceExceptions {
        ServiceFactory service = ServiceFactory.getInstance();

        String text = service.getTextReaderService().readTextFromResources();
        List<String> words = service.getTextHandlerService().getWordsFromTextWithoutPunctuations(text);
        List<Result> listOfVowelsAndLength = service.getTextHandlerService().getListOfVowelsAndLength(words);
        List<Result> listOfVowelsAndLengthAndAvg = service.getTextHandlerService().getAvgOfVowels(listOfVowelsAndLength);
        List<Result> setOfVowelsAndLengthAndAvg = service.getTextHandlerService().getSetOfVowelsWithLengthAndAvg(listOfVowelsAndLengthAndAvg);

        service.getTextWriterService().writeResultToFile(setOfVowelsAndLengthAndAvg);
    }
}
