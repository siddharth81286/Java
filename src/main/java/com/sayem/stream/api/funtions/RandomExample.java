package com.sayem.stream.api.funtions;

import org.testng.annotations.Test;

import java.util.Random;
import java.util.stream.Stream;

/**
 * Created by syed.sayem on 6/14/15.
 */
public class RandomExample {

    @Test
    public void firstExample(){
        new Random().ints()
                .limit(5)
                .forEach(System.out::println);
    }

    @Test
    public void secondExample(){
        Stream.generate(new Random()::nextInt)
                .limit(5)
                .forEach(System.out::println);
    }
}
