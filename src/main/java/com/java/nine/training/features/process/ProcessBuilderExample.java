package com.java.nine.training.features.process;

import java.io.IOException;

public class ProcessBuilderExample {

    public static void main(String[] args) throws IOException {
        ProcessBuilder processBuilder = new ProcessBuilder("notepad", "README.md");
        processBuilder.start();
    }
}
