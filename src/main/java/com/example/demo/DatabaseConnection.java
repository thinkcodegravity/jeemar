package com.example.demo;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
	public static Connection getDBConnection( ) throws Exception
	{
		Connection conn =null;
		try{
		Class.forName("com.mysql.jdbc.Driver");
		// connection string
	    conn = DriverManager.getConnection
	    		("jdbc:mysql://localhost:3306/training","root","root"); 
		  return conn;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			throw e;
		}
	}
}
