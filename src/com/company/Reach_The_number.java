package com.company;
public class Reach_The_number
{
    public static void main(String[] args) {
        int a = reach(11);
        System.out.println(a);
    }
    static int reach(int num){
        if (num==1 || num == -1){
            return 1;
        }
        int i1=  num<-1 ?  -(num) :  num;
        int [] sums = new int[i1+1];
        for (int i = 0; i <=i1 ; i++) {
            int sum = i*(i+1)/2;
            sums[i] = sum;
        }
        int a = Binary(sums,i1,0, sums.length-1);
        if (a==-1){
            int c1 =cieling(sums, i1);
            int f1 = floor(sums, i1);
            if (sums[c1] - i1 >= i1-sums[f1])
                return (( i1-sums[f1]) * 2) + f1;
            if (sums[c1] - i1 < i1-sums[f1])
                return ((sums[c1] - i1) * 2) + c1;
        }
        return (int) (Math.sqrt(8 * sums[a] + 1) - 1) / 2;
    }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    static int Binary(int[] arr, int target, int start, int end){
        if(start>end){
            return -1;
        }
        int mid = start +(end-start)/2 ;
        if (arr[mid]==target){
            return mid;}
        if (arr[mid]>target){
            Binary(arr,target,start,mid-1);}
        return Binary(arr,target,mid+1,end);
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    static int cieling(int[] array, double target) {
    int left = 0;
    int right = array.length - 1;
    int result = -1;

            while (left <= right) {
    int mid = left + (right - left) / 2;

    if (array[mid] == target) {
        return mid;
    } else if (array[mid] < target) {
        left = mid + 1;
    } else {
        result = mid;
        right = mid - 1;
    }
}

            return result;
}
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    static int floor(int[] array, double target) {
        int left = 0;
        int right = array.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == target) {
                return mid;
            } else if (array[mid] > target) {
                right = mid - 1;
            } else {
                result = mid;
                left = mid + 1;
            }
        }

        return result;

    }
}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
