package com.java.arraylist;

public interface CustomArrayList<E> {
    boolean add(E e);

    void printList();

    int size();

    boolean add(int index, E e);
}
