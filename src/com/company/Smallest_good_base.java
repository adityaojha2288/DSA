package com.company;

public class Smallest_good_base {
    class Solution{
        public int isPossible(long base, int digits, long targetValue){

            if(base >= targetValue)
                return 1;

            long mul = 1;
            for(int i = 0 ;(i < digits && targetValue>=0); i++){
                targetValue-=mul;
                if( i != digits-1){
                    if(mul > targetValue/base)
                        return 1;
                }
                mul = mul*base;
            }
            if(targetValue == 0)
                return 0;
            if(targetValue > 0)
                return -1;
            return 1;
        }
        public String smallestGoodBase(String n) {

            long value = Long.valueOf(n);
            String tempSol = String.valueOf(value-1);
            for(int i = 64 ; i >= 2 ; i--){

                long currSol=-1;
                long low = 2;
                long high = value-1;

                while(low <= high){

                    long currBase = (high-low)/2+low;
                    currSol = isPossible(currBase,i,value);
                    if(currSol == 0){
                        return String.valueOf(currBase);
                    }

                    if(currSol == 1 ){
                        high = currBase-1;
                    }else{
                        low = currBase+1;
                    }

                }



            }
            return tempSol;

        }
    }
}
