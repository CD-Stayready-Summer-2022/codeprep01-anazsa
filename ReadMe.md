# Problem 01 - Count Duplicate Letters

Given a letter count the number of times it appears:

* Use a HashMap to accomplish this task.


```java
@Test
@DisplayName("Count the number of times you see the letter A or a")
public void countDuplicateLettersTest01(){
    String input = "The Apple was in the basket, in supermarket.";
    Integer expectedNumber = 4;
    Integer actualNumber = countDupLetters.countDuplicateLetters(input, "a");
    Assertions.assertEquals(expectedNumber, actualNumber);
}
```

# Problem 02 - Cousin Tag

You have program representing a few cousins at the family reunion want to play a game of tag. The program holds n cousins names in the order they are standing left to right. You want to move through one name at a time, either moving left or right, in the shortest amount of moves. The application's name display is circular, so when the last person in the array is reached in either direction, the next person is at the other end of the array.

Given the name of the next person needed, determin the minimum number of left or right moves to reach it.

Example:

```
cousins = ["Hakim", "Greg", "Loki", "Frank", "Ed"]
startingIndex = 1
target = "Hakim"
```

The person currently selected is "Greg" at index 1. He needs to tag "Hakim" at index 0. It can be reached by moving right 3 steps left 1 step. The minium number of moves is 1. 

# Problem 03 - Are we related

You will be given an integer called number and an array called possibleFamilyMembers
your jobs is to find the number's family members.

A family member is any value that's with in 1 of any other number in the family.

## Example Output

```
So for example if the number = 4, and the possibleFamilyMembers is [1,4,3,5]
The actualFamilyMembers would be [3,4,5]
3 is 1 away from 4
4 is equal to 4
4 is 1 away from 5
 while
1 is not included because the closest releation to 1 is 3 and that's 2 away.
```

## Submission
Push your changes to GitHub