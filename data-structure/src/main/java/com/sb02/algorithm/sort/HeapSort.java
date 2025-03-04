package com.sb02.algorithm.sort;

import com.sb02.data_structure.PriorityQueueDemo;

import java.util.PriorityQueue;

public class HeapSort {
    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6, 7};
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        for (int i = 0; i < arr.length; i++) {
            pq.add(arr[i]);
        }

        while (!pq.isEmpty()){
            System.out.println(pq.poll());
        }
    }
}
