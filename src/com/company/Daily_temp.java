package com.company;

public class Daily_temp {
    public static void main(String[] args) {
    }
    static int [] room(int[] temperatures){
        int [] ans = new int[temperatures.length];
        int count = 1;
        int j =0;
        int max_temp = temperatures[0];
        for (int i = 0; i < temperatures.length-1; i++) {
            if (max_temp>temperatures[i]){
                max_temp = temperatures[i];
                ans[j] = count;
                count = 1;
            }
            else{
                count++;
            }
            j++;



        }
        return ans;
    }
}
