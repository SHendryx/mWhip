package main.java;

import static main.java.DBConnCheck.connCheck;

public class Main {
    public static void main (String[] args) {
        System.out.println("Starting mWhip...");

        if (connCheck()){
            System.out.println("Connection to SQLite has been established.");
        }
    }
}