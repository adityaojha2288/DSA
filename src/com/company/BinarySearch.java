package com.company;

public class BinarySearch {
    public static void main(String[] args) {

        int[] arr = {1000,856,87,55,22,20,15,14,2,1,0};
        int target = 20;
        int a = Binarysearch(arr, target);
        System.out.println(a);

    }

    // FOr ascending order
    static int Binarysearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[end] > arr[start];
        if (isAsc) {
            while (start <= end) {
                int mid = start + ((end - start) / 2);
                if (target > arr[mid]) {
                    start = mid + 1;
                } else if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    continue;
                }
            }
            return -1;
        } else {
            // for Descending order
                while (start <= end) {
                    int mid = start + ((end - start) / 2);
                    if (target > arr[mid]) {
                        end = mid - 1;
                    } else if (target < arr[mid]) {
                        start = mid + 1;
                    } else {
                        return mid;
                    }
                }
                return -1;
            }


        }
    }


