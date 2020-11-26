package com.java.nine.training.features.resource;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TryCatchInJava9 {

    private static final Logger LOGGER = Logger.getLogger(TryCatchInJava9.class.getName());

    public static void main(String[] args) throws FileNotFoundException {
        final Scanner scanner = new Scanner(new File("README.md"));

        try (scanner) {
            String line = scanner.nextLine();
            LOGGER.log(Level.INFO, "Try block read line {0}", line);
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, "Exception thrown", e);
        }
    }
}
