package com.sayem.stream.api.funtions;

import java.util.stream.Stream;

/**
 * Created by syed.sayem on 6/14/15.
 */
public class IterateExample {

    public static void main(String[] args) {

        Stream<Integer> limit = Stream
                .iterate(0, n -> n + 1)
                .limit(10);

        limit.forEach(System.out::println);

    }
}
