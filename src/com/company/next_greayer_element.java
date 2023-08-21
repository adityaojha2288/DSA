package com.company;

import java.util.Arrays;

public class next_greayer_element {
    public static void main(String[] args) {
        int[] n1 = {2,1,3};
        int[] n2 = {2,3,1};
        int [] a = nextGreaterElement(n1,n2);
        System.out.println(Arrays.toString(a));
    }
    static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            int n = nums1[i];
            int index = Binary(nums2, n);
            if (index == nums2.length - 1) {
                index = -1;
            }
            if (n < nums2[index + 1]) {
                ans[i] = nums2[index + 1];
            } else {
                ans[i] = -1;
            }

        }
        return ans;
    }
    static int Binary(int[] nums, int target){
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + ((end - start) / 2);
            if (target > nums[mid]) {
                start = mid + 1;
            } else if (target < nums[mid]) {
                end = mid - 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
