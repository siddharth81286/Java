package com.sayem.api.string;

/*
    codePointAt(int index)
    Returns the character (Unicode code point) at the specified index.
 */

public class CodePointAt {

    public static void main(String[] args) {

        String x = "Learning Java";
        System.out.println(x.codePointAt(0));
        System.out.println(x.codePointAt(9));
    }
}
