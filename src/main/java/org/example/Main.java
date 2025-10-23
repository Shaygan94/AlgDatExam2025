package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //Import json file into array
        FileHandler fileHandler = new FileHandler();
        float[] wineDataSet = fileHandler.getDataSet();

        //Original Array
        System.out.println("Original array:"+ Arrays.toString(fileHandler.getDataSet()));
        System.out.println("");

        //Bubblesort non optimized version
        TimeCounter.start();
        BubbleSort.bubbleSortNonOptimized(fileHandler.getDataSet());
        TimeCounter.stop();

        //Bubblesort optimized version
        TimeCounter.start();
        BubbleSort.bubbleSortOptimized(fileHandler.getDataSet());
        TimeCounter.stop();
    }
}