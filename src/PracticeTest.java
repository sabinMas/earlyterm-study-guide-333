import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

import org.junit.jupiter.api.Test;
public class PracticeTest {

    // TODO: Make more tests for maxDiff
    @Test
    void testMaxDiffPositiveAndNegative() {
        // Arrange
        int[] numbers = {8, -2, 9, -5};

        // Act
        int actual = Practice.maxDiff(numbers);

        // Assert
        // Largest: 9, Smallest: -5, Difference: 9 - -5 = 14
        System.out.println("Result of maxDiff test: " + actual);
        assertEquals(14, actual);
    }
    @Test
    void testMaxDiffNegativeNumbers() {
        int[] nums = {-10, -3, -1, -7};
        assertEquals(9, Practice.maxDiff(nums));
    }

    @Test
    void testMaxDiffAllSameNumbers() {
        int[] nums = {4, 4, 4, 4};
        assertEquals(0, Practice.maxDiff(nums));
    }

        
    // Tests for longestWordGiven1stChar
    @Test
    void testLongestWordGiven1stChar() {
        ArrayList<String> words = new ArrayList<>();
        words.add("apple");
        words.add("avocado");
        words.add("banana");
        words.add("ant");
        assertEquals("avocado", Practice.longestWordGiven1stChar(words, 'a'));
    }

    @Test
    void testLongestWordGiven1stCharSingleMatch() {
        ArrayList<String> words = new ArrayList<>();
        words.add("dog");
        words.add("cat");
        words.add("deer");
        assertEquals("cat", Practice.longestWordGiven1stChar(words, 'c'));
    }

    // Tests for lessThanLongerThan
    @Test
    void testLessThanLongerThan() {
        HashMap<String, String> words = new HashMap<>();
        words.put("1", "hi");
        words.put("2", "hello");
        words.put("3", "hey");
        words.put("4", "howdy");
        assertEquals(3, Practice.lessThanLongerThan(words, 2, 6));
    }

    @Test
    void testLessThanLongerThanNoMatches() {
        HashMap<String, String> words = new HashMap<>();
        words.put("1", "hi");
        words.put("2", "ok");
        assertEquals(0, Practice.lessThanLongerThan(words, 3, 6));
    }

    // Tests for diffOddEven
    @Test
    void testDiffOddEven() {
        HashSet<Integer> nums = new HashSet<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        assertEquals(1, Practice.diffOddEven(nums));
    }

    @Test
    void testDiffOddEvenAllEven() {
        HashSet<Integer> nums = new HashSet<>();
        nums.add(2);
        nums.add(4);
        nums.add(6);
        nums.add(8);
        assertEquals(-4, Practice.diffOddEven(nums));
    }

    @Test
    void testDiffOddEvenAllOdd() {
        HashSet<Integer> nums = new HashSet<>();
        nums.add(1);
        nums.add(3);
        nums.add(5);
        assertEquals(3, Practice.diffOddEven(nums));
    }

    // Tests for secondLargest
    @Test
    void testSecondLargest() {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(1, 100);
        map.put(5, 200);
        map.put(3, 300);
        map.put(9, 400);
        assertEquals(5, Practice.secondLargest(map));
    }

    @Test
    void testSecondLargestTwoKeys() {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(7, 100);
        map.put(2, 200);
        assertEquals(2, Practice.secondLargest(map));
    }
    
}


