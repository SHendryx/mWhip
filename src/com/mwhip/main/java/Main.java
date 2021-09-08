package main.java;

import java.sql.Connection;

public class Main {
    public static void main (String[] args) {
        System.out.println("Starting mWhip...");
        Connection conn = DBConnection.getINSTANCE();

    }
}