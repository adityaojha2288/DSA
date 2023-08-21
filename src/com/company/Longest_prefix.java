package com.company;

public class Longest_prefix {
    public static void main(String[] args) {
        String [] s = {"flower", "flow", "flight"};
        String ans = longestCommonPrefix(s);
        System.out.println(ans);
    }
        static String longestCommonPrefix(String[] strs) {
            for(int i =0; i< strs.length;i++){
                if(strs[i].charAt(0)!=strs[0].charAt(0)){
                    return "";
                }
            }
            boolean ans = true;
            int j =1;
            while(ans){
                for(int i =1; i< strs.length; i++){
                    if(strs[i].substring(0,j) != strs[0].substring(0,j)){
                        ans = false;
                    }
                    else{
                        j++;
                    }
                }
            }
            return strs[0].substring(0,j-1);

        }


    }

