package com.sb02.algorithm.sort;

public class BubbleSort {
    public static void main(String[] args) {
        int[] intArr = {10, 2, 4, 3, 9, 7, 5, 6, 1};
        printArr(intArr);
        bubbleSort(intArr);
        printArr(intArr);
    }

    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
