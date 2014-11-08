package com.sayem.api.string;

/*
 codePointBefore(int index)
 Returns the character (Unicode code point) before the specified index.
 */
public class CodePointBefore {

    public static void main(String[] args) {

        String str = "Learning Java";

        System.out.println(str.codePointBefore(1));
        System.out.println(str.codePointBefore(10));
    }
}
