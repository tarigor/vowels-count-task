package com.luxoft.vowelscounttask.service.impl;

import com.luxoft.vowelscounttask.entity.Result;
import com.luxoft.vowelscounttask.service.factory.ServiceFactory;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class TextHandlerServiceTest extends TestCase {

    TextHandlerService handlerService = ServiceFactory.getInstance().getTextHandlerService();

    @Test
    public void testGetWordsFromTextWithoutPunctuations() {
        String text = "Hello world!!!";
        List<String> expectedResult = new ArrayList<String>();
        expectedResult.add("Hello");
        expectedResult.add("world");

        List<String> resultList = handlerService.getWordsFromTextWithoutPunctuations(text);

        Assert.assertArrayEquals(expectedResult.toArray(), resultList.toArray());
    }

    @Test
    public void testGetListOfVowelsAndLength() {
        List<String> listOfWords = new ArrayList<String>();
        listOfWords.add("Hello");
        listOfWords.add("world");

        Result result1 = new Result(new ArrayList<>(Arrays.asList("e", "o")), 5);
        Result result2 = new Result(new ArrayList<>(Arrays.asList("o")), 5);
        List<Result> expectedResultList = new ArrayList<>();
        expectedResultList.add(result1);
        expectedResultList.add(result2);

        List<Result> resultList = handlerService.getListOfVowelsAndLength(listOfWords);

        Assert.assertArrayEquals(expectedResultList.toArray(), resultList.toArray());
    }

    @Test
    public void testGetAvgOfVowels() {
        Result result1 = new Result(new ArrayList<>(Arrays.asList("e", "o")), 5);
        Result result2 = new Result(new ArrayList<>(Arrays.asList("o")), 5);
        List<Result> inputDataList = new ArrayList<>();
        inputDataList.add(result1);
        inputDataList.add(result2);

        Result expectedResult1 = new Result(new ArrayList<>(Arrays.asList("e", "o")), 5, 2.0);
        Result expectedResult2 = new Result(new ArrayList<>(Arrays.asList("o")), 5, 1.5);
        List<Result> expectedResultList = new ArrayList<>();
        expectedResultList.add(expectedResult1);
        expectedResultList.add(expectedResult2);

        List<Result> resultList = handlerService.getAvgOfVowels(inputDataList);

        Assert.assertArrayEquals(expectedResultList.toArray(), resultList.toArray());
    }

    @Test
    public void testGetSetOfVowelsWithLengthAndAvg() {
        Result inputResult1 = new Result(new ArrayList<>(Arrays.asList("e", "o")), 5, 2.0);
        Result inputResult2 = new Result(new ArrayList<>(Arrays.asList("o")), 5, 1.5);
        List<Result> inputResultList = new ArrayList<>();
        inputResultList.add(inputResult1);
        inputResultList.add(inputResult2);

        Result expectedResult1 = new Result(Set.copyOf(new ArrayList<>(Arrays.asList("e", "o"))), 5, 2.0);
        Result expectedResult2 = new Result(Set.copyOf(new ArrayList<>(Arrays.asList("o"))), 5, 1.5);
        List<Result> expectedResultList = new ArrayList<>();
        expectedResultList.add(expectedResult1);
        expectedResultList.add(expectedResult2);

        List<Result> resultList = handlerService.getSetOfVowelsWithLengthAndAvg(inputResultList);

        Assert.assertArrayEquals(expectedResultList.toArray(), resultList.toArray());
    }
}