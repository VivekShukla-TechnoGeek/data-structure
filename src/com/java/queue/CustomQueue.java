package com.java.queue;

public interface CustomQueue<E> {
    boolean add(E e);

    boolean remove();

    boolean isEmpty();

    E peek();

    void printQueue();
}
