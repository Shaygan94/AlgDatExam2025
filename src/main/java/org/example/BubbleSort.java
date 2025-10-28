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
        float temp;                                                // O(1)
        boolean swapped;                                           // O(1)

        for (int i = 0; i < wineList.length - 1; i++) {            // Outer loop: O(N)
            swapped = false;                                       // O(1)

            for (int j = 0; j < wineList.length - i - 1; j++) {    // Inner loop: O(N)
                if(wineList[j] > wineList[j + 1]){                 // O(1)
                    temp = wineList[j];                            // O(1)
                    wineList[j] = wineList[j + 1];                 // O(1)
                    wineList[j + 1] = temp;                        // O(1)
                    swapped = true;                                // O(1)
                }
            }
            if(swapped == false){                                  // O(1)
                break;
            }
        }
        // O(1) + O(1) + O(N) * [O(1) + O(N) * [O(1) + O(1) + O(1) + O(1) + O(1)] + O(1)]
        // Removing all constants since we're only interested in big O which is usually worst case.
        // O(N) * [O(N)] => O(N) * O(N) = O(N^2) WorstCase
    }



}
