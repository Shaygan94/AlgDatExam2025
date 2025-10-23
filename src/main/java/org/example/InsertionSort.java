package org.example;

import java.util.Arrays;

public class InsertionSort {

    public static void insertionSort(float[] wineDataSet) {
        float[] wineList = Arrays.copyOf(wineDataSet, wineDataSet.length);
        for (int i = 1; i < wineList.length; i++) {
            float temp = wineList[i];
            int j = i - 1;

            while (j >= 0 && wineList[j] > temp) {
                wineList[j + 1] = wineList[j];
                j = j - 1;
            }
            wineList[j + 1] = temp;
        }
        System.out.println("InsertionSort: " + Arrays.toString(wineList));
    }
}
