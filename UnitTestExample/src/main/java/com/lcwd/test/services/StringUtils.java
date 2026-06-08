package com.lcwd.test.services;

public class StringUtils {

    // reverse string method
    public static String reverse(String str){

        String rev = "";

        for(int i = str.length()-1; i >= 0; i--){
            rev = rev + str.charAt(i);
        }

        return rev;
    }

    // palindrome checking method
    public static boolean isPalindrome(String str){

        String reversed = reverse(str);

        return str.equalsIgnoreCase(reversed);
    }
}