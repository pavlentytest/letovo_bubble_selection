package ru.samsung.itschool.mdev;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {


        int[] x = {349393,5,4,5,6,6};
        // O(n^2)
        // Bubble Sort
        // Selection Sort
        // !!! Quick Sort - recursion

        /*
        1)

        5 1 4 2 8 => 1 5 4 2 8
        1 5 4 2 8 => 1 4 5 2 8
        1 4 5 2 8 => 1 4 2 5 8
        1 4 2 5 8 => 1 4 2 5 8

        2)
        1 4 2 5 8 => 1 4 2 5 8
        1 4 2 5 8 => 1 2 4 5 8
        1 2 4 5 8 => 1 2 4 5 8
        1 2 4 5 8 => 1 2 4 5 8

        еще 2 итерации

         */

        bubbleSort(new int[]{4848,56456,949,469,-23483,9595,0,393});
        selectionSort(new int[]{4848,56456,949,469,-23483,9595,0,393});
    }
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        int temp;
        int counter = 0;
        for(int i=0;i<n-1;i++) {
            for (int j = 0; j < n - 1; j++) {
                counter = counter + 1;
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(counter);
        System.out.println(Arrays.toString(arr));

    }

    /*
    Selection sort
     1)

     5 4 1 2 3 => 1 4 5 2 3
     1 4 5 2 3 => 1 2 5 4 3
     1 2 5 4 3 => 1 2 3 4 5
     1 2 3 4 5 => 1 2 3 4 5

     */

    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for(int i=0; i<n-1; i++) {
            int minIndex = i;
            for(int j = i+1; j < n; j++) {
                if(arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }


}
