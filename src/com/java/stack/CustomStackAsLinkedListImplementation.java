package com.java.stack;

public class CustomStackAsLinkedListImplementation<E> implements CustomStack<E> {

    int size = 0;

    CustomNode<E> head;

    private static class CustomNode<E> {
        E item;
        CustomNode<E> next;

        CustomNode(E item, CustomNode<E> next) {
            this.item = item;
            this.next = next;
        }
    }

    @Override
    public boolean push(E e) {
        link(e);
        return true;
    }

    private void link(E e) {
        CustomNode<E> newNode = new CustomNode<>(e, null);
        if (this.head == null)
            this.head = newNode;
        else {
            newNode.next = this.head;
            this.head = newNode;
        }
        size++;
    }

    @Override
    public void printStack() {
        CustomNode<E> temp = this.head;
        while (temp != null) {
            System.out.println(temp.item);
            temp = temp.next;
        }
    }

    @Override
    public boolean pop() {
        unlink();
        return true;
    }

    private void unlink() {
        head = head.next;
        size--;
    }

    @Override
    public E peek() {
        E top = this.head.item;
        return top;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return this.head == null;
    }

}
