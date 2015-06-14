package com.sayem.stream.api.create;

import org.testng.annotations.Test;

import java.util.stream.IntStream;

/**
 * Created by syed.sayem on 6/14/15.
 */
public class IntStreamExample {

    @Test
    public void intStreamExample(){
        IntStream oneToFive = IntStream.range(1, 6);
        oneToFive.forEach(System.out::println);
    }

}
