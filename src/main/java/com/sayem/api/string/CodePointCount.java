package com.sayem.api.string;

/*
codePointCount(int beginIndex, int endIndex)
Returns the number of Unicode code points in the specified text range of this String.
 */
public class CodePointCount {

    public static void main(String[] args) {

        String str = "Learning Java";
        System.out.println(str.codePointCount(0, 9));

    }
}
