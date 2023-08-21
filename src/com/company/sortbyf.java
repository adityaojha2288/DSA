package com.company;

public class sortbyf {

        public String frequencySort(String s) {
            int [] cnt=new int[123];
            for(char ch:s.toCharArray())
                cnt[ch]++;
            char[] c =new char[s.length()];
            for(int i=0;i<s.length();){
                int max=0;
                int index=0;
                for(int j=0;j<123;j++){
                    if(cnt[j]>max){
                        max=cnt[j];
                        index=j;
                    }
                }
                while(cnt[index]>0){
                    c[i++]=(char)index;
                    cnt[index]--;
                }
            }
            return new String(c);
        }
    }

