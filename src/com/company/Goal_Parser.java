package com.company;

public class Goal_Parser {
    public static void main(String[] args) {
        String s1 = interpret("G()(al)l");
        System.out.println(s1);
    }

        static String interpret(String command) {
            int i=0;
            StringBuilder s = new StringBuilder();
            while(i<command.length()){
                switch(command.charAt(i)){
                    case 'G':
                        s.append('G');
                        i++;
                        break;
                    case '(':
                        if(command.charAt(i+1)==')'){
                            s.append('o');
                            i+=2;
                            break;
                        }
                        else{
                            s.append("al");
                            i+=2;
                            break;
                        }
                }
            }
            return s.toString();
        }
    }

