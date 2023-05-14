package com.company;

public class find_min_tosorted_array2 {
    class Solution {
        public int findMin(int[] nums) {
            boolean swapped = false;
            for (int i = 0; i < nums.length; i++) {
                swapped = false;
                for (int j = 1; j < nums.length - i; j++) {
                    if (nums[j] < nums[j - 1]) {
                        int temp = nums[j];
                        nums[j] = nums[j - 1];
                        nums[j - 1] = temp;
                        swapped = true;
                    }
                }
            }
            return nums[0];


        }
    }
}
