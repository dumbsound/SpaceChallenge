package com.project.dao;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;

	public abstract class DatabaseConnection {
	private static final String DRIVERNAME="com.mysql.jdbc.Driver";
	private static final String URL="jdbc:mysql://localhost:3306/contactdb";
	private static final String USERNAME="root";
	private static final String PASSWORD="1404";
	protected static Connection con=null;

	public DatabaseConnection(){
		try {
			Class.forName(DRIVERNAME);
			System.out.println("DRIVER CLASS FOUND");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	protected void getConnection(){
		try {
			con=DriverManager.getConnection(URL,USERNAME,PASSWORD);
			System.out.println("Connection Established");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}	
	protected void closeConnection(){
		 try {
			con.close();
			System.out.println("Connection to DB closed");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	 }
	}


