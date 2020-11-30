package com.java.nine.training.features.process;

import java.io.File;
import java.io.IOException;

public class ProcessBuilderCompileExample {

    public static void main(String[] args) throws IOException {
        String jdkPath = args.length > 0 ? args[0] : "C:\\Program Files\\Java\\jdk-11.0.7\\bin\\";
        String javacCommand = args.length > 1 ? args[1] : "javac.exe";
        String javaCommand = args.length > 2 ? args[2] : "java.exe";
        String classPath = "\"src" + File.separator + "main" + File.separator + "java\"";

        StringBuilder testClassPath = new StringBuilder();
        testClassPath.append("com").append(File.separator);
        testClassPath.append("java").append(File.separator).append("nine").append(File.separator);
        testClassPath.append("training").append(File.separator).append("features").append(File.separator);
        testClassPath.append("process").append(File.separator).append("FrameExample");

        String testClassPackage = testClassPath.toString().replace(File.separator.charAt(0), '.');

        new ProcessBuilder(jdkPath + javacCommand, "-cp", classPath, testClassPath.toString() + ".java").start();
        new ProcessBuilder(jdkPath + javaCommand, "-cp", classPath, testClassPackage).start();
    }
}
