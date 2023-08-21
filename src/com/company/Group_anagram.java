package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Group_anagram {
    public static void main(String[] args) {
        String[] str = {"eat","tea","tan","ate","nat","bat"} ;
        List<List<String>> Final = grp_anagram(str);
        System.out.println(Final);
    }

    static List<List<String>> grp_anagram(String [] strs) {

            List<List<String>> answer = new ArrayList<>();
            for (int i = 0; i < strs.length; i++) {
                if (!Objects.equals(strs[i], "Removed")) {
                    List<String> subans = new ArrayList<>();
                    char[] charArray = strs[i].toCharArray();
                    Arrays.sort(charArray);
                    subans.add(strs[i]);
                    for (int j = i + 1; j < strs.length; j++) {
                        char[] charArray1 = strs[j].toCharArray();
                        Arrays.sort(charArray1);
                        if (Arrays.equals(charArray, charArray1)) {
                            subans.add(strs[j]);
                            strs[j] = "Removed";
                        }


                    }
                    answer.add(subans);
                    strs[i] = "Removed";

                }
            }




            return answer;



    }
   }

