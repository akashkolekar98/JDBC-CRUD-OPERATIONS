package com.jsp.jdbc;

import java.sql.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestSave {

	public static void main(String[] args) throws SQLException {
		
		String url="jdbc:mysql://localhost:3306/javabatch";
		String username="root";
		String password="root";
		Connection connection=null;
		String sql="INSERT INTO student VALUES(106,'xyz','xyz@mail.com')";
		try {
			//1.Load/Register the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//2.Establish the connection
			connection = DriverManager.getConnection(url, username, password);
			//Connection connection = DriverManager.getConnection(url, username, password);
			//3.Create statement
			Statement statement =connection.createStatement();
			//4.Execute statement
			statement.execute(sql);
			//5.close the connection
			//connection.close();
			System.out.println("All good");
		}
		catch(ClassNotFoundException e){
			e.printStackTrace();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			if(connection!=null) {
				connection.close();
				System.out.println("closed");
			}
		}
	}
}
