package com.sayem.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by syed.sayem on 6/15/15.
 */
public class Java8Map {

    @SuppressWarnings("Convert2MethodRef")
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("java");
        list.add("php");
        list.add("python");

        Stream<Integer> stream = list.stream()
                .map(p -> p.length());
        Integer[] lengthArr = stream.toArray(Integer[]::new);

        for (Integer a : lengthArr) {
            System.out.println(a);
        }
    }
}
