package org.sayem.java8.stream.api.create;

import org.testng.annotations.Test;

import java.util.stream.Stream;

/**
 * Created by syed.sayem on 6/14/15.
 */
public class Example {


    @Test
    public void firstExample(){
        Stream<String> stringStream = Stream.of("java");
        stringStream.forEach(System.out::println);
    }

    @Test
    public void secondExample(){
        String [] name = {"XML", "Java", "SQL", "CSS"};
        Stream<String> stream = Stream.of(name);
        stream.forEach(System.out::println);
    }
}
