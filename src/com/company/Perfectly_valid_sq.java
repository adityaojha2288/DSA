package com.company;

public class Perfectly_valid_sq {
    public static void main(String[] args) {
        boolean a = pvsq(16);
        System.out.println(a);
    }
    static boolean pvsq(int num){
        int start = 0;
        int end = num;
        while (start>=end){
            int mid = start + (end-start)/2;
            if (mid==(num/mid)) {
                return true;
            }
            if(mid > num/mid){
                end = mid-1;
            }
            else{
                start = mid+1;
            }


        }
        return false;
    }
}
