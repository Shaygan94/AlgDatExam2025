package org.example;

import java.util.Arrays;

public class QuickSort {

    public static float[] quickSort(float[] wineDataSet, int low, int high) {
        float wineList[] = Arrays.copyOf(wineDataSet, wineDataSet.length);
        if (low < high) {
            int partitionIndex = partition(wineList, low, high);

            quickSort(wineList, low, partitionIndex - 1);
            quickSort(wineList, partitionIndex + 1, high);
        }
        return wineDataSet;
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
