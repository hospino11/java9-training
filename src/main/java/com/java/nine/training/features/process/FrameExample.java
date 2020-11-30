package com.java.nine.training.features.process;

import java.awt.Frame;
import java.awt.Label;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameExample {

    public static void main(String[] args) {
        Frame frame = new Frame();
        frame.add(new Label("Welcome to Process API!"));
        frame.setSize(400, 400);
        frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                frame.dispose();
            }
        });
    }
}
