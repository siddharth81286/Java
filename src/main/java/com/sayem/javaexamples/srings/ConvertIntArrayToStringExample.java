package com.sayem.javaexamples.srings;


import java.util.Arrays;

public class ConvertIntArrayToStringExample {

    public static void main(String[] args) {

        int [] intNumbers = new int[]{1, 2, 3, 4, 5};

        StringBuffer stringBuffer = new StringBuffer();

        String strSeparator = " ";

        if (intNumbers.length > 0){
            stringBuffer.append(intNumbers[0]);

            for (int i = 0; i < intNumbers.length; i++){
                stringBuffer.append(strSeparator).append(intNumbers[i]);
            }
        }

        String strNumbers = Arrays.toString(intNumbers);
        System.out.println("String generated from Arrays.toString method: " + strNumbers);
    }
}
