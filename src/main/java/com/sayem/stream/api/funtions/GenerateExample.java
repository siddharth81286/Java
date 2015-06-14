package com.sayem.stream.api.funtions;

import org.testng.annotations.Test;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by syed.sayem on 6/14/15.
 */
public class GenerateExample {

    @Test
    public void generate(){
        Stream.generate(Math::random)
                .limit(5)
                .forEach(System.out::println);
    }

    @Test
    public void infiniteStream(){
        IntStream.generate(() -> 1)
                .limit(5)
                .forEach(System.out::println);
    }

}
