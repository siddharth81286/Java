package org.sayem.java8.stream.api.collections;

import org.testng.annotations.Test;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

/**
 * Created by syed.sayem on 6/14/15.
 */
public class Example {

    @Test
    public void sequentialStream(){
        Set<String> name = new HashSet<>();
        name.add("XML");
        name.add("Java");

        Stream<String> sequentialStream = name.stream();
        sequentialStream.forEach(System.out::println);
    }

    @Test
    public void parallelStream(){
        Set<String> name = new HashSet<>();
        name.add("XML");
        name.add("Java");

        Stream<String> parallelStream = name.parallelStream();
        parallelStream.forEach(System.out::println);
    }
}
