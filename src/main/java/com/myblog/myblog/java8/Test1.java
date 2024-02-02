package com.myblog.myblog.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test1 {

    //Filter Strings Containing a Specific Substring:
    public static void main(String[] args) {

        List<String> name = Arrays.asList("mike", "adam", "stallin", "sam");
        List<String> result = name.stream().filter(s -> s.contains("ke")).collect(Collectors.toList());
        System.out.println(result);
    }
}
