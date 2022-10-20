package driver;

import calculator.PrimalityTester;

public class Main {
    private static final int ITERATIONS = 100000;

    public static void main(String[] args) {
        for (int i = 1; i < ITERATIONS; i++) {
            if (PrimalityTester.test(i)) System.out.print(i + " ");
        }

        System.out.println();

        for (int i = 1; i < ITERATIONS; i++) {
            if (PrimalityTester.bruteForce.test(i)) System.out.print(i + " ");
        }
    }
}