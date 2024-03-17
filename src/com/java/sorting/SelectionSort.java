package com.java.sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {76, 39, 9, 24, 83, 45, 9, 76, 72, 3, 2, 2};
        sort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }

    private static void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int sIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[sIndex] > arr[j])
                    sIndex = j;
            }
            if (sIndex != i) {
                int temp = arr[i];
                arr[i] = arr[sIndex];
                arr[sIndex] = temp;
            }
        }
    }
}
