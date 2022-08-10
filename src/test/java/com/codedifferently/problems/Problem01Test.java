package com.codedifferently.problems;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Problem01Test {
    private Problem01 countDupLetters;

    @BeforeEach
    public void setUp(){
        countDupLetters = new Problem01();
    }

    @Test
    @DisplayName("Count the number of times you see the letter A or a")
    public void countDuplicateLettersTest01(){
        String input = "The Apple was in the basket, in supermarket.";
        Integer expectedNumber = 4;
        Integer actualNumber = countDupLetters.countDuplicateLetters(input, "a");
        Assertions.assertEquals(expectedNumber, actualNumber);
    }

    @Test
    @DisplayName("Count the number of times you see the letter Z or z")
    public void countDuplicateLettersTest02(){
        String input = "The Zebra was zippering its zipper, and the bee was buzzing its buzzer.";
        Integer expectedNumber = 7;
        Integer actualNumber = countDupLetters.countDuplicateLetters(input, "z");
        Assertions.assertEquals(expectedNumber, actualNumber);
    }

    @Test
    @DisplayName("Count the number of times you see the letter F or f")
    public void countDuplicateLettersTest03(){
        String input = "Fluffy flow fell on the floor. She flopped.";
        Integer expectedNumber = 5;
        Integer actualNumber = countDupLetters.countDuplicateLetters(input, "f");
        Assertions.assertEquals(expectedNumber, actualNumber);
    }
}
