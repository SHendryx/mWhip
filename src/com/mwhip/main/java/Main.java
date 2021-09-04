package com.mwhip.main.java;

import static com.mwhip.main.java.DBConnector.connect;

public class Main {
    public static void main (String[] args) {
        System.out.println("Starting mWhip...");

        connect();
    }
}