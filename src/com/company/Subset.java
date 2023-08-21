package com.company;

import java.util.ArrayList;
import java.util.List;

public class Subset {
    public static void main(String[] args) {
        int [] arr = {1,2,3};
        List<List<Integer>> ans = Itter(arr);
        System.out.println(ans);
    }

    static List<List<Integer>> Itter(int[] arr){
        List<List<Integer>> outter  = new ArrayList<>();
        outter.add(new ArrayList<Integer>());
        for(int num : arr){
            int n = outter.size();
            for (int i = 0; i <n ; i++) {
                List<Integer> internal = new ArrayList<>(outter.get(i));
                internal.add(num);
                outter.add(internal);
            }
        }
        return outter;
    }
//    static String Subsec(String p , String up){
//        return up;
//    }
}
