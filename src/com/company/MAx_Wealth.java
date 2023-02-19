package com.company;

public class MAx_Wealth {

    public static void main(String[] args) {
        int[][] accounts ={
                {100,22,38},
                {4,88,65},
                {7,56,36}
        };

    }
    static int maxwealth(int[][] accounts) {
        int max = 0;
        for (int[] account : accounts) {
            int total = 0;
            for (int acc = 0; acc < account.length; acc++) {
                total = total + account[acc];
            }
            if (total > max) {
                max = total;
            }


        }
        return max;
    }
}
