package com.company;
public class RotatedBinarySearch {
    public static void main(String[] args) {
        int [] arr = {4,5,6,7,10,0,1,2};
        int target = 6;
        int t = rotatedbinary(arr,target);
        System.out.println(t);
    }
    static int rotatedbinary(int [] arr,int target){
        int a = pivot(arr);
        int b = Binary(arr,target,0,a);
        if(b!=-1){
            return b;
        }
        return Binary(arr,target,a,(arr.length));
    }
    static int Binary(int[] arr,int target,int start,int end){
        while(start<=end){
            int mid = start +((end -start)/2);
            if (target>arr[mid]){
                start = mid +1;
            }
            else if (target<arr[mid]){
                end = mid -1;
            }
            else if (target ==arr[mid]){
                return mid;
            }
        }
        return -1;
    }
    static int pivot(int[] arr){
        int start =0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start +((end-start)/2);
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if (mid> start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[start]>arr[mid]){
                end = mid -1;
            }
            if(arr[start] < arr[mid]){
                start = mid+1;
            }
        }
        return -1;
    }
}
