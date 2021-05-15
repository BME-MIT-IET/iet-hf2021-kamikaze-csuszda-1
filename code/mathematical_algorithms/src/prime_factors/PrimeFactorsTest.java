import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class PrimeFactorsTest {
    public static void main(String[] args) {
        UsabilityTest();
    }

    private static void UsabilityTest() {
        int n = -1674;
        System.out.println("Primefactors of " + n);
        List<Integer> al =  PrimeFactors.primeFactors(n);
        //remove duplicate
        // if you want the duplicate remove the following 3 lines
        Set<Integer> hs = new HashSet<>();
        hs.addAll(al);
        al.clear();
        al.addAll(hs);
        for (Integer integer : al) {
            System.out.println(integer);
        }
    }
}
