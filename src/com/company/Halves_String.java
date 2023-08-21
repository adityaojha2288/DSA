package com.company;

public class Halves_String {
    public static void main(String[] args) {
        boolean ans = halvesAreAlike("book");
        System.out.println(ans);
    }
    static boolean halvesAreAlike(String s){
        int mid = s.length()/2 ;
        int c1 = 0, c2 =0;
        for (int i = 0,j=s.length()-1; i <mid ;  i++, j--) {
            if(isVowels(s.charAt(i))){c1++;}
            if(isVowels(s.charAt(j))){c2++;}
        }
        return c1==c2;
    }
    static boolean isVowels(char c){
        return c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U';
    }
}
