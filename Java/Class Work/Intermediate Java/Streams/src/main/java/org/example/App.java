package org.example;

import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(-12, -23, -99, -67, -2);
        list.stream()
                .map(i -> i * -1)
                .forEach(i -> System.out.println(i));
    }
}
