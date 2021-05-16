import java.util.Random;

public class CountDigitsTester {

    public void MonkeyTest() {
        System.out.println("Monkey Test");
        Random leRandom = new Random();
        int numOfRounds = leRandom.nextInt(100);
        System.out.println("Number of tries: " + numOfRounds);
        for (int i = 0; i < numOfRounds; i++) {
            int azAlany = leRandom.nextInt();
            System.out.println(azAlany);
            System.out.println(CountDigits.countDigits(azAlany));
        }
    }

    public void BlckBxNumIsNegative() {
        System.out.println("Black Box, parameter is -88");
        try {
            System.out.println(-88);
            System.out.println(CountDigits.countDigits(-88));
        }
        catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    public void BlckBxNumIsPositive() {
        System.out.println("Black Box, parameter is 88");
        try {
            System.out.println(88);
            System.out.println(CountDigits.countDigits(88));
        }
        catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    public void BlckBxNumIs1() {
        System.out.println("Black Box, parameter is 1, expected result is 1");
        try {
            System.out.println(CountDigits.countDigits(1));
        }
        catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    public void BlckBxNumIs10() {
        System.out.println("Black Box, parameter is 10, expected result is 2");
        try {
            System.out.println(CountDigits.countDigits(10));
        }
        catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    public void BlckBxNumIs100() {
        System.out.println("Black Box, parameter is 100, expected result is 3");
        try {
            System.out.println(CountDigits.countDigits(100));
        }
        catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    public void BlckBxNumIs1000() {
        System.out.println("Black Box, parameter is 1000, expected result is 4");
        try {
            System.out.println(CountDigits.countDigits(1000));
        }
        catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    public void BlckBxNumIs10000() {
        System.out.println("Black Box, parameter is 10000, expected result is 5");
        try {
            System.out.println(CountDigits.countDigits(10000));
        }
        catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    public void BlckBxParamArrayNull() {
        System.out.println("Black Box Array containing parameter is null");
        int[] blckBxArray = null;
        try {
            CountDigits.countDigits(blckBxArray[0]);
        }
        catch (Exception e) {
            System.out.println(e.toString());
        }
    }

}
