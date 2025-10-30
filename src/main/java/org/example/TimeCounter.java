package org.example;

public class TimeCounter {

    private static long startTime;
    private static long endTime;

    // Starts the timer
    public static void start() {
        System.out.println("");
        startTime = System.nanoTime();
    }

    // Stops the timer
    public static void stop() {
        endTime = System.nanoTime();
        long durationInNanoseconds = (endTime - startTime) ;
        System.out.println("Duration in nanoseconds: " + durationInNanoseconds);
        //System.out.println("Duration in milliseconds: " + durationInNanoseconds / 1_000_000);
    }
}
