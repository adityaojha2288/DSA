package com.company;

import java.util.ArrayList;

public class find_all_no_Dissappeared {
        public ArrayList<Integer> findDisappearedNumbers(int[] nums) {
            int i =0;
            while(i<nums.length){
                int correct = nums[i]-1;
                if(nums[i] != nums[correct]){
                    swap(nums,i,correct);
                }
                else{
                    i++;
                }
            }
            //Generting ans
            ArrayList<Integer> ans = new ArrayList<>();
            for(int index =0;index<nums.length;index++){
                if(nums[index] != index+1){
                    ans.add(index+1);
                }
            }
            return ans;
        }
        void swap(int[] arr, int f1, int f2){
            int temp = arr[f1];
            arr[f1] = arr[f2];
            arr[f2] = temp;
        }
    }

