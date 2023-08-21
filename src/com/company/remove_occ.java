package com.company;

import java.sql.SQLOutput;

public class remove_occ {
    public static void main(String[] args) {
        String a = "aabababa";
        String ans = Stream(a, "aba");
        System.out.println(2^3);
        
        System.out.println(ans);
    }
    static String Stream(String p, String target){
        while(p.indexOf(target) != -1){
            p = p.replace(target,"");
        }
        return p;
    }
}
