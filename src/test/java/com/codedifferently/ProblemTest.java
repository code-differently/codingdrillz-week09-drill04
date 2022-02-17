package com.codedifferently;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProblemTest {

    @Test
    public void alphabetOrderTest01(){
        String input = "wutang";
        String expected = "agntuw";
        String actual = Problem.alphabetOrder(input);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void alphabetOrderTest02(){
        String input = "method man";
        String expected = "adehmmnot";
        String actual = Problem.alphabetOrder(input);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void alphabetOrderTest03(){
        String input = "raekwon the chef";
        String expected = "aceeefhhknortw";
        String actual = Problem.alphabetOrder(input);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void alphabetOrderTest04(){
        String input = "old dirty b@$t@rd";
        String expected = "bdddilorrtty";
        String actual = Problem.alphabetOrder(input);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void dashInsertTest01(){
        String input = "454793";
        String expected = "4547#9#3";
        String actual = Problem.hashInsert(input);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void dashInsertTest02(){
        String input = "24687751";
        String expected = "24687#7#5#1";
        String actual = Problem.hashInsert(input);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void dashInsertTest03(){
        String input = "2468";
        String expected = "2468";
        String actual = Problem.hashInsert(input);
        Assertions.assertEquals(expected, actual);
    }
}
