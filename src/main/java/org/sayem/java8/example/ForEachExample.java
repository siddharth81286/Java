package org.sayem.java8.example;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by syed.sayem on 6/13/15.
 */
public class ForEachExample {

    @Test
    public void filter(){
        List<String> str = new ArrayList<>();
        str.add("java");
        str.add("hava");
        str.add("sava");
        str.add("dava");

        str.parallelStream()
                .filter(s -> s.contains("java"))
                .forEach((s) -> {
                    System.out.println("Content: " + s);
                });
    }

    @Test
    public void range(){
        IntStream.range(1, 5)
                .forEach(System.out::println);
    }

    @Test
    public void iterate(){
        Stream.iterate(1, i -> i + 1)
                .limit(10)
                .forEach(System.out::println);
    }

    @Test
    public void forEachOne(){
        List<String> str = new ArrayList<>();
        str.add("hello");
        str.forEach(System.out::println);
    }

    @Test
    public void pattern(){
        Pattern pattrn = Pattern.compile(",");
        pattrn.splitAsStream("a,b,c,d")
                .forEach(System.out::println);
    }
}
