/**
 * Exercise 10 (Homework) — GradeAverage
 *
 * Four categories with different weights. Compute the weighted
 * average and print it to one decimal place.
 *
 *   Homework   15%
 *   Classwork  25%
 *   Tests      25%
 *   Project    25%
 *   Participation 10%
 *
 * (Yes — these are this course's actual weights. Use them to
 *  work out what your own grade would be.)
 */
public class GradeAverage {
    public static void main(String[] args) {
        double homework = 88;
        double classwork = 94;
        double tests = 81;
        double project = 90;
        double participation = 100;

        double gradeAverage = ((homework * 0.15) + (classwork * 0.25) + (tests * 0.25) + (project * 0.25) + (participation * 0.10));
        System.out.println(Math.round(gradeAverage*10)/10.0);
    }
} 
