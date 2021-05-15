import java.nio.file.attribute.UserDefinedFileAttributeView;
import java.security.InvalidAlgorithmParameterException;
import java.util.Scanner;

public class NQueenTest {
    public static void main(String[] args) throws InvalidAlgorithmParameterException {
        //UsabilityTest();
        PerformaceTest();
    }

    public static void UsabilityTest() throws InvalidAlgorithmParameterException {
        int queens = 8;
        NQueen.initField(queens);
            if(!NQueen.solveNQueen(queens, 0))
                System.out.println("No combination possible!");
            else
                    for (int k = 0; k < queens ;k++ ){
            for (int j = 0; j < queens ;j++ )
                System.out.print(NQueen.array[k][j] > 0 ? "Q " : ". ");
            System.out.println();
        }

    }

    public static void PerformaceTest() {
        long timeBeforeTest;
        for(int i = 0; i < 50; i++) {
            timeBeforeTest = System.currentTimeMillis();
            try {
                NQueen.initField(i);
                NQueen.solveNQueen(i, 0);
                long timeAfterTest = System.currentTimeMillis();
                long time = timeAfterTest - timeBeforeTest;
                System.out.println(i + ": " + time);
            } catch(Exception e) {
                continue;
            }
        }
    }

    public static void StressTest() {
        
    }
}
