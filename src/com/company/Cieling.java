package com.company;

public class Cieling {
    public static void main(String[] args) {
        int[] arr ={2,3,5,9,14,16,18};
        double target = 10.123;
        int a = cieling(arr,target);
        System.out.println(a);
    }

    static int cieling(int[] arr, double target) {
        int Cielling = 0;
        int start = 0;
        int end = arr.length - 1;
            while (start <= end) {
                int mid = start + ((end - start) / 2);
                if (target > arr[mid]) {
                    start = mid + 1;

                } else if (target < arr[mid]) {
                    end = mid - 1;
                    Cielling = arr[mid];
                }
            }
            return Cielling;

        }
    }

