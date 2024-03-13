package com.java.arraylist;

import java.util.Arrays;

public class CustomArrayListImplementation<E> implements CustomArrayList<E> {

    private static final int DEFAULT_CAPACITY = 10;
    private int size = 0;
    private Object[] elementData;
    private static final Object[] EMPTY_OBJ = {};

    public CustomArrayListImplementation() {
        this.elementData = new Object[DEFAULT_CAPACITY];
    }

    public CustomArrayListImplementation(int initialCapacity) {
        if (initialCapacity > 0) {
            this.elementData = new Object[initialCapacity];
        } else if (initialCapacity == 0) {
            this.elementData = EMPTY_OBJ;
        } else {
            throw new IllegalArgumentException("Illegal Capacity: " + initialCapacity);
        }
    }

    @Override
    public boolean add(E e) {
        ensureCapacity(this.size + 1);
        this.elementData[size++] = e;
        return true;
    }

    private void ensureCapacity(int requiredCap) {
        if (requiredCap > this.elementData.length) {
            if (this.elementData.length > 0) {
                Object[] oldElementData = this.elementData;
                int newCapacity = this.size * 2 + 1;
                this.elementData = Arrays.copyOf(oldElementData, newCapacity);
            } else {
                this.elementData = new Object[Math.max(DEFAULT_CAPACITY, requiredCap)];
            }
        }
    }

    @Override
    public void printList() {
        if (this.size <= 0) {
            System.out.println("List is empty.");
            return;
        }
        for (int i = 0; i < this.size; i++) {
            System.out.println("\"" + this.elementData[i] + "\"");
        }
    }

    @Override
    public int size() {
        return this.size;
    }
}
