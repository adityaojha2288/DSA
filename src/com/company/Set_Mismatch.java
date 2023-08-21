package com.company;

import java.util.Arrays;
public class Set_Mismatch {

        static int[] findErrorNums(int[] nums) {
            int i =0;
            while(i<nums.length){
                int cor = nums[i]-1;
                if(nums[i] != nums[cor]){
                    swap(nums,i,cor);
                }
                else{
                    i++;
                }
            }
            int [] ans = new int[2];
            for(int j =0;j<nums.length;j++){
                if(j != nums[j]-1){
                    ans[0] = nums[j];
                    ans[1] = j+1;
                }
            }
            return ans;
        }
        static void swap(int[] arr , int s1,int s2){
            int temp = arr[s1];
            arr[s1]= arr[s2];
            arr[s1] = arr[s1];
        }
    public static void main(String[] args) {
        int[] nums = {3,2,2};
        findErrorNums(nums);
        System.out.println(Arrays.toString(nums));
    }
}

