package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //Import json file into array
        FileHandler fileHandler = new FileHandler();
        float[] wineDataSetBubbleSort = fileHandler.getDataSet(false);
        float[] wineDataSetBubbleSortOptimized = fileHandler.getDataSet(false);
        float[] wineDataSetInsertion = fileHandler.getDataSet(false);
        float[] wineDataSetMerge = fileHandler.getDataSet(false);
        float[] wineDataSetQuickFirst = fileHandler.getDataSet(false);
        float[] wineDataSetQuickLast = fileHandler.getDataSet(false);
        float[] wineDataSetQuickRandom = fileHandler.getDataSet(false);
        float[] wineDataSetBubbleSortUnique = fileHandler.getDataSet(true);
        float[] wineDataSetBubbleSortOptimizedUnique = fileHandler.getDataSet(true);
        float[] wineDataSetInsertionUnique = fileHandler.getDataSet(true);
        float[] wineDataSetMergeUnique = fileHandler.getDataSet(true);
        float[] wineDataSetQuickFirstUnique = fileHandler.getDataSet(true);
        float[] wineDataSetQuickLastUnique = fileHandler.getDataSet(true);
        float[] wineDataSetQuickRandomUnique = fileHandler.getDataSet(true);
        System.out.println("Original array with duplicates:" + Arrays.toString(fileHandler.getDataSet(false)));
        System.out.println("");

        //Bubblesort non optimized version
        TimeCounter.start();
        BubbleSort.bubbleSortNonOptimized(wineDataSetBubbleSort);
        System.out.println("BubbleSort not optimized with dupes: " + Arrays.toString(wineDataSetBubbleSort));
        TimeCounter.stop();

        //Bubblesort optimized version
        TimeCounter.start();
        BubbleSort.bubbleSortOptimized(wineDataSetBubbleSortOptimized);
        System.out.println("BubbleSort optimized with dupes: " + Arrays.toString(wineDataSetBubbleSortOptimized));
        TimeCounter.stop();

        //InsertionSort optimized version
        TimeCounter.start();
        InsertionSort.insertionSort(wineDataSetInsertion);
        System.out.println("InsertionSort with dupes: " + Arrays.toString(wineDataSetInsertion));
        TimeCounter.stop();

        //MergeSort optimized version
        TimeCounter.start();
        MergeSort.mergeSort(wineDataSetMerge, 0, wineDataSetMerge.length - 1);
        System.out.println("MergeSort with dupes: " + Arrays.toString(wineDataSetMerge));
        System.out.println("Amount of merges: " + MergeSort.getMergeCount());
        MergeSort.setMergeCount(0);
        TimeCounter.stop();

        //MergeSort with sorted array
        TimeCounter.start();
        System.out.println(Arrays.toString(wineDataSetMerge));
        MergeSort.mergeSort(wineDataSetMerge, 0, wineDataSetMerge.length - 1);
        System.out.println("MergeSort with dupes: " + Arrays.toString(wineDataSetMerge));
        System.out.println("Amount of merges: " + MergeSort.getMergeCount());
        MergeSort.setMergeCount(0);
        TimeCounter.stop();

        //QuickSort version
        TimeCounter.start();
        System.out.println("QuickSort First element with dupes: " + Arrays.toString(QuickSort.quickSort(wineDataSetQuickFirst, 0, wineDataSetQuickFirst.length - 1, "first")));
        TimeCounter.stop();

        TimeCounter.start();
        System.out.println("QuickSort Last element with dupes: " + Arrays.toString(QuickSort.quickSort(wineDataSetQuickLast, 0, wineDataSetQuickLast.length - 1, "last")));
        TimeCounter.stop();
        TimeCounter.start();
        System.out.println("QuickSort Random element with dupes: " + Arrays.toString(QuickSort.quickSort(wineDataSetQuickRandom, 0, wineDataSetQuickRandom.length - 1, "random")));
        TimeCounter.stop();

        System.out.println("///////////////////////////////////////////////////");
        System.out.println("");
        System.out.println("Original array without dupes:" + Arrays.toString(fileHandler.getDataSet(true)));
        System.out.println("");

        //Bubblesort non optimized version
        TimeCounter.start();
        BubbleSort.bubbleSortNonOptimized(wineDataSetBubbleSortUnique);
        System.out.println("BubbleSort not optimized without dupes: " + Arrays.toString(wineDataSetBubbleSortUnique));
        TimeCounter.stop();

        //Bubblesort optimized version
        TimeCounter.start();
        BubbleSort.bubbleSortOptimized(wineDataSetBubbleSortOptimizedUnique);
        System.out.println("BubbleSort optimized without dupes: " + Arrays.toString(wineDataSetBubbleSortOptimizedUnique));
        TimeCounter.stop();

        //InsertionSort optimized version
        TimeCounter.start();
        InsertionSort.insertionSort(wineDataSetInsertionUnique);
        System.out.println("InsertionSort without dupes: " + Arrays.toString(wineDataSetInsertionUnique));
        TimeCounter.stop();

        //MergeSort optimized version
        TimeCounter.start();
        System.out.println(Arrays.toString(wineDataSetMergeUnique));
        MergeSort.mergeSort(wineDataSetMergeUnique, 0, wineDataSetMergeUnique.length - 1);
        System.out.println("MergeSort without dupes: " + Arrays.toString(wineDataSetMergeUnique));
        System.out.println("Amount of merges: " + MergeSort.getMergeCount());
        MergeSort.setMergeCount(0);
        TimeCounter.stop();

        //MergeSort already sorted
        TimeCounter.start();
        System.out.println(Arrays.toString(wineDataSetMergeUnique));
        MergeSort.mergeSort(wineDataSetMergeUnique, 0, wineDataSetMergeUnique.length - 1);
        System.out.println("MergeSort already sorted array without dupes: " + Arrays.toString(wineDataSetMergeUnique));
        System.out.println("Amount of merges: " + MergeSort.getMergeCount());
        MergeSort.setMergeCount(0);
        TimeCounter.stop();

        //QuickSort optimized version
        TimeCounter.start();
        System.out.println("QuickSort First element without dupes: " + Arrays.toString(QuickSort.quickSort(wineDataSetQuickFirstUnique, 0, wineDataSetQuickFirstUnique.length - 1, "first")));
        TimeCounter.stop();

        TimeCounter.start();
        System.out.println("QuickSort Last element without dupes: " + Arrays.toString(QuickSort.quickSort(wineDataSetQuickLastUnique, 0, wineDataSetQuickLastUnique.length - 1, "last")));
        TimeCounter.stop();

        TimeCounter.start();
        System.out.println("QuickSort Random element without dupes: " + Arrays.toString(QuickSort.quickSort(wineDataSetQuickRandomUnique, 0, wineDataSetQuickRandomUnique.length - 1, "random")));
        TimeCounter.stop();


    }

}