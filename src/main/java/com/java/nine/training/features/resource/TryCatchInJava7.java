package com.java.nine.training.features.resource;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TryCatchInJava7 {

    private static final Logger LOGGER = Logger.getLogger(TryCatchInJava7.class.getName());

    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("README.md"));
             BufferedReader bufferedReaderSecond = new BufferedReader(new FileReader(".gitignore"))) {
            String line = bufferedReader.readLine();
            LOGGER.log(Level.INFO, "Try block read line {0}", line);
            LOGGER.log(Level.INFO, ".gitignore lines found {0}: ", bufferedReaderSecond.lines().count());
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, "Exception thrown", e);
        }
    }
}
