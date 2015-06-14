package com.sayem;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by syed.sayem on 6/13/15.
 */
public class StreamExample {


    @Test
    public void streamRange(){

    }

    @Test
    public void streamThree(){
        Stream.of("a1", "a2", "a3")
                .findFirst()
                .ifPresent(System.out::println);
    }

    @Test
    public void streamTwo(){

        Arrays.asList("a1", "a2", "a3")
                .stream()
                .findFirst()
                .ifPresent(System.out::println);

    }


    @Test
    public void streamOne(){
        List<String> myList = Arrays.asList("a1", "a2", "b3", "c4", "c4");

        myList.stream()
                .filter(s -> s.startsWith("c"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);
    }
}
