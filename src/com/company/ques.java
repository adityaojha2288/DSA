package com.company;
import java.util.Arrays;

public class ques {
    public static void main(String[] args) {
        int[] arr = {4,3,2,1,6};
        int a= cycle(arr);
        System.out.println(a);
    }
    static int cycle(int [] arr){
        int i = 0;
        while(i<arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
            for (int j = 0; j < arr.length ; j++) {
                if(arr[j] != j+1){
                    return j+1;
                }

            }

        return -1;
    }
    static void swap(int [] arr, int f1,int f2){
        int temp = arr[f1];
        arr[f1] = arr[f2];
        arr[f2] = temp;
    }
}
