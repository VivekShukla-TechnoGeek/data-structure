package com.java.stack;

public class Main {
    public static void main(String[] args) {
        CustomStack<Integer> cs1 = new CustomStackAsLinkedListImplementation<>();
        cs1.push(1);
        cs1.push(2);
        cs1.push(3);
        cs1.printStack();
        System.out.println("+++++++++++++++++++++++++");
        cs1.pop();
        cs1.printStack();
        System.out.println("+++++++++++++++++++++++++");
        CustomStack<Integer> cs2 = new CustomStackAsLinkedListImplementation<>();
        cs2.push(9);
        cs2.push(8);
        cs2.push(7);
        cs2.printStack();
        System.out.println("+++++++++++++++++++++++++");
        System.out.println("cs2.peek() -> " + cs2.peek());
        System.out.println("cs2.size() -> " + cs2.size());
        System.out.println("cs1.isEmpty() -> " + cs1.isEmpty());
        CustomStack<Integer> cs3 = new CustomStackAsLinkedListImplementation<>();
        System.out.println("cs3.isEmpty() -> " + cs3.isEmpty());
        System.out.println("+++++++++++++++++++++++++");
        CustomStack<Integer> cs4 = new CustomStackAsArrayListImplementation<>();
        cs4.push(4);
        cs4.push(5);
        cs4.push(6);
        cs4.printStack();
        System.out.println("cs4.size() -> " + cs4.size());
        System.out.println("+++++++++++++++++++++++++");
        cs4.pop();
        cs4.printStack();
        System.out.println("cs4.size() -> " + cs4.size());
        System.out.println("cs4.isEmpty() -> " + cs4.isEmpty());
        CustomStack<Integer> cs5 = new CustomStackAsArrayListImplementation<>();
        System.out.println("cs5.isEmpty() -> " + cs5.isEmpty());
    }
}
