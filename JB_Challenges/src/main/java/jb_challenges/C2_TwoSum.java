package jb_challenges;
import java.util.Arrays;
import java.util.HashMap;

public class C2_TwoSum {

    public static void execute() {
        int target;
        int[] testArray, res;

        //////////////////////////////////////////////////////////////////
        target = 9;
        testArray = new int[] { 2, 7, 11, 15 };

        System.out.println("First Test");
        System.out.println(Arrays.toString(testArray));

        res = findTwoSumWithMap(testArray, target);
        System.out.println(Arrays.toString(res));
        System.out.println("");
        //////////////////////////////////////////////////////////////////

        target = 40;
        testArray = new int[] { 9, 1, 2, 27, 13, 39 };

        System.out.println("Second Test");
        System.out.println(Arrays.toString(testArray));

        res = findTwoSumWithMap(testArray, target);
        System.out.println(Arrays.toString(res));
    }

    public static int[] findTwoSumWithMap(int[] numbers, int target) {
        HashMap<Integer, Integer> previousNumbers = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {
            int currentNumber = numbers[i];
            int delta = target - currentNumber;
            if (previousNumbers.containsKey(delta)) {
                int index = previousNumbers.get(delta);
                return new int[] { index, i};
            } else {
                previousNumbers.put(currentNumber, i);
            }
        }

        return new int[] {};
    }

    public static int[] findTwoSumBruteForce(int[] numbers, int target) {
        int firstNum, secondNum, result;
        int i, j;

        for (i = 0; i < numbers.length; i++) {
            firstNum = numbers[i];
            for (j = 0; j < numbers.length; j++) {
                if (i == j) {
                    continue;
                }

                secondNum = numbers[j];
                result = firstNum + secondNum;

                if (result == target) {
                    System.out.println("First index:\t" + i);
                    System.out.println("Second index:\t" + j);
                    System.out.println(firstNum + " + " + secondNum + " = " + result);
                    return new int[] { i, j };
                }
            }
        }

        return new int[] {};
    }
}