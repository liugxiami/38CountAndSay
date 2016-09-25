package com.ccsi;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        System.out.println(countAndSay(3));
    }
    //The count-and-say sequence is the sequence of integers beginning as follows:
    //1,11,21,1211,111221,...
    //1 is read off as "one 1" or 11
    //11 is read off as "two 1s" or 21
    //21 is read off as "one 2, then one 1" or 1211
    public static String countAndSay(int n){
        String baseStr="1";
        int index=1;
        if(n>=2){
            while(index<n){
                int len=baseStr.length();
                StringBuilder newStr=new StringBuilder();
                int i=0;
                while (i < len){
                    int counter=1;
                    char pre=baseStr.charAt(i);

                    while (i+1<len&&baseStr.charAt(i+1)==pre){
                        counter++;
                        i++;
                    }
                    newStr.append(counter);
                    newStr.append(pre);
                    i++;

                }
                baseStr=newStr.toString();
                index++;
            }
        }
        return baseStr;
    }
}
