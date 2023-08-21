package com.company;

public class Count_Neg_number_in_sorted {
        public int countNegatives(int[][] grid) {
            int count =0;
            for (int[] ints : grid) {
                for (int ele : ints) {
                    if (ele < 0) {
                        count++;
                    }
                }
            }
            return count;
        }
    }

