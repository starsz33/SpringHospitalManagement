package org.Spring.Hospital.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String url = "jdbc:postgresql://localhost:5432/HospitalManagement";
    private static final String userName = "postgres";
    private static final String password = "   ";

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, userName, password);
    }
}
