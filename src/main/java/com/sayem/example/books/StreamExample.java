package com.sayem.example.books;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;


/**
 * Created by syed.sayem on 6/14/15.
 */
public class StreamExample {

    @Test
    public void secondExample(){
        List<Integer> l = Arrays.asList(5, 4, 88, 76, 55, 23, 7, 20, 45);

    }


    @Test
    public void firstExample(){
        List<Integer> l = Arrays.asList(5, 4, 88, 76, 23, 7, 20, 45);
        l.stream()
                .filter(p -> p % 2 == 1)
                .forEach(i -> System.out.println(i + " "));
    }
}
