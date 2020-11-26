package com.java.nine.training.features.interfaces.impl;

import java.util.logging.Level;

import com.java.nine.training.features.interfaces.Java9Interface;

public class PartialImplementation implements Java9Interface {
    @Override
    public void sayHi(String name) {
        LOGGER.log(Level.INFO, "Hi {0}", name);
    }

    @Override
    public void multiply(int a, int b) {
        LOGGER.log(Level.INFO,"Multiplying {0} and {1}: {2}.", new Object[]{a, b, a * b});
    }
}
