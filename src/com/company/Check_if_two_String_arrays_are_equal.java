package com.company;

import java.util.Arrays;
import java.util.Objects;

public class Check_if_two_String_arrays_are_equal {
    public static void main(String[] args) {
        String[] word1 = {"abc", "d","defg"};
        String[] word2 = {"abcddefg"};
        boolean ans = arrayStringsAreEqual(word1,word2);
        System.out.println(ans);
    }
    static boolean arrayStringsAreEqual(String[] word1, String[] word2){
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        for (String s : word1) {
            s1.append(s);
        }
        for (String s : word2) {
            s2.append(s);
        }
        System.out.println(s1);
        System.out.println(s2);
        return Objects.equals(s1.toString(), s2.toString());
    }
}
