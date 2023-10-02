package com.company;

public class rec {
    public static void main(String[] args) {
        int a = rev(1234);
        double b = Math.log10(243)/Math.log10(3);
        System.out.println(Math.ceil(b));
    }
    static int rev(int n){
        if(n%10==n){
            return n;
        }
        return (int) ((n%10)*(Math.pow(10,count(n/10)))) +rev(n/10);
    }
    static int count(int n ){
        return (int) Math.log10(n)+1;
    }
}
