package org.example;

import java.util.Arrays;

public class InsertionSort {

    static int comparisonCount = 0;

    public static void insertionSort(float[] wineList) {
        for (int i = 1; i < wineList.length; i++) {         // Outer loop: O(N)
            float temp = wineList[i];                       // O(1)
            int j = i - 1;                                  // O(1)

            while (j >= 0 && wineList[j] > temp) {          // Inner loop: O(N)
                comparisonCount++;
                wineList[j + 1] = wineList[j];              // O(1)
                j = j - 1;                                  // O(1)
            }
            wineList[j + 1] = temp;                         // O(1)
        }
        // O(N) * [O(1) + O(1) + O(N) * [O(1) + O(1)] + O(1)]
        // Removing all constants since we're only interested in big O which is usually worst case.
        // O(N) * [O(N)] => O(N) * O(N) = O(N^2) WorstCase
    }
}
