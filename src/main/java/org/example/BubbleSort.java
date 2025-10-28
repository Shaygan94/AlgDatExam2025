package org.example;


public class BubbleSort {

    public static void bubbleSortNonOptimized(float[] wineList) {
        float temp;
        for (int i = 0; i < wineList.length - 1; i++) {
            for (int j = 0; j < wineList.length - i - 1; j++) {

                if(wineList[j] > wineList[j + 1]){
                    temp = wineList[j];
                    wineList[j] = wineList[j + 1];
                    wineList[j + 1] = temp;
                }
            }
        }
    }

    public static void bubbleSortOptimized(float[] wineList) {
        float temp;
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
    }



}
