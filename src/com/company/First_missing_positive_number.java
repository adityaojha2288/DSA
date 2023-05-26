package com.company;

public class First_missing_positive_number {
        public int firstMissingPositive(int[] nums) {
            int i =0;
            while(i<nums.length){
                int cor = nums[i]-1;
                if(nums[i]>0 && nums[i]<nums.length &&  nums[i] !=nums[cor]){
                    swap(nums,i,cor);
                }
                else{
                    i++;
                }
            }
            for(int j =0; j<nums.length;j++){
                if(j+1 != nums[j]){
                    return j+1;
                }
            }
            return nums.length+1;
        }
        void swap(int [] arr, int s1, int s2){
            int temp = arr[s1];
            arr[s1] = arr[s2];
            arr[s2] = temp;
        }
    }

