package com.java.stack;

import java.util.Arrays;

public class CustomStackAsArrayListImplementation<E> implements CustomStack<E> {

    private static final int DEFAULT_CAPACITY = 10;
    private int size = 0;
    private Object[] elementData;
    private static final Object[] EMPTY_OBJ = {};

    public CustomStackAsArrayListImplementation() {
        this(DEFAULT_CAPACITY);
    }

    public CustomStackAsArrayListImplementation(int initialCapacity) {
        if (initialCapacity > 0)
            this.elementData = new Object[initialCapacity];
        else if (initialCapacity == 0)
            this.elementData = EMPTY_OBJ;
        else
            throw new IllegalArgumentException("Illegal capacity: " + initialCapacity);
    }

    @Override
    public boolean push(E e) {
        add(e);
        return true;
    }

    private void add(E e) {
        ensureCapacity(this.size + 1);
        this.elementData[size++] = e;
    }

    private void ensureCapacity(int requiredCap) {
        if (requiredCap > this.elementData.length) {
            if (this.elementData.length > 0) {
                Object[] oldData = this.elementData;
                int newCapacity = this.size * 2 + 1;
                this.elementData = Arrays.copyOf(oldData, newCapacity);
            } else
                this.elementData = new Object[Math.max(DEFAULT_CAPACITY, requiredCap)];
        }
    }

    @Override
    public void printStack() {
        if (this.size <= 0) {
            System.out.println("List is empty.");
            return;
        }
        for (int i = 0; i < this.size; i++) {
            System.out.println("\"" + this.elementData[i] + "\"");
        }
    }

    @Override
    public boolean pop() {
        remove();
        return true;
    }

    private void remove() {
        this.elementData[this.size--] = null;
    }

    @Override
    public E peek() {
        return (E) this.elementData[this.size];
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }
}
