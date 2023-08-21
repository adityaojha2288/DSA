package com.company;

public class Defanging_ip {

    public static void main(String[] args) {
        String ip = "1.1.1.1";
        System.out.println(defangIPaddr(ip));
    }
    static String defangIPaddr(String address) {
        StringBuilder t= new StringBuilder(address);
        StringBuilder s= new StringBuilder();
        for(int i=0;i<address.length();i++){
            if(address.charAt(i)=='.'){
                s.append("[.]");
            }else s.append(address.charAt(i));

        }
        return s.toString();

}
}

