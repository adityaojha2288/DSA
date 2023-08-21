package com.company;

import java.util.ArrayList;
import java.util.List;

public class Letter_comb {
    public static void main(String[] args) {
    List<String> a =Comb("","12");
        System.out.println(a);
    }
    static List<String> Comb(String p, String up){
        if (up.isEmpty()){
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        List<String> ans = new ArrayList<>();
        int index = up.charAt(0) - '0';
        for (int i =(index-1)*3; i <=index *3 ; i++) {
            char ch = (char) ('a' +i);
            ans.addAll(Comb(p+ch,up.substring(1)));
        }

        return ans;
    }
}
