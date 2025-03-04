package com.sb02.algorithm.sort;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5,2,4,6,1,3};
        selectionSort(arr);
    }
    public static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            int minIdx = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }
}
