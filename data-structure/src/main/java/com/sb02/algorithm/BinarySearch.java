package com.sb02.algorithm;

public class BinarySearch {
    public static void main(String[] args) {

        int[] intArr = {
                1,
                2, 3,
                4, 8, 10, 13,
                14, 15, 16, 17, 19, 20, 22, 23,
        };
        //              0  1  2  3  4  5   6  / size : 7
        //              l        m         r

        int foundIndex = binarySearch(intArr, 0);
        System.out.println(foundIndex);

        foundIndex = binarySearch(intArr, 22);
        System.out.println(foundIndex);
    }

    public static int binarySearch(int[] arr, int target) {
        int count = 0;
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            count++;
            int mid = (left + right) / 2;
            if (arr[mid] == target) {
                System.out.println("총 비교 연산 횟수: " + count);
                return mid;
            } else if (arr[mid] > target) {
                right = mid - 1;
            } else if (arr[mid] < target) {
                left = mid + 1;
            }
        }
        System.out.println("총 비교 연산 횟수: " + count);
        return -1;
    }
}
