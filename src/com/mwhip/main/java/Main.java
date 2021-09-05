package com.mwhip.main.java;

import static com.mwhip.main.java.DBConnCheck.connCheck;

public class Main {
    public static void main (String[] args) {
        System.out.println("Starting mWhip...");

        if (connCheck()){
            System.out.println("Connection to SQLite has been established.");
        }
    }
}