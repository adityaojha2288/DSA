package com.company;

public class Shuffle_String {
    public static void main(String[] args) {
        String s = "codeleet";
        int[] ar = {4,5,6,7,0,2,1,3};
        System.out.println(ss(s,ar));
    }

    static String ss(String s, int[] indices){
        StringBuilder s1 = new StringBuilder(s.length());
        for (int j = 0; j < s.length(); j++) {
            s1.append(s.charAt(j));
        }
        return String.valueOf(s1);
    }
}
