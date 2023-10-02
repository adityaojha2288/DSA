package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class longestsub {
    public static void main(String[] args) {


        List<Character> ans = new ArrayList<>();
        CharSequence s;
        String a = "a";
        int[] a1 =
                {44, 32, -9, 52, 23, -50, 50, 33, -84, 47, -14, 84, 36, -62, 37, 81, -36, -85, -39, 67, -63, 64, -47, 95, 91, -40, 65, 67, 92, -28, 97, 100};
        int sum =0;
        for(int r :a1){
            sum +=r;
        }
        System.out.println(sum);
    }
        static int lengthOfLongestSubstring (String s){
            char[] s1 = new char[s.length()];
            for (int i = 0; i < s.length(); i++) {
                s1[i] = s.charAt(i);
            }
            Arrays.sort(s1);
            int i = 0;
            int j = 1;
            int count = 1;
            while (j < s1.length) {
                if (s1[i] == s1[j]) {
                    j++;
                } else if (s1[i] != s1[j]) {
                    i = j;
                    j++;
                    count++;
                }
            }
            return count;
        }

    }

