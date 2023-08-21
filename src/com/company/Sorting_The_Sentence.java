package com.company;

import java.util.Arrays;

public class Sorting_The_Sentence {
    public static void main(String[] args) {
       String ans =  sortSentence("This4 is3 a2 eg1");
        System.out.println(ans);
    }

    static String sortSentence(String s){
                String[] str = new String[s.split(" ").length];
                for(String st : s.split(" "))
                {
                    str[st.charAt(st.length()-1) - '1'] = st.substring(0,st.length()-1);
                }
                return String.join(" ",str);
            }
        }



