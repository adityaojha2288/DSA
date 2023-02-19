package com.company;

import java.util.Scanner;

public class LinearSearch {

    public static void main(String[] args) {
        // write your code here
//        Scanner sc = new Scanner(System.in);
//        char target = 'z';
//        String name = "Aditya";
//        int [] arr = {53,68,35,23,81};
//        System.out.println(Maxi(arr));
//    }
//    // for maximum number
//    static int Maxi(int[] arr){
//        int num = arr[0];
//        for (int i = 0; i <arr.length ; i++) {
//            if (num<arr[i]){
//                num = arr[i];
//            }
//            else{
//                continue;
//            }
//
//        }
//        return num;
        Scanner sc =new Scanner(System.in);
        int[] narr = {10,555,654,789,25,5565,45523,548511};
        int a=even(narr);
        System.out.println(a);
    }
    // for the integer arr
//        static int linearSearch(int arr[], int target){
//        if(arr.length==0){
//            return -1;
//        }
//            for (int index = 0; index <arr.length ; index++) {
//                int element = arr[index];
//                if(element==target){
//                    return index;
//                }
//            }
//            return -1;

//        static boolean linerSearch2(String name,char target){
//        if(name.length()==0){
//            return false;
//        }
//            for (int i = 0; i <name.length() ; i++) {
//                char ele = name.charAt(i);
//                if (ele ==target){
//                    return true;
//                }
//
//            }
//            return false;
//        }

    static int count(int num){
        int digits = 0;
        while(num>0){
            digits++;
            num = num/10;
        }
        return digits;
    }
    static int even(int arr[]){
      int count =0;
      for(int num1 : arr){
          if(count(num1)%2==0){
              count++;
          }
      }
      return count;

    }


}
