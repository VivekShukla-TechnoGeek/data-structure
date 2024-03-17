package com.java.arraylist;

public class Main {
    public static void main(String[] args) {
        CustomArrayList<Integer> ca1 = new CustomArrayListImplementation<>();
        ca1.add(1);
        ca1.add(2);
        ca1.add(3);
        System.out.println("ca1 list size: " + ca1.size());
        ca1.printList();
        ca1.add(2, 32);
        System.out.println("++++++++++++++++++ updated ca1 list ++++++++++++++++++");
        ca1.printList();
        System.out.println("++++++++++++++++++");
        CustomArrayList<String> ca2 = new CustomArrayListImplementation<>(3);
        ca2.add("H9");
        ca2.add("H8");
        System.out.println("ca2 list size: " + ca2.size());
        ca2.printList();
        ca2.add("H7");
        ca2.add("H6");
        ca2.add("H5");
        ca2.add("H4");
        System.out.println("++++++++++++++++++ updated ca2 list ++++++++++++++++++");
        System.out.println("updated ca2 list size: " + ca2.size());
        ca2.printList();
        ca2.remove(5);
        System.out.println("++++++++++++++++++ updated ca2 list after remove operation ++++++++++++++++++");
        System.out.println("updated ca2 list size: " + ca2.size());
        ca2.printList();
        ca2.remove("H6");
        System.out.println("++++++++++++++++++ updated ca2 list after remove object operation ++++++++++++++++++");
        System.out.println("updated ca2 list size: " + ca2.size());
        ca2.printList();
        ca2.set(1, "H10");
        System.out.println("++++++++++++++++++ updated ca2 list set operation ++++++++++++++++++");
        System.out.println("updated ca2 list size: " + ca2.size());
        ca2.printList();
    }
}
