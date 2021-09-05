package com.mwhip.main.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnCheck {
    public static boolean connCheck() {
        Connection conn = null;
        boolean res = false;
        try {
            // db parameters
            String url = "jdbc:sqlite:media.sqlite";
            // create a connection to the database
            conn = DriverManager.getConnection(url);

            res = true;

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
                res = false;
            }
        }
        return res;
    }
}