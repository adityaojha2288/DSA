package com.company;

public class Largets_num {
        public String largestNumber(int[] nums) {
            Bubbles(nums);
            String s = null;
            for (int num : nums) {
                s += num;
            }
            return s;


        }
       static void Bubbles(int[] arr){
            boolean swapped = false;
            for (int i = 0; i < arr.length ; i++) {
                swapped = false;
                for (int j = 1; j < arr.length - i; j++) {
                    if (arr[j] < arr[j - 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j - 1];
                        arr[j - 1] = temp;
                        swapped = true;
                    }
                }
                if (!swapped)
                    break;
            }
        }
    }

