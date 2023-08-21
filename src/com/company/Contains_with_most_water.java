package com.company;

import java.util.ArrayList;
import java.util.List;

public class Contains_with_most_water {
    public static void main(String[] args) {
        int[] arr = {1,8,6,2,5,4,8,3,7};
        int a = maxArea(arr);
        System.out.println(3 + + '3');
    }
    static int maxArea(int[] height) {
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < height.length ; i++) {
            for (int j = 1; i < height.length; i++) {
                int length = Math.min(height[i], height[j]);
                int breadth = Math.abs(j-i);
                ans.add(length*breadth);

            }
        }
        return Max(ans);

    }
    static int Max(List<Integer> s ){
        int max =0;
        for (Integer integer : s) {
            if (max < integer) {
                max = integer;
            }
        }
        return max;
    }
}
