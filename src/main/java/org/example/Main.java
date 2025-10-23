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
        BubbleSort.bubbleSortNonOptimized(wineDataSet);
        TimeCounter.stop();

        //Bubblesort optimized version
        TimeCounter.start();
        BubbleSort.bubbleSortOptimized(wineDataSet);
        TimeCounter.stop();

        //InsertionSort optimized version
        TimeCounter.start();
        InsertionSort.insertionSort(wineDataSet);
        TimeCounter.stop();

        //MergeSort optimized version
        TimeCounter.start();
        MergeSort.start();
        TimeCounter.stop();

        //QuickSort optimized version
        TimeCounter.start();
        System.out.println("QuickSort: " + Arrays.toString(QuickSort.quickSort(wineDataSet, 0, wineDataSet.length - 1)));
        TimeCounter.stop();
    }

}