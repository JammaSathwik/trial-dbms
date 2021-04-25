package com.JavaWebApplication.Model;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class MyDb {
	Connection con = null;
	public Connection getCon(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javawebapplication","root","root");
		}
		catch(ClassNotFoundException | SQLException e){
			e.printStackTrace();
		}
		return con;
	}
	public Connection getConn(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javawebapplication?autoReconnect=true&useSSL=false");
		}
		catch(ClassNotFoundException | SQLException e){
			e.printStackTrace();
		}
		return con;
	}
}
