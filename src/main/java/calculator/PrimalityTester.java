package calculator;

public class PrimalityTester {
    /**
     * Tests if number is prime using <a href="https://en.wikipedia.org/wiki/Primality_test">6k ± 1 optimization</a>
     * @param number number to test
     * @return true if number is prime, false otherwise
     */
    public static boolean test(int number) {
        if (Math.abs(number) <= 3) return true;
        else if (number % 2 == 0 || number % 3 == 0) return false;
        else return testRecursively(number, 5);
    }

    private static boolean testRecursively(int number, int i) {
        if (i * i > number) return true;
        else if (number % i == 0 || number % (i + 2) == 0) return false;
        else return testRecursively(number, i + 6);
    }

    public static class bruteForce {

        /**
         * Tests if number is prime using <a href="https://en.wikipedia.org/wiki/Trial_division">trial division</a>
         * @param number number to test
         * @return true if number is prime, false otherwise
         */
        public static boolean test(int number) {
            return testRecursively(number, 2);
        }

        public static boolean testRecursively(int number, int i) {
            if (i * i > number) return true;
            else if (number % i == 0) return false;
            else return testRecursively(number, ++i);
        }
    }
}
