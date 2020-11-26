package com.java.nine.training.features.interfaces;

import com.java.nine.training.features.interfaces.impl.PartialImplementation;

public class TestInterfaceExample {

    public static void main(String[] args) {
        Java9Interface interfaceImplementation = new PartialImplementation();
        interfaceImplementation.sayHi("Hansel");
        interfaceImplementation.multiply(5, 10);
        Java9Interface.greeting("Hansel");
    }
}
