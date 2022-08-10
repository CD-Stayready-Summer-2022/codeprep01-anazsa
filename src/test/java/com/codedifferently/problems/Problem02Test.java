package com.codedifferently.problems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class Problem02Test {
    @Test
    public void challengeTest01(){
        ArrayList<String> cousins = new ArrayList<>(Arrays.asList("Hakim", "Greg", "Loki", "Frank", "Ed"));
        Integer startingIndex = 1;
        String name = "Hakim";
        Integer expected = 1;
        Integer actual = Problem02.cousinTag(cousins,startingIndex, name);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void challengeTest02(){
        ArrayList<String> cousins = new ArrayList<>(Arrays.asList("Hakim", "Greg", "Loki", "Frank", "Ed", "Peter", "Victor"));
        Integer startingIndex = 5;
        String name = "Hakim";
        Integer expected = 2;
        Integer actual = Problem02.cousinTag(cousins,startingIndex, name);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void challengeTest03(){
        ArrayList<String> cousins = new ArrayList<>(Arrays.asList("Hakim", "Greg", "Loki", "Frank", "Ed", "Peter", "Victor"));
        Integer startingIndex = 4;
        String name = "Peter";
        Integer expected = 1;
        Integer actual = Problem02.cousinTag(cousins,startingIndex, name);
        Assertions.assertEquals(expected, actual);
    }
}
