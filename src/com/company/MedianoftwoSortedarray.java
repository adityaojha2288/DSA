package com.company;

import java.util.Arrays;

public class MedianoftwoSortedarray {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length + nums2.length];
        int j = 0;
        for (int k : nums1) {
            ans[j] = k;
            j++;
        }
        for (int k : nums2) {
            ans[j] = k;
            j++;
        }
        Arrays.sort(ans);
        int mid = (ans.length) / 2;
        if (ans.length % 2 != 0) return (double) ans[mid];
        int a = ans[mid] + ans[mid - 1];
        double x = (double) a / 2;
        return x;
    }
}
