package com.codedifferently.problems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Problem03Test {
    @Test
    public void numberFamily01(){
        Problem03 solution = new Problem03();
        Integer number = 4;
        Integer[] possibleFamilyMembers = new Integer[]{3,2,1,6,8,4};
        Integer[] expected = new Integer[]{1,2,3,4};
        Integer[]  actual = solution.numberFamily(number, possibleFamilyMembers);
        Assertions.assertArrayEquals(expected,actual);
    }

    @Test
    public void numberFamily02(){
        Problem03 solution = new Problem03();
        Integer number = 8;
        Integer[] possibleFamilyMembers = new Integer[]{3,7,10,6,8,9,2,1};
        Integer[] expected = new Integer[]{6,7,8,9,10};
        Integer[]  actual = solution.numberFamily(number, possibleFamilyMembers);
        Assertions.assertArrayEquals(expected,actual);
    }
}
