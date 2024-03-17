package com.java.sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {76, 39, 9, 24, 83, 45, 9, 76, 72, 3, 2, 2};
        sort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }

    private static void sort(int[] arr) {
        boolean flag = false;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = true;
                }
            }
            if (flag == false)
                break;
        }
    }
}
