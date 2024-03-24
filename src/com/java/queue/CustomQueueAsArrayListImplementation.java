package com.java.queue;

import java.util.Arrays;
import java.util.Comparator;

public class CustomQueueAsArrayListImplementation<E> implements CustomQueue<E> {

    private static final int DEFAULT_INITIAL_CAPACITY = 11;
    private Object[] queue;
    private int front;
    private int rear;

    public CustomQueueAsArrayListImplementation() {
        this(DEFAULT_INITIAL_CAPACITY);
    }

    public CustomQueueAsArrayListImplementation(int initialCapacity) {
        if (initialCapacity < 1)
            throw new IllegalArgumentException();
        this.queue = new Object[initialCapacity];
        this.front = -1;
        this.rear = -1;
    }

    @Override
    public boolean isEmpty() {
        return rear == -1 && front == -1;
    }

    @Override
    public boolean add(E e) {
        offer(e);
        return true;
    }

    private void offer(E e) {
        if (e == null)
            throw new NullPointerException();
        if (this.rear == this.queue.length - 1)
            ensureCapacity(this.queue.length + 1);
        if (this.front == -1)
            this.front = 0;
        this.queue[++this.rear] = e;
    }

    private void ensureCapacity(int requiredCap) {
        if (requiredCap > this.queue.length) {
            if (this.queue.length > 0) {
                Object[] oldData = this.queue;
                int newCapacity = this.queue.length * 2 + 1;
                this.queue = Arrays.copyOf(oldData, newCapacity);
            } else
                this.queue = new Object[Math.max(DEFAULT_INITIAL_CAPACITY, requiredCap)];
        }
    }

    @Override
    public boolean remove() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return false;
        }
        poll();
        return true;
    }

    private void poll() {
        if (this.rear == this.front)
            this.rear = this.front = -1;
        else
            this.front = this.front + 1;
    }

    @Override
    public E peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return null;
        }
        return (E) queue[front];
    }

    @Override
    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        for (int i = this.front; i <= this.rear; i++) {
            System.out.println("\"" + this.queue[i] + "\"");
        }
    }
}
