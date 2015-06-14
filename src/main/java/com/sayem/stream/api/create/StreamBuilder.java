package com.sayem.stream.api.create;

import org.testng.annotations.Test;

import java.util.stream.Stream;

/**
 * Created by syed.sayem on 6/14/15.
 */
public class StreamBuilder {

    @Test
    public void streamBuilderExample(){
        Stream<String> stream = Stream.<String>builder()
                .add("XML")
                .add("Java")
                .add("CSS")
                .add("SQL")
                .build();
        stream.forEach(System.out::println);
    }
}
