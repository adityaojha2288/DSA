package com.company;

import java.util.ArrayList;
import java.util.List;

public class per {
    public static void main(String[] args) {
        int[] ans = {1,2,3};
        List<List<Integer>> a1 = permu(ans);
        System.out.println(a1);
    }
    static List<List<Integer>> permu(int[] nums){
        List<List<Integer>> ans = new ArrayList<>();
        for(int i =0; i<nums.length;i++){
            List<Integer> sub = new ArrayList<>();
            sub.add(nums[i]);
            for(int j =0;j<nums.length;j++){
                if(i!=j){

                    sub.add(nums[j]);
                }
            }
            ans.add(sub);
        }
        return ans;
    }
}
