package com.KosolapovNikolai;


import java.util.Arrays;

public class Main {

    public static boolean palindromeCheck(String str){
        char[] charStrArr = str.toCharArray(); // Array of str's chars. <---------------------------|
        char[] invertedCharStrArr = new char[charStrArr.length]; // Inverted array of str's chars.--|
        for(int invertedCopy = 0; invertedCopy < invertedCharStrArr.length; invertedCopy++){ // Copy chars in opposite order.
            invertedCharStrArr[invertedCopy] = charStrArr[(charStrArr.length - 1) - invertedCopy];
        }
        return Arrays.equals(charStrArr , invertedCharStrArr); // output is true, if str's chars array is equal to inverted str's chars array.
    }

    public static void main(String[] args) {

        String genius = "Genius"; // str's chars array: |"G"|"e|"n"|"i"|"u"|"s"|. Opposite str's chars array: |"s"|"u"|"i"|"n"|"e"|"G"|. Output: false.
        String wow = "wow"; // str's chars array: |"w"|"o"|"w"|. Opposite str's chars array: |"w"|"o"|"w"|. Output: true.

        System.out.println(palindromeCheck(genius));
        System.out.println(palindromeCheck(wow));

    }
}
