package com.example.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class GetConnection {
    String url = "jdbc:sqlserver://KOMPUTER;encrypt=false;database=Users;integratedSecurity=true;";

    public Connection connect() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


        return connection;
    }


}
