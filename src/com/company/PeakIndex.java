package com.company;

public class PeakIndex {
    public static void main(String[] args) {
        int [] arr = {0,10,15,5,2};
        int a = peak(arr);
        System.out.println(a);

    }
    static int peak(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int mid = 0;
        while (start < end) {
            mid = start + ((end - start) / 2);
            if (arr[mid] > arr[mid + 1]) {
                end = mid ;
            }
            else if (arr[mid] < arr[mid+1]) {
                start = mid +1;
            }
        }
        return start;
    }
}

