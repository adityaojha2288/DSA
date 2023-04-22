package com.company;

import java.util.Arrays;

public class Two_Sum {
    public static void main(String[] args) {
        int[] arr = {1,4,5,6,8,9,10};
        int [] a = two_sum(arr,17);
        System.out.println(Arrays.toString(a));
    }
    static int[] two_sum(int[] numbers, int target){
        int start = 0;
        int end = numbers.length-1;
        while(start<=end){
           if (numbers[start]+numbers[end]<target){
                start++;
            }
           if(numbers[start]+numbers[end]>target){
                end--;
            }
           else{
               return new int[]{start,end};
           }
        }
        return new int[]{};
    }
}
