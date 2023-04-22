package com.company;
import java.util.stream.IntStream;

public class Sq_root {
    public static void main(String[] args) {
        int a = sqrt(2147395599);
        System.out.println(a);
    }
    static int sqrt(int x){
        int start =1;
        int end = x;
        while (start <= end) {
            int mid = start + (end-start)/2;
            if(mid<=x/mid){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return end;
    }
}
