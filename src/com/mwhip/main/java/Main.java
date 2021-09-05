package com.mwhip.main.java;

import static com.mwhip.main.java.DBConnCheck.connCheck;

public class Main {
    public static void main (String[] args) {
        System.out.println("Starting mWhip...");

        //Check connection to DB
        String connMsg = connCheck() ? "Connection to SQLite DB has been established." : "Connection to SQLite DB failed.";
        System.out.println(connMsg);
    }
}