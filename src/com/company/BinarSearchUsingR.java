package com.company;

public class BinarSearchUsingR {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        int ans = Binary(arr,1,0, arr.length-1);
        System.out.println(ans);
    }
    static int Binary(int[] arr, int target, int start, int end){
        if(start>end){
            return -1;
        }
        int mid = start +(end-start)/2 ;
        if (arr[mid]==target){
            return mid;
        }
        if (arr[mid]>target){
            Binary(arr,target,start,mid-1);
        }
        return Binary(arr,target,mid+1,end);

    }

}
