package com.java.stack;

public interface CustomStack<E> {
    boolean push(E e);

    void printStack();

    boolean pop();

    E peek();

    int size();

    boolean isEmpty();
}
