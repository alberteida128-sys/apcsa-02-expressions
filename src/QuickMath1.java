public class QuickMath1 {
    public static void main(String[] args) {
        System.out.println((int) 9.99);
    System.out.println((int) -9.99);
    System.out.println(Math.round(9.5));
    System.out.println(Math.round(9.4));
    System.out.println(Math.round(-9.5));
    System.out.println((double) 7/2);
    System.out.println((double) (7/2));
    System.out.println(Math.round(3.14159 * 100) / 100.0);

    int max = Integer.MAX_VALUE;
    System.out.println("Max int:     " + max);
    System.out.println("Max + 1:     " + (max + 1));
    System.out.println("Max + 2:     " + (max + 2));

    int min = Integer.MIN_VALUE;
    System.out.println("Min int:     " + min);
    System.out.println("Min -1:     " + (min-1));

    double a = 0.1 + 0.2;
    double b = 0.3;
    System.out.println(0.1 + 0.2);
    System.out.println(0.1 + 0.2 == 0.3);
    System.out.println(Math.abs(0.1 + 0.2 - 0.3) < 0.000001);
   
    }
}