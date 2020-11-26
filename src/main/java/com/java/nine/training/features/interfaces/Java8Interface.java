package com.java.nine.training.features.interfaces;

import java.util.logging.Logger;

public interface Java8Interface {

    Logger LOGGER = Logger.getLogger(Java8Interface.class.getName());

    void sayHi(String name);

    int X = 0;

    default void multiply(int a, int b) {
        LOGGER.info("Output: " + a * b);
    }

    static void greeting(String name) {
        LOGGER.info("Welcome " + name);
    }
}
