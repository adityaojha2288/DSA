package com.company;

import java.util.Arrays;

public class Intersection_of_two_array {
    public static void main(String[] args) {
        int[] a1 = {1,4,4,5};
        int [] b1 = {4};
        int[] c = intersection(a1,b1);
        System.out.println(Arrays.toString(c));
    }
        static int[] intersection(int[] nums1, int[] nums2) {
        int[] a = new int[nums1.length];
        int b = 0;
        for (int Row = 0; Row < nums1.length; Row++) {
            for (int row2 = 0; row2 < nums2.length; row2++) {
                if (nums1[Row] == nums2[row2]) {
                    a[b] = nums1[Row];
                }
            }
        }
        return a;
    }
}
