package org.example;

import java.util.Random;

public class QuickSort {

    public static float[] quickSort(float[] wineList, int low, int high, String pivot) {
        if (low < high) {
            int partitionIndex = 0;
            switch (pivot) {
                case "first":
                    partitionIndex = partitionFirst(wineList, low, high);
                    break;
                case "last":
                    partitionIndex = partitionLast(wineList, low, high);
                    break;
                case "random":
                    partitionIndex = partitionRandom(wineList, low, high);
                    break;
            }
            quickSort(wineList, low, partitionIndex - 1, pivot);
            quickSort(wineList, partitionIndex + 1, high, pivot);
        }
        return wineList;
    }

    private static int partitionFirst(float[] wineList, int low, int high) {
        float pivot = wineList[low];
        int k = high;
        for (int i = high; i > low; i--) {
            if (wineList[i] > pivot) swap(wineList, i, k--);
        }
        swap(wineList, low, k);
        return k;
    }

    private static int partitionLast(float[] wineList, int low, int high) {
        float pivot = wineList[high];

        int i = low - 1;

        for (int j = low; j <= high - 1; j++) {
            if (wineList[j] < pivot) {
                i++;
                swap(wineList, i, j);
            }
        }
        swap(wineList, i + 1, high);
        return i + 1;
    }

    private static int partitionRandom(float[] wineList, int low, int high) {
        Random rand = new Random();
        int pivot = rand
    }

    private static void swap(float[] wineList, int i, int j) {
        float temp = wineList[i];
        wineList[i] = wineList[j];
        wineList[j] = temp;
    }

}
