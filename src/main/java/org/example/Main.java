package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //Import json file into array
        FileHandler fileHandler = new FileHandler();
        float[] wineDataSet = fileHandler.getDataSet();

        //Original Array
        TimeCounter.start();
        System.out.println("Original array:"+ Arrays.toString(wineDataSet));
        TimeCounter.stop();

        //Bubblesort non optimized version
        TimeCounter.start();
        BubbleSort.bubbleSortNonOptimized(wineDataSet);
        TimeCounter.stop();

        //Bubblesort optimized version
        TimeCounter.start();
        BubbleSort.bubbleSortOptimized(wineDataSet);
        TimeCounter.stop();
    }
}