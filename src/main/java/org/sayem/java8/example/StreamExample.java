package org.sayem.java8.example;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by syed.sayem on 6/13/15.
 */
public class StreamExample {



    @Test
    public void mapToLongMapToDouble(){
        Stream.of("a1", "a2", "a3")
                .map(s -> s.substring(1))
                .mapToInt(Integer::parseInt)
                .max()
                .ifPresent(System.out::println);
    }

    @Test
    public void streamInt(){
        Arrays.stream(new int[] {1, 2, 3})
                .map(n -> 2 * n + 1)
                .average()
                .ifPresent(System.out::println);
    }

    @Test
    public void streamRange(){

        IntStream.range(1, 4)
                .forEach(System.out::println);
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
