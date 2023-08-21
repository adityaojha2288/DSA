package com.company;

public class Kaprekaar_number {
    public static void main(String[] args) {
        int a = 9;
        boolean b = kaprekaar(a);
        System.out.println(b);
    }
    static boolean kaprekaar(int num) {
        int sq = num * num;
        for (int i = 0; i < Integer.toString(sq).length(); i++) {
            int div = (int) Math.pow(10,i);
            int sum = sq / div + sq % div;
            if (sum == num) {
                return true;
            }
        }
            return false;
    }
}
