/**
 * Exercise 2 — TimeConverter
 *
 * Convert a number of seconds into hours, minutes, and seconds.
 *
 * Example: 9296 seconds  →  2 hours, 34 minutes, 56 seconds
 *
 * Hint: 1 hour = 3600 seconds, 1 minute = 60 seconds.
 * Same / and % pattern as ChangeMaker.
 */
public class TimeConverter {
    public static void main(String[] args) {
        int totalSeconds = 9296;

        int hours = totalSeconds / 3600;
        int remainingSeconds = totalSeconds % 3600;

        int minutes = remainingSeconds / 60;
        int seconds = remainingSeconds % 60;

        System.out.println(hours + " hours, "
                + minutes + " minutes, "
                + seconds + " seconds");
    }
}
