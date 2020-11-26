package com.java.nine.training.features.stream;

import java.util.Comparator;
import java.util.List;
import java.util.logging.Logger;

import com.java.nine.training.features.interfaces.Java8Interface;

public class DropWhileExample {

    private static final Logger LOGGER = Logger.getLogger(DropWhileExample.class.getName());

    public static void main(String[] args) {
        List<Integer> numbers = List.of(2, 4, 6, 8, 9, 10, 11, 12);
        LOGGER.info("Printing all even numbers");
        numbers.stream()
                .filter(number -> number % 2 == 0)
                .map(String::valueOf)
                .forEach(LOGGER::info);

        LOGGER.info("Printing the numbers left after the first odd number found");
        numbers.stream()
                .dropWhile(number -> number % 2 == 0)
                .map(String::valueOf)
                .forEach(LOGGER::info);

        LOGGER.info("Sorting elements in reverse order and printing the numbers left after the first odd number found");
        numbers.stream()
                .sorted(Comparator.reverseOrder())
                .dropWhile(number -> number % 2 == 0)
                .map(String::valueOf)
                .forEach(LOGGER::info);
    }
}
