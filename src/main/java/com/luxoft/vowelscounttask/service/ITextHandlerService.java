package com.luxoft.vowelscounttask.service;

import com.luxoft.vowelscounttask.entity.Result;

import java.util.List;

public interface ITextHandlerService {
    List<String> getWordsFromTextWithoutPunctuations(String text);

    List<Result> getListOfVowelsAndLength(List<String> words);

    List<Result> getAvgOfVowels(List<Result> listOfVowelsAndLength);

    List<Result> getSetOfVowelsWithLengthAndAvg(List<Result> listOfVowelsAndLengthAndAvg);

}
