package com.java.nine.training.features.interfaces;

import java.util.logging.Logger;

public interface Java9Interface {

    Logger LOGGER = Logger.getLogger(Java9Interface.class.getName());

    void sayHi(String name);

    int X = 0;

    default void multiply(int a, int b) {
        String message = "Output: " + transformEvenToOddNumber(a * b);
        LOGGER.info(filterString(message));
    }

    private int transformEvenToOddNumber(int a) {
        return a % 2 == 0 ? transformEvenToOddNumber(a + 1) : a;
    }

    static void greeting(String name) {
        LOGGER.info("Welcome " + filterString(name));
    }

    private static String filterString(String target) {
        return target.replace("\\.", "");
    }
}
