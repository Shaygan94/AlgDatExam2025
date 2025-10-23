package org.example;

public class TimeCounter {

    private static long startTime;
    private static long endTime;

    // Starts the timer
    public static void start() {
        startTime = System.nanoTime();
    }

    // Stops the timer
    public static void stop() {
        endTime = System.nanoTime();
        long durationInNanoseconds = (endTime - startTime) / 1_000_000;
        System.out.println("Duration in milliseconds: " + durationInNanoseconds);
        System.out.println("");
    }
}
