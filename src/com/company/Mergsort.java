package com.company;

import java.util.Arrays;

public class Mergsort {
    public static void main(String[] args) {
        int[] arr = {5,6,8,0,13};
        int[ ] ans = Merge(arr);
        System.out.println(Arrays.toString(ans));
    }
    static int[] Merge(int [] arr){
        if(arr.length == 1){
            return arr;
        }
        int mid = arr.length/2;
        int [] left = Merge(Arrays.copyOfRange(arr,0,mid));
        int [] right = Merge(Arrays.copyOfRange(arr,mid,arr.length));
        
        return Msort(left , right);
    }

    private static int[] Msort(int[] left, int[] right) {
        int [] ans = new int [left.length+ right.length];
        int i =0;
        int j =0;
        int k =0;
        while(i<left.length && j<right.length){
            if (left[i]<right[j]){
                ans[k] = left[i];
                i++;
            }
            else{
                ans[k] = right[j];
                j++;
            }
            k++;
        }
        while(i< left.length){
            ans[k] = left[i];
            k++;
            i++;
        }
        while(j< right.length){
            ans[k] = right[j];
            k++;
            j++;
        }


        return ans;
    }
}
