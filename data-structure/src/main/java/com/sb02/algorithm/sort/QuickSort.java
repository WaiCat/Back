package com.sb02.algorithm.sort;

import java.security.PrivateKey;

public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};
        quickSort(arr, 0, arr.length - 1);

    }
    public static void quickSort(int[] arr, int left, int right){
        if(left >= right){
            return;
        }

        int pivotIndex = partition(arr, left, right);
        quickSort(arr, left, pivotIndex - 1);
        quickSort(arr, pivotIndex + 1, right);
    }

    private static int partition(int[] arr, int left, int right){
        int pivot = arr[right];
        int i = left - 1;

        for(int j = left; j <= right - 1; j++){
            if(arr[j] < pivot){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        int temp = arr[i+1];
        arr[i+1] = arr[right];
        arr[right] = temp;

        return i + 1;
    }
}
