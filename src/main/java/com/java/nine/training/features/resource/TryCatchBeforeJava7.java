package com.java.nine.training.features.resource;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TryCatchBeforeJava7 {

    private static final Logger LOGGER = Logger.getLogger(TryCatchBeforeJava7.class.getName());

    public static void main(String[] args) {
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader("test.xml"));
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, "Exception thrown", e);
        } finally {
            try {
                if (Objects.nonNull(bufferedReader)) {
                    bufferedReader.close();
                }
            } catch (IOException e) {
                LOGGER.log(Level.SEVERE, "Exception thrown while closing resource", e);
            }
        }
    }
}
