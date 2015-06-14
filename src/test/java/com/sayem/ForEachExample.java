package com.sayem;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by syed.sayem on 6/13/15.
 */
public class ForEachExample {

    @Test
    public void forEachOne(){
        List<String> str = new ArrayList<>();
        str.add("hello");
        str.forEach(System.out::println);
    }
}
