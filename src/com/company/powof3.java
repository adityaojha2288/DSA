package com.company;

public class powof3 {
    public static void main(String[] args) {
        int n = 243;
        boolean ans = isPowerOfThree(n);
        System.out.println(ans);
    }
    static boolean isPowerOfThree(int n) {
        if(n ==0){
            return false;
        }
        double a = Math.ceil(Math.log(n))/Math.ceil(Math.log(3));
        return Math.ceil(a) == a;
    }
}
