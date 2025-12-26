package com.github.driss2003costa.sunlauncher;

import javafx.application.Application;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        try {
            Class.forName("javafx.application.Application");
            Application.launch(Launcher.class, args);
        }
        catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(
                    null,
                    "Error" + e.getMessage()+ "not found", "erreur", JOptionPane.ERROR_MESSAGE
            );

        }
    }
}
