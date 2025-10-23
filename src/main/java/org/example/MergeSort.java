package org.example;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {}

    public static void mergeSort(float[] wineDataSet, int left, int right) {
        float[] wineList = Arrays.copyOf(wineDataSet, wineDataSet.length);
        if (left < right) {

            int middle = left + (right - left) / 2;

            mergeSort(wineList, left, middle);
            mergeSort(wineList, middle + 1, right);

            merge(wineList, left, middle, right);
        }
    }

    private static void merge(float[] wineList,  int left, int middle, int right) {

        int leftArray = middle - left + 1;
        int rightArray = right - middle;

        float[] leftArrayList = new float[leftArray];
        float[] rightArrayList = new float[rightArray];

        for (int i = 0; i < leftArray; i++) {
            leftArrayList[i] = wineList[leftArray + i];
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

    public static float[] mergeSortFunction(float[] wineDataSet) {
        float[] wineList = Arrays.copyOf(wineDataSet, wineDataSet.length);
        mergeSort(wineList, 0, wineDataSet.length - 1);
        return wineList;
    }

    public static void start() {
        FileHandler fileHandler = new FileHandler();
        float[] wineDataSet = fileHandler.getDataSet();
        System.out.println("Original Array: " + Arrays.toString(wineDataSet));
        mergeSort(wineDataSet, 0, wineDataSet.length - 1);
        System.out.println("Sorted Array: " + Arrays.toString(wineDataSet));
    }
}
