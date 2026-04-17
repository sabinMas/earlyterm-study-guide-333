import static org.junit.jupiter.api.Assertions.*;
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
    void testMaxDiffSingleElement() {
        int[] nums = {5};
        assertEquals(0, Practice.maxDiff(nums));
    }
    
}


