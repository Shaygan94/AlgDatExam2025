package org.example;
import java.util.Arrays;


public class BubbleSort {

    public static void bubbleSortNonOptimized(float[] wineDataSet) {
        float temp;
        float wineList[] = Arrays.copyOf(wineDataSet, wineDataSet.length);
        for (int i = 0; i < wineList.length - 1; i++) {
            for (int j = 0; j < wineList.length - i - 1; j++) {

                if(wineList[j] > wineList[j + 1]){
                    temp = wineList[j];
                    wineList[j] = wineList[j + 1];
                    wineList[j + 1] = temp;
                }
            }
        }
        System.out.println("BubbleSort not optimized: " + Arrays.toString(wineList));
    }

    public static void bubbleSortOptimized(float[] wineDataSet) {
        float temp;
        float wineList[] = Arrays.copyOf(wineDataSet, wineDataSet.length);
        boolean swapped;
        for (int i = 0; i < wineList.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < wineList.length - i - 1; j++) {

                if(wineList[j] > wineList[j + 1]){
                    temp = wineList[j];
                    wineList[j] = wineList[j + 1];
                    wineList[j + 1] = temp;
                    swapped = true;
                }
            }

            if(swapped == false){
                break;
            }
        }
        System.out.println("BubbleSort optimized: " + Arrays.toString(wineList));
    }



}
