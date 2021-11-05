package main.java;

import javax.swing.*;
import java.sql.Connection;

public class Main {
    public static void main (String[] args) {
        System.out.println("Starting mWhip...");
        Connection conn = DBConnection.getINSTANCE();

        JFrame frame = new JFrame("My First GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        JButton button = new JButton("Press");
        frame.getContentPane().add(button); // Adds Button to content pane of frame
        frame.setVisible(true);

    }
}