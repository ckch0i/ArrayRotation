import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        System.out.print(Arrays.toString(rotateArray(new int[]{1, 2, 3, 4, 5}, 2)));

    }


    private static int[] rotateArray(int[] input, int numberOfRotations) {
        for (int i = 0; i < numberOfRotations; i++) {
            input = rotateArrayOnce(input);
        }
        return input;
    }

    private static int[] rotateArrayOnce(int[] input) {
        int[] result = new int[input.length];
        int tempLeftValue = input[0];
        for (int i = 1; i < input.length; i++) {
            result[i - 1] = input[i];
        }
        result[result.length - 1] = tempLeftValue;
        return result;

    }
}
