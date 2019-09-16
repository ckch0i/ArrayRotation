public class RotateArray {


    public static int[] rotateArray(int[] input, int numberOfRotations) {
        for (int i = 0; i < numberOfRotations; i++) {
            input = rotateArrayOnce(input);
        }
        return input;
    }

    private static int[] rotateArrayOnce(int[] input) {
        int tempFirstValue = input[0];
        for (int i = 1; i < input.length; i++) {
            input[i - 1] = input[i];
        }
        input[input.length - 1] = tempFirstValue;
        return input;
    }
}
