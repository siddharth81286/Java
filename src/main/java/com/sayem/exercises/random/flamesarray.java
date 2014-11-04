package com.sayem.exercises.random;

import java.io.*;
import java.util.Locale;


public class flamesarray {


    public static void main(String[] args) throws IOException{

        char flames[]={'f','l','a','m','e','s'};
        System.out.println("enter the first name:");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String nam1=br.readLine();
        System.out.println("enter sencond name:");
        String nam2=br.readLine();
        nam1.toUpperCase(Locale.ENGLISH);
        nam2.toUpperCase(Locale.ENGLISH);
        int ln1=nam1.length();
        int ln2=nam2.length();
        char[] arr1=nam1.toCharArray();
        char[] arr2=nam2.toCharArray();
        int left=0;
        for(int g=0;g<ln1;g++)
        {
            for(int h=0;h<ln2;h++)
            {
                if (arr1[g]==arr2[h])
                {
                    left++;
                    arr2[h]='\0';
                }
            }
        }
        int rem=(ln1+ln2)-(2*left);
        if(rem<=6)
        {
            switch(rem)
            {
                case 3:
                    System.out.println("Friends");
                    break;
                case 4:
                    System.out.println("Enemies");
                    break;
                case 5:
                    System.out.println("Friends");
                    break;
                case 6:
                    System.out.println("Marriage");
                    break;
                case 2:
                    System.out.println("Enemies");
                    break;
                case 1:
                    System.out.println("Sisters");
                    break;
            }
        }
        else{
            char[] swap=new char[100];
            char store[]=new char[100];
            int f6=6;
            for(int f5=0;f5<5;f5++,f6--)
            {

                int del=rem%f6;
                if(del==0)
                    del=f6;

                for(int f=0;f<f6;f++,++del)
                {
                    if(del>=f6)
                    {
                        del=0;
                    }
                    store[f]=flames[del];



                }

                for (int h=0;h<f6;h++)
                {
                    swap[h]=store[h];
                    store[h]=flames[h];
                    flames[h]=swap[h];
                }



            }

            switch(flames[0])
            {
                case 'f':
                    System.out.println("Friends");
                    break;
                case 'l':
                    System.out.println("Lovers");
                    break;
                case 'a':
                    System.out.println("Ancestors");
                    break;
                case 'm':
                    System.out.println("Marriage");
                    break;
                case 'e':
                    System.out.println("Enemies");
                    break;
                case 's':
                    System.out.println("Sisters");
                    break;
            }
        }
    }
}
