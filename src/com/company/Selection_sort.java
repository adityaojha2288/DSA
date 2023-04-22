package com.company;

import java.util.Arrays;

public class Selection_sort {
    public static void main(String[] args) {
        int[] arr = {4,5,8,9,6};
        Selection(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void Selection(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length-i-1;
            int Max = getMaxIndex(arr,0,last);
            swap(arr,last,Max);
        }
    }
    static void swap(int[] arr, int f1,int f2){
        int temp = arr[f1];
        arr[f1] = arr[f2];
        arr[f2] = temp;
    }
    static int getMaxIndex(int[] arr,int start,int last){
        int max = start;
        for (int j = start; j <= last ; j++) {
            if (arr[max] < arr[j]) {
                max = j;
            }
        }
        return max;
    }

}
