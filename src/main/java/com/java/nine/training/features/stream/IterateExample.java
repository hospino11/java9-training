package com.java.nine.training.features.stream;

import java.util.logging.Logger;
import java.util.stream.Stream;

public class IterateExample {

    private static final Logger LOGGER = Logger.getLogger(IterateExample.class.getName());

    public static void main(String[] args) {
        LOGGER.info("Printing 10 numbers");

        Stream.iterate(0, x -> x + 1)
                .limit(10)
                .map(String::valueOf)
                .forEach(LOGGER::info);

        LOGGER.info("Printing first numbers that are not multiple of 5 from 1");

        Stream.iterate(1, x -> x % 5 != 0, x -> x + 1)
                .map(String::valueOf)
                .forEach(LOGGER::info);
    }
}
