package com.java.queue;

public class Main {
    public static void main(String[] args) {
        CustomQueue cq1 = new CustomQueueAsArrayListImplementation();
        cq1.add(1);
        cq1.add(2);
        cq1.add(3);
        cq1.printQueue();
        System.out.println("+++++++++++++++++++++++++");
        cq1.remove();
        cq1.printQueue();
        System.out.println("+++++++++++++++++++++++++");
        CustomQueue cq2 = new CustomQueueAsArrayListImplementation(2);
        cq2.add(8);
        cq2.add(9);
        cq2.printQueue();
        System.out.println("+++++++++++++++++++++++++");
        cq2.add(20);
        cq2.add(21);
        cq2.add(22);
        cq2.add(23);
        cq2.printQueue();
        System.out.println("+++++++++++++++++++++++++");
        cq2.remove();
        cq2.remove();
        cq2.remove();
        cq2.remove();
        cq2.remove();
        cq2.printQueue();
        System.out.println("+++++++++++++++++++++++++");
        cq2.remove();
        cq2.printQueue();
        System.out.println("cq2.isEmpty()-> " + cq2.isEmpty());
        System.out.println("+++++++++++++++++++++++++");

        CustomQueue<Integer> cqLL1 = new CustomQueueAsLinkedListImplementation<>();
        cqLL1.add(11);
        cqLL1.add(12);
        cqLL1.add(13);
        cqLL1.add(14);
        cqLL1.add(15);
        System.out.println(cqLL1.peek());
        System.out.println("+++++++++++++++++++++++++");
        cqLL1.printQueue();
        cqLL1.remove();
        cqLL1.remove();
        System.out.println("+++++++++++++++++++++++++");
        cqLL1.printQueue();
        System.out.println("+++++++++++++++++++++++++");
        System.out.println("cqLL1.peek()-> " + cqLL1.peek());
        System.out.println("cqLL1.isEmpty()-> " + cqLL1.isEmpty());
        System.out.println("+++++++++++++++++++++++++");

        CustomQueue<Integer> cqLL2 = new CustomQueueAsLinkedListImplementation<>();
        System.out.println("cqLL2.isEmpty()-> " + cqLL2.isEmpty());

    }
}
