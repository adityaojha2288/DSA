package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Searchin2darray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int[][] arr = {
                {2,12,15},
                {10,20,8},
                {42,20,70,5},
                {9,23,43}
        };
        int [] ans = Search(arr,target);
        System.out.println(Arrays.toString(ans));

    }
    static int[] Search(int arr[][],int target){

        for (int Row = 0; Row <arr.length ; Row++) {
            for (int Col = 0; Col <arr[Row].length ; Col++) {
                int ele = arr[Row][Col];
                if (ele==target){
                    return new int[]{Row,Col};
                }

            }

        }
        return null;

    }
}
