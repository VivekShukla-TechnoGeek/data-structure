package com.java.queue;

import com.java.linklist.CustomLinkedListImplementation;

public class CustomQueueAsLinkedListImplementation<E> implements CustomQueue<E> {

    int size = 0;
    CustomNode<E> head;
    CustomNode<E> last;


    private static class CustomNode<E> {
        E item;
        CustomNode<E> next;

        CustomNode(E item, CustomNode<E> next) {
            this.item = item;
            this.next = next;
        }
    }

    @Override
    public boolean add(E e) {
        enqueue(e);
        return true;
    }

    private void enqueue(E e) {
        CustomNode<E> temp = this.last;
        CustomNode<E> newNode = new CustomNode<>(e, null);
        this.last = newNode;
        if (temp == null) {
            this.head = newNode;
        } else {
            temp.next = newNode;
        }
        size++;
    }

    @Override
    public boolean remove() {
        dequeue();
        return true;
    }

    private void dequeue() {
        if (this.head == null)
            return;
        else if (this.head.next == null)
            this.head = this.last = null;
        else {
            this.head = this.head.next;
        }
        size--;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public E peek() {
        if (this.head == null)
            throw new NullPointerException("Trying to access empty queue");
        return this.head.item;
    }

    @Override
    public void printQueue() {
        CustomNode<E> t = head;
        while (t != null) {
            System.out.println("\"" + t.item + "\"");
            t = t.next;
        }
    }
}
