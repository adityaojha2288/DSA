package com.company;

public class SmallestLetter {
    public static void main(String[] args) {
        char[] arr ={'c','f','j'};
        char target = 'a';
        char a = nextGreatestLetter(arr,target);
        System.out.println(a);
    }

    public static char nextGreatestLetter(char[] letters, char target) {

        int Cielling = 0;
        int start = 0;
        int end = letters.length - 1;
        while (start <= end) {
            int mid = start + ((end - start) / 2);
            if (target > letters[mid]) {
                start = mid + 1;

            } else  {
                end = mid - 1;
                Cielling = letters[mid];
            }
        }
        return letters[start % letters.length];

    }
    }

