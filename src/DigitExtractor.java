/**
 * Exercise 3 — DigitExtractor
 *
 * Given a 3-digit integer, print each digit on its own line,
 * then print the sum of the digits.
 *
 * Example: 472
 *   Hundreds: 4
 *   Tens:     7
 *   Ones:     2
 *   Sum:      13
 *
 * Hint: n % 10 gives you the last digit. n / 10 removes it.
 */
public class DigitExtractor {
    public static void main(String[] args) {
        int number = 472;

        int ones = number % 10;
        int tens = (number / 10) % 10;
        int hundreds = number / 100;

        int sum = hundreds + tens + ones;

        System.out.println("Hundreds: " + hundreds);
        System.out.println("Tens:     " + tens);
        System.out.println("Ones:     " + ones);
        System.out.println("Sum:      " + sum);
    }
}
