package com.java.linklist;

public interface CustomLinkedList<E> {

    boolean add(E e);

    void printList();

    boolean addFirst(E e);

    boolean add(int index, E e);
}
