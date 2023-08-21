package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Prime_pair {
    public static void main(String[] args) {
        List<int[]> ans = pair_prime(4,30,6);
        for (int[] an : ans) {
            System.out.print(Arrays.toString(an)+ "  ");
        }
        System.out.println();
        System.out.println(ans.size());
    }
    static List<int []> pair_prime(int range1, int range2 ,int difference){
        List<int []> l1 = new ArrayList<>();
        for (int i = range1; i <range2 ; i++) {
            if(prime(i) && prime(i+difference) && i+6<range2){
                int[] a = {i,i+6};
                l1.add(a);
            }

        }

        return l1;
    }
    static boolean prime(int n){
        if (n <= 1)
            return false;
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;

        return true;
    }
}
