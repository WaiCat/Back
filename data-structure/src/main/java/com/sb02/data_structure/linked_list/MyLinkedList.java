package com.sb02.data_structure.linked_list;

public class MyLinkedList<T> {

    private Node<T> head;
    private Node<T> rear;
    private Node<T> savePointer;
    private int size;

    public MyLinkedList() {
        head = null;
        rear = null;
        savePointer = null;
        size = 0;
    }

    public void add(T e, int index) {
        add(e, index, false);
    }

    public void addAsSavePoint(T e, int index) {
        add(e, index, true);
    }

    private void add(T e, int index, boolean isSavePoint) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }

        Node<T> newNode = new Node<>(e);
        if (isSavePoint) {
            savePointer = newNode;
        }

        if (head == null) {
            head = newNode;
            rear = newNode;
            size++;
            return;
        }

        Node<T> current = head;
        for (int i = 0; i < index - 1; i++) {
            current = current.getNext();
        }

        if (index == 0) {
            newNode.setNext(head);
            head = newNode;
        } else if (index == size) {
            rear.setNext(newNode);
            rear = newNode;
        } else {
            newNode.setNext(current.getNext());
            current.setNext(newNode);
        }
        size++;
    }

    public void addToSavePoint(T e) {
        if (savePointer == null) {
            throw new NullPointerException("Save Pointer is null");
        }
        Node<T> newNode = new Node<>(e);
        newNode.setNext(savePointer.getNext());
        savePointer.setNext(newNode);
        size++;
    }

    public void printAll() {
        Node<T> current = head;
        while (current != null) {
            System.out.println(current);
            current = current.getNext();
        }
    }
}
