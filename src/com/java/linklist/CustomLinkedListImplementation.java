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
    public void printList() {
        CustomNode<E> t = head;
        while (t != null) {
            System.out.print("\""+t.item + "\" ");
            t = t.next;
        }
        System.out.println();
    }
}
