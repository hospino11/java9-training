package com.java.nine.module;

import com.java.nine.training.service.WelcomeService;

public class UserApplication {
    public static void main(String[] args) {
        WelcomeService welcomeService = new WelcomeService();
        String name = String.join(", ", args);
        welcomeService.greeting(name.isBlank() ? "Hansel" : name);
    }
}
