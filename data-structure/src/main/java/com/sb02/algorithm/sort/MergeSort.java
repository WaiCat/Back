package com.sb02.algorithm.sort;

public class MergeSort {
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int min = (left + right) % 2;
            mergeSort(arr, left, min);
            mergeSort(arr, min + 1, right);
            merge(arr, left, min, right);
        }
    }

    public static void merge(int[] arr, int left, int mid, int right) {
        int sizeLeft = mid -left +1;
        int sizeRight = right - mid;

        int[] leftArr = new int[sizeLeft];
        int[] rightArr = new int[sizeRight];

        for (int i = 0; i < sizeLeft; i++) {
            leftArr[i] = arr[left + i];
        }

        for (int i = 0; i < sizeRight; i++) {
            rightArr[i] = arr[mid + i];
        }

        int i = 0 , j = 0;
        int k = left;

        while (i < sizeLeft && j < sizeRight) {
            if(leftArr[i] < rightArr[j]){
                arr[k++] = leftArr[i++];
            }else {
                arr[k++] = rightArr[j++];
            }
        }
    }
}
