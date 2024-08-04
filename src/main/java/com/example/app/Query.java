package com.example.app;

import com.example.app.GetConnection;
import com.sun.jdi.connect.spi.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Query  {
    private GetConnection cursor;

    public Query(GetConnection connection){
        this.cursor = connection;
    }

    public Query(){

    }

    public void newUserRegistration(){
        //validation should be added:)
        String query = "Insert into users Values('password','user','login');";
        try {
            Statement data = cursor.connect().createStatement();
            data.execute(query);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
