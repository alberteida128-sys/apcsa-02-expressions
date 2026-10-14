/**
 * Exercise 6 — TipCalculator
 *
 * Given a bill amount, a tip percentage, and a number of people,
 * print the tip, the total, and each person's share —
 * all rounded to exactly 2 decimal places.
 *
 * Rounding to 2 decimals:
 *   Math.round(value * 100) / 100.0
 *
 * Watch that .0 — leave it off and you're back in integer division.
 */
public class TipCalculator {
    public static void main(String[] args) {
        double billAmount = 87.35;
        int tipPercent = 18;
        int people = 4;

        double tipAmount = Math.round(billAmount * (tipPercent/100.0) * 100.0) /100.0;
        System.out.println(tipAmount);
        double total = tipAmount + billAmount;
        double eachShare = total / 4;
        double roundedShares = Math.round(eachShare * 100) / 100.0;
        System.out.println("Tip Amount: " + tipAmount);
        System.out.println("Bill Total: " + total);
        System.out.println("Each Share: " + eachShare);
        System.out.println(" Each Share:" + roundedShares);
    }

}
