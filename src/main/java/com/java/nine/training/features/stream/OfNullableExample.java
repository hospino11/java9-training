package com.java.nine.training.features.stream;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OfNullableExample {

    private static final Logger LOGGER = Logger.getLogger(OfNullableExample.class.getName());

    public static void main(String[] args) {
        Map<Integer, String> properties = new HashMap<>();
        properties.put(1, "One");
        properties.put(2, "Two");
        properties.put(4, "Four");
        properties.put(6, "Six");
        properties.put(8, "Eight");

        List<Integer> numbers = Stream.iterate(1, x -> x < 9, x -> x + 1)
                .collect(Collectors.toList());

        LOGGER.info("Printing all values");
        numbers.stream()
                .flatMap(number -> Stream.of(properties.get(number)))
                .forEach(LOGGER::info);

        LOGGER.info("Printing values found");
        numbers.stream()
                .flatMap(number -> Stream.ofNullable(properties.get(number)))
                .forEach(LOGGER::info);
    }
}
