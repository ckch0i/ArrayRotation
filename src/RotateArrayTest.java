import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertArrayEquals;

@RunWith(Parameterized.class)
public class RotateArrayTest {
    private int[] inputArray;
    private int numberOfRotations;
    private int[] expectedResult;

    public RotateArrayTest(int[] inputArray, int numberOfRotations, int[] expectedResult) {
        this.inputArray = inputArray;
        this.numberOfRotations = numberOfRotations;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters(name = "Run {index}: inputArray={0}, numberOfRotations={1}, expectedResult={2}")
    public static Collection<Object[]> inputData() {
        return Arrays.asList(new Object[][]{
                {new int[]{1, 2, 3, 4, 5}, 2, new int[]{3, 4, 5, 1, 2}},
                {new int[]{3, 4, 5, 2, 5, 6, 7}, 4, new int[]{5, 6, 7, 3, 4, 5, 2}},
                {new int[]{1, 2, 3, 4, 5}, 2, new int[]{3, 4, 5, 1, 2}},
                {new int[]{3, 2, 3, 4}, 2, new int[]{3, 4, 3, 2}},
                {new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, 3, new int[]{4, 5, 6, 7, 8, 9, 1, 2, 3}},
                {new int[]{6, 4, 3, 3, 4, 2, 2}, 2, new int[]{3, 3, 4, 2, 2, 6, 4}},
                {new int[]{3, 1, 2, 5, 2}, 1, new int[]{1, 2, 5, 2, 3}}
        });
    }


    @Test
    public void congregratedTests() {
        RotateArray rotateArray = new RotateArray();
        assertArrayEquals(expectedResult, rotateArray.rotateArray(inputArray, numberOfRotations));
    }


}
