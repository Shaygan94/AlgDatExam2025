package org.example;

import java.util.Random;

public class QuickSort {
    private static final Random rand = new Random();
    private static int comparisonCount = 0;

    public static float[] quickSort(float[] wineList, int low, int high, String pivot) {
        if (low < high) {
            int partitionIndex = switch (pivot) {
                case "first" -> partitionFirst(wineList, low, high);
                case "last" -> partitionLast(wineList, low, high);
                case "random" -> partitionRandom(wineList, low, high);
                default -> 0;
            };
            quickSort(wineList, low, partitionIndex - 1, pivot);
            quickSort(wineList, partitionIndex + 1, high, pivot);
        }
        return wineList;
    }

    private static int partitionFirst(float[] wineList, int low, int high) {
        float pivot = wineList[low];
        int i = low;
        for (int j = low + 1; j <= high; j++) {
            comparisonCount++;
            if (wineList[j] < pivot) {
                i++;
                swap(wineList, i, j);
            }
        }
        swap(wineList, low, i);
        return i;
    }

    private static int partitionLast(float[] wineList, int low, int high) {
        float pivot = wineList[high];

        int i = low - 1;

        for (int j = low; j <= high - 1; j++) {
            comparisonCount++;
            if (wineList[j] < pivot) {
                i++;
                swap(wineList, i, j);
            }
        }
        swap(wineList, i + 1, high);
        return i + 1;
    }

    private static int partitionRandom(float[] wineList, int low, int high) {
        randomElement(wineList, low, high);
        float pivot = wineList[high];

        int i = low - 1;
        for (int j = low; j < high; j++) {
            comparisonCount++;
            if (wineList[j] < pivot) {
                i++;
                float temp = wineList[i];
                wineList[i] = wineList[j];
                wineList[j] = temp;
            }
        }
        float temp = wineList[i + 1];
        wineList[i + 1] = wineList[high];
        wineList[high] = temp;
        return i + 1;
    }

    static void randomElement(float[] wineList, int low, int high) {
        int pivot = rand.nextInt(high - low + 1) + low;

        float temp = wineList[pivot];
        wineList[pivot] = wineList[high];
        wineList[high] = temp;
    }

    private static void swap(float[] wineList, int i, int j) {
        float temp = wineList[i];
        wineList[i] = wineList[j];
        wineList[j] = temp;
    }

    public static int getComparisonCount() {
        return comparisonCount;
    }

    public static void setComparisonCount(int comparisonCount) {
        QuickSort.comparisonCount = comparisonCount;
    }
}
