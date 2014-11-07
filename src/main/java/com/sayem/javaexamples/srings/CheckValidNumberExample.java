package com.sayem.javaexamples.srings;

public class CheckValidNumberExample {

    public static void main(String [] args){

        String [] str = new String []{"10.20", "123456", "12.invalid"};

        for (String aStr : str) {
            if (aStr.indexOf(".") > 0) {

                try {
                    Double.parseDouble(aStr);
                    System.out.println(aStr + " is a valid number");
                } catch (NumberFormatException e) {
                    System.out.println(aStr + " is not a valid number");
                }
            } else {

                try {
                    Integer.parseInt(aStr);
                    System.out.println(aStr + " is a valid integer number");
                } catch (NumberFormatException e) {
                    System.out.println(aStr + " is not a valid integer number");
                }
            }
        }

    }
}
