import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class PrimeFactorsTest {
    public static void main(String[] args) {
        //UsabilityTest();
        PerformanceTest();
    }

    private static void UsabilityTest() {
        int n = 719*661*761;
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

    private static void PerformanceTest() {
        int n = 41;
        int m = 48315;
        int o = 900349;
        int p = 97*37*1889*7607*6653;
        long timeBeforeTest = System.currentTimeMillis();
        long timeAfterTest;
        PrimeFactors.primeFactors(n);
        timeAfterTest = System.currentTimeMillis();
        System.out.println(timeAfterTest-timeBeforeTest);

        timeBeforeTest = System.currentTimeMillis();
        PrimeFactors.primeFactors(m);
        timeAfterTest = System.currentTimeMillis();
        System.out.println(timeAfterTest-timeBeforeTest);

        timeBeforeTest = System.currentTimeMillis();
        PrimeFactors.primeFactors(o);
        timeAfterTest = System.currentTimeMillis();
        System.out.println(timeAfterTest-timeBeforeTest);

        timeBeforeTest = System.currentTimeMillis();
        PrimeFactors.primeFactors(p);
        timeAfterTest = System.currentTimeMillis();
        System.out.println(timeAfterTest-timeBeforeTest);
    }
}
