package com.java.nine.training.features.interfaces.impl;

import com.java.nine.training.features.interfaces.Java9Interface;

public class PartialImplementation implements Java9Interface {
    @Override
    public void sayHi(String name) {
        LOGGER.info("Hi " + name);
    }

    @Override
    public void multiply(int a, int b) {
        LOGGER.info("Multiplying " + a + " and " + b + ": " + a * b + ".");
    }
}
