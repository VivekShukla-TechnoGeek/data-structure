package com.java.arraylist;

public class Main {
    public static void main(String[] args) {
        CustomArrayList<Integer> ca1 = new CustomArrayListImplementation<>();
        ca1.add(1);
        ca1.add(2);
        ca1.add(3);
        System.out.println("ca1 list size: " + ca1.size());
        ca1.printList();
        System.out.println("++++++++++++++++++");
        CustomArrayList<Integer> ca2 = new CustomArrayListImplementation<>(3);
        ca2.add(9);
        ca2.add(8);
        System.out.println("ca2 list size: " + ca2.size());
        ca2.printList();
        ca2.add(7);
        ca2.add(6);
        ca2.add(5);
        ca2.add(4);
        System.out.println("++++++++++++++++++ updated ca2 list ++++++++++++++++++");
        System.out.println("updated ca2 list size: " + ca2.size());
        ca2.printList();
    }
}
