package com.company;

public class Roughly {
    public static void main(String[] args) {
        int sum = 11;
        int n = (int) ((int) Math.sqrt(2 * sum + 0.25) - 0.5);
        System.out.println(n);
    }
}
