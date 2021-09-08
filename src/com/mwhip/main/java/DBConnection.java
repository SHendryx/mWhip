package main.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class DBConnection {

    private static Connection CONN = null;
    static
    {
        // db parameters
        String url = "jdbc:sqlite:media.sqlite";
        try {
            // create a connection to the database
            CONN = DriverManager.getConnection(url);

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static Connection getINSTANCE() {
        return CONN;
    }

    public void closeDB(){
        try {
            if (CONN != null) {
                // Close connection.
                CONN.close();
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
