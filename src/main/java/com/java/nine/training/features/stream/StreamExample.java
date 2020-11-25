package com.java.nine.training.features.stream;

import java.util.List;
import java.util.logging.Logger;

public class StreamExample {

    private static final Logger LOGGER = Logger.getLogger(StreamExample.class.getName());

    public static void main(String[] args) {
        List<String> names = List.of("Paul", "Sam", "Nancy");

        names.stream()
                .filter(s -> s.length() > 3)
                .forEach(LOGGER::info);

        LOGGER.info("Printing names to uppercase");

        names.stream()
                .map(String::toUpperCase)
                .forEach(LOGGER::info);

        LOGGER.info("Printing the first names with length older than 3 characters.");

        names.stream()
                .takeWhile(s -> s.length() > 3)
                .forEach(LOGGER::info);
    }
}
