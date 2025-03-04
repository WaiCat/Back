package com.sb02.data_structure;

import com.sb02.data_structure.linked_list.MyLinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        myLinkedList.add(1, 0);
        myLinkedList.add(2, 1);
        myLinkedList.add(3, 2);
        myLinkedList.addAsSavePoint(4, 3);
        myLinkedList.add(5, 4);
        myLinkedList.add(6, 5);
        myLinkedList.addToSavePoint(100);

        myLinkedList.printAll();
    }
}
