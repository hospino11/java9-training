package com.java.nine.training.features.process;

import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProcessHandleExample {

    private static final Logger LOGGER = Logger.getLogger(ProcessHandleExample.class.getName());

    public static void main(String[] args) {
        ProcessHandle handle = ProcessHandle.current();
        LOGGER.log(Level.INFO, "PID: {0}", handle);

        long notepadPID = Arrays.stream(args)
                .findFirst()
                .map(Long::parseLong)
                .orElse(6204L);

        // User owner of this process
        ProcessHandle.of(notepadPID)
                .map(ProcessHandle::info)
                .flatMap(ProcessHandle.Info::user)
                .ifPresentOrElse(user -> LOGGER.log(Level.INFO, "Notepad User Process Info: {0}", user), () -> LOGGER.log(Level.INFO, "Process not found."));

        // Execution command for this process
        ProcessHandle.of(notepadPID)
                .map(ProcessHandle::info)
                .flatMap(ProcessHandle.Info::command)
                .ifPresentOrElse(command -> LOGGER.log(Level.INFO, "Notepad Command Process Info: {0}", command), () -> LOGGER.log(Level.INFO, "Process not found."));

        // Instant of the process started
        ProcessHandle.of(notepadPID)
                .map(ProcessHandle::info)
                .flatMap(ProcessHandle.Info::startInstant)
                .ifPresentOrElse(startInstant -> LOGGER.log(Level.INFO, "Notepad StartInstant Process Info: {0}", startInstant), () -> LOGGER.log(Level.INFO, "Process not found."));

        // Instant of the process started
        ProcessHandle.of(notepadPID)
                .map(ProcessHandle::info)
                .flatMap(ProcessHandle.Info::totalCpuDuration)
                .ifPresentOrElse(totalCpuDuration -> LOGGER.log(Level.INFO, "Notepad TotalCPUDuration (in seconds) Process Info: {0}", totalCpuDuration.get(ChronoUnit.SECONDS)), () -> LOGGER.log(Level.INFO, "Process not found."));
    }
}
