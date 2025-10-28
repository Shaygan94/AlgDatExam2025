package org.example;

import java.util.Arrays;

public class QuickSort {

    public static float[] quickSort(float[] wineList, int low, int high) {
        if (low < high) {
            int partitionIndex = partition(wineList, low, high);

            quickSort(wineList, low, partitionIndex - 1);
            quickSort(wineList, partitionIndex + 1, high);
        }
        return wineList;
    }

    private static int partition(float[] wineList, int low, int high) {
        float pivot = wineList[high];

        int i = low - 1;

        for (int j = low; j <= high - 1; j++) {
            if (wineList[j] < pivot) {
                i++;
                swap(wineList, i ,j);
            }
        }
        swap(wineList, i + 1, high);
        return i + 1;
    }

    private static void swap(float[] wineList, int i, int j) {
        float temp = wineList[i];
        wineList[i] = wineList[j];
        wineList[j] = temp;
    }

}
