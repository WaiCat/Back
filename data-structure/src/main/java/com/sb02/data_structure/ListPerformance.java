package com.sb02.data_structure;

import java.util.*;

public class ListPerformance {
    public static void main(String[] args) {
        // 테스트 목적: ArrayList와 LinkedList의 Operation별 성능 비교

        int dataSize = 100000;

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        // 데이터 끝단 삽입 테스트
        fillListTest(arrayList, dataSize);
        fillListTest(linkedList, dataSize);

        // 데이터 중간 삽입 테스트
        insertElementTest(arrayList, 1000);
        insertElementTest(linkedList, 1000);

        // 데이터 접근 테스트
        getElementTest(arrayList, 1000);
        getElementTest(linkedList, 1000);
    }

    public static void fillListTest(List<Integer> list, int dataSize) {
        long start = System.nanoTime();
        for (int i = 0; i < dataSize; i++) {
            // 차례대로 데이터를 삽입
            list.add(i);
        }
        long end = System.nanoTime();
        System.out.println("testList1: " + (end - start) + " ns");
    }

    public static void insertElementTest(List<Integer> list, int insertSize) {
        long start = System.nanoTime();
        for (int i = 0; i < insertSize; i++) {
            // i번째 인덱스에 i를 삽입 (리스트 중간 삽입)
            list.add(i, i);
        }
        long end = System.nanoTime();
        System.out.println("testList2: " + (end - start) + " ns");
    }

    public static void getElementTest(List<Integer> list, int accessCount) {
        long start = System.nanoTime();
        for (int i = 0; i < accessCount; i++) {
            Random random = new Random();
            int randomNumber = random.nextInt(list.size());
            list.get(randomNumber);
        }
        long end = System.nanoTime();
        System.out.println("testList3: " + (end - start) + " ns");
    }
}
