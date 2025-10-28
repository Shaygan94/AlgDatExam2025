package org.example;

import java.util.Arrays;

public class MergeSort {

    private static int mergeCount = 0;

    public static void mergeSort(float[] wineList, int left, int right) {
        if (left < right) {

            int middle = left + (right - left) / 2;

            mergeSort(wineList, left, middle);
            mergeSort(wineList, middle + 1, right);

            merge(wineList, left, middle, right);
        }
    }

    private static void merge(float[] wineList,  int left, int middle, int right) {
        mergeCount++;

        int leftArray = middle - left + 1;
        int rightArray = right - middle;

        float[] leftArrayList = new float[leftArray];
        float[] rightArrayList = new float[rightArray];

        for (int i = 0; i < leftArray; i++) {
            leftArrayList[i] = wineList[left + i];
        }
        for (int j = 0; j < rightArray; j++) {
            rightArrayList[j] = wineList[middle + 1 + j];
        }

        int i = 0;
        int j = 0;
        int k = left;

        while (i < leftArray && j < rightArray) {
            if (leftArrayList[i] <= rightArrayList[j]) {
                wineList[k] = leftArrayList[i];
                i++;
            }else{
                wineList[k] = rightArrayList[j];
                j++;
            }
            k++;
        }

        while (i < leftArray) {
            wineList[k] = leftArrayList[i];
            i++;
            k++;
        }

        while (j < rightArray) {
            wineList[k] = rightArrayList[j];
            j++;
            k++;
        }
    }

    public static int getMergeCount() {
        return mergeCount;
    }

    public static void setMergeCount(int mergeCount) {
        MergeSort.mergeCount = mergeCount;
    }
}
