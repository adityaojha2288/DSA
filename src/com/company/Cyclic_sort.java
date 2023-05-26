package com.company;

import java.util.Arrays;

public class Cyclic_sort {
    public static void main(String[] args) {
        int[] arr = {5,3,4,2,1};
        cycle(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void cycle(int [] arr){
        int i = 0;
        while(i<arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
                i++;
            }
        }
    }
    static void swap(int [] arr, int f1,int f2){
        int temp = arr[f1];
        arr[f1] = arr[f2];
        arr[f2] = temp;
    }
}
