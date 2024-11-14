package task.pkg5;

import java.util.Scanner;

public class average {
    public static double findHighestAverage(student s1, student s2, student s3) {
        double avg1 = s1.calculateAverage();
        double avg2 = s2.calculateAverage();
        double avg3 = s3.calculateAverage();

        return Math.max(avg1, Math.max(avg2, avg3));
    }
    public static void displayAvenHigh(student s1, student s2, student s3) {
        double avg1 = s1.calculateAverage();
        double avg2 = s2.calculateAverage();
        double avg3 = s3.calculateAverage();

        System.out.println(s1.name + "'s Average: " + avg1);
        System.out.println(s2.name + "'s Average: " + avg2);
        System.out.println(s3.name + "'s Average: " + avg3);

        double highestAverage = findHighestAverage(s1, s2, s3);

        System.out.println("Highest Average: " + highestAverage);
        
    
    }
}