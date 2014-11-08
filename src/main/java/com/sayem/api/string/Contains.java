package com.sayem.api.string;

public class Contains {

    public static void main(String[] args) {

        String str1 = "tutorials point", str2 = "hello";

        CharSequence cs1 = "int";

        boolean retval = str1.contains(cs1);
        System.out.println(retval);

        retval = str2.contains("_");
        System.out.println(retval);
    }
}
