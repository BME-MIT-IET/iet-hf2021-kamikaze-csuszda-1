import java.nio.file.attribute.UserDefinedFileAttributeView;
import java.security.InvalidAlgorithmParameterException;
import java.util.Scanner;

public class NQueenTest {
    public static void main(String[] args) throws InvalidAlgorithmParameterException {
        UsabilityTest();
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

}
