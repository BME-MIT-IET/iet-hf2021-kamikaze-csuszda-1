import java.util.Arrays;
import java.util.Random;

public class TwoSumTester {
    public void MonkeyTest() {
        System.out.println("Monkey test:");
        int[] monkeyArray;
        int monkeyInt;

        Random leRandom = new Random();
        int randomNum = leRandom.nextInt(1000000);

        monkeyArray = new int[randomNum];
        System.out.println("Size of the Monkey Array:");
        System.out.println(randomNum);

        monkeyInt = leRandom.nextInt();
        System.out.println("Monkey target:");
        System.out.println(monkeyInt);

        for (int i = 0; i < randomNum; i++) {
            monkeyArray[i] = leRandom.nextInt();
        }
        try {
            System.out.println(Arrays.toString(two_sum.two_sum(monkeyArray, monkeyInt)));
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    public void BlckBxArrayParamNull() {
        System.out.println("Black Box: Array is null");
        int[] blckBxArray = null;
        int blckBxTarget = 2;
        System.out.println("Target: " + blckBxTarget);

        try {
            System.out.println(Arrays.toString(two_sum.two_sum(blckBxArray, blckBxTarget)));
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    public void BlckBxPosArrayNegTarget() {
        System.out.println("Black Box: Array is all positive, target negative");
        int[] blckBxArray = {5, 8, 97, 2, 34, 38};
        int blckBxTarget = -8;
        System.out.println("Target: " + blckBxTarget);

        try {
            System.out.println(Arrays.toString(two_sum.two_sum(blckBxArray, blckBxTarget)));
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    public void BlckBxNegArrayPosTarget() {
        System.out.println("Black Box: Array is all negative, target is positive");
        int[] blckBxArray = {-5, -8, -97, -2, -34, -38};
        int blckBxTarget = 66;
        System.out.println("Target: " + blckBxTarget);

        try {
            System.out.println(Arrays.toString(two_sum.two_sum(blckBxArray, blckBxTarget)));
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    public void BlckBxUnfilledArray() {
        System.out.println("Black Box: Array is unfilled");
        int[] blckBxArray = new int[10];
        int blckBxTarget = 2;
        System.out.println("Target: " + blckBxTarget);

        try {
            System.out.println(Arrays.toString(two_sum.two_sum(blckBxArray, blckBxTarget)));
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    public void BlckBxKnownData() {
        System.out.println("Black Box: Target is 5, expected results are: [2, 3]");
        int[] blckBxArray = {12, 56, 2, 3, 4, 4, 8};
        int blckBxTarget = 5;

        try {
            System.out.println(Arrays.toString(two_sum.two_sum(blckBxArray, blckBxTarget)));
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }


}
