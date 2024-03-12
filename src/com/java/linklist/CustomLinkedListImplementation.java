package com.java.linklist;

public class CustomLinkedListImplementation<E> implements CustomLinkedList<E> {

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
        linkToLast(e);
        return true;
    }

    private void linkToLast(E e) {
        CustomNode<E> lastNode = last;
        CustomNode<E> newNode = new CustomNode<>(e, null);
        last = newNode;
        if (lastNode == null) {
            head = newNode;
        } else {
            lastNode.next = newNode;
        }
        size++;
    }

    @Override
    public boolean addFirst(E e) {
        linkFirst(e);
        return true;
    }

    private void linkFirst(E e) {
        CustomNode<E> h = head;
        CustomNode<E> newNode = new CustomNode<>(e, null);
        head = newNode;
        if (h == null) {
            last = newNode;
        } else {
            head.next = h;
        }
        size++;
    }

    @Override
    public void printList() {
        CustomNode<E> t = head;
        while (t != null) {
            System.out.println("\"" + t.item + "\"");
            t = t.next;
        }
    }

    @Override
    public boolean add(int index, E e) {
        validateIndex(index);
        linkAt(index, e);
        return true;
    }

    private void linkAt(int index, E e) {
        if (index == 0)
            linkFirst(e);
        else if (index == size)
            linkToLast(e);
        else {
            CustomNode<E> newNode = new CustomNode<>(e, null);
            CustomNode<E> temp = head;
            int i = 0;
            while (i < index - 1) {
                temp = temp.next;
                i++;
            }
            CustomNode<E> currentNode = temp.next;
            newNode.next = currentNode;
            temp.next = newNode;
            size++;
        }
    }

    private void validateIndex(int index) {
        if (index < 0 || index > size)
            throw new IndexOutOfBoundsException("Index: " + index + " Size: " + size);
    }

    @Override
    public int size() {
        return listSize();
    }

    private int listSize() {
        return this.size;
    }

    @Override
    public boolean remove(int index) {
        validateIndex(index);
        unlink(index);
        return true;
    }

    private void unlink(int index) {
        if (index == 0)
            unlinkFirst();
        else {
            CustomNode<E> temp = head.next, prev = head;
            int i = 1;
            while (i < index && temp != null) {
                prev = temp;
                temp = temp.next;
                i++;
            }
            prev.next = temp.next;
            if (index == size)
                last = prev;
            size--;
        }
    }

    private void unlinkFirst() {
        head = head.next;
        size--;
    }
}
