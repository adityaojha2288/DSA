package com.company;

public class SearchinMountain {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,1};
        int target = 3;
        int t = search(arr,target);
        System.out.println(t);
    }
    static int search(int[] arr,int target){
        int a = mountaion(arr);
        if(target>a) {
            int b = Binarysearch(arr, target, a, arr.length);
            return b;
        }
        else if (target<a) {
            int c = Binarysearch(arr, target, 0, a);
            return c;
        }
        return -1;
    }
    static int mountaion(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int mid = 0;
        while (start < end) {
            mid = start + ((end - start) / 2);
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            }
        }
        return start;
    }
    static int Binarysearch(int[] arr, int target,int start,int end) {
            while (start <= end) {
                int mid = start + ((end - start) / 2);
                if (target > arr[mid]) {
                    start = mid + 1;
                } else if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    return mid;
                }
            }
            return -1;
        }
    }

