package com.company;

public class Kth_missing {
    static int Kth(int[] arr,int k){
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] - mid - 1 < k) left = mid + 1;
            else right = mid - 1;
        }
        return left + k;
    }
}
