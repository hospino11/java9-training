package com.java.nine.training.features.stream;

import java.util.List;
import java.util.logging.Logger;

public class TakeWhileExample {

    private static final Logger LOGGER = Logger.getLogger(TakeWhileExample.class.getName());

    public static void main(String[] args) {
        List<Integer> numbers = List.of(2, 4, 6, 8, 9, 10, 11, 12);
        LOGGER.info("Printing all even numbers");
        numbers.stream()
                .filter(number -> number % 2 == 0)
                .map(String::valueOf)
                .forEach(LOGGER::info);

        LOGGER.info("Printing first even numbers found");
        numbers.stream()
                .takeWhile(number -> number % 2 == 0)
                .map(String::valueOf)
                .forEach(LOGGER::info);
    }
}
