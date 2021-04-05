package com.simplilearn.dao;
import java.sql.Connection;
import java.sql.DriverManager; 
import java.sql.SQLException;
  
// This class can be used to initialize the database connection 
public class DatabaseConnection { 
    public static Connection initializeDatabase()
        throws SQLException, ClassNotFoundException 
    { 
        // Initialize all the information regarding 
        // Database Connection 
        String dbDriver = "com.mysql.jdbc.Driver";
        Class.forName(dbDriver);
        String dbURL = "jdbc:mysql://localhost:3306/simpli"; 
        // Database name to access 
        String dbUsername = "root"; 
        String dbPassword = "root";
  
        Connection con = DriverManager.getConnection(dbURL, 
                                                     dbUsername,  
                                                     dbPassword); 
        return con; 
    } 
} 