package com.java.nine.training.features.diamond;

import java.util.logging.Level;
import java.util.logging.Logger;

public class DiamondOperatorInJava9 {

    private static final Logger LOGGER = Logger.getLogger(DiamondOperatorInJava9.class.getName());

    public static void main(String[] args) {
        TestClass<String> stringTestClass = new TestClass<>("Nancy") {
            @Override
            void overrideMe() {
                LOGGER.log(Level.INFO, "Method overridden");
            }
        };
        stringTestClass.overrideMe();
    }
}

class TestClass<T> {

    private static final Logger LOGGER = Logger.getLogger(TestClass.class.getName());

    T t;

    public TestClass(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    void overrideMe() {
        LOGGER.log(Level.INFO, "Processing data...");
    }
}
