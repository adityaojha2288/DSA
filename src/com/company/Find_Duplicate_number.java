package com.company;

public class Find_Duplicate_number {

        public int findDuplicate(int[] nums) {
            int i =0;
            while(i<nums.length){
                int cor = nums[i]-1;
                if(nums[i]!=nums[cor]){
                    swap(nums,i,cor);
                } else{
                    i++;
                }
            }
            for(int j =0;j<nums.length;j++){
                if(nums[j] !=j+1){
                    return nums[j];
                }
            }

            return -1;
        }
        void swap(int[] arr, int s1, int s2){
            int temp = arr[s1];
            arr[s1]= arr[s2];
            arr[s2]=temp;
        }

}
