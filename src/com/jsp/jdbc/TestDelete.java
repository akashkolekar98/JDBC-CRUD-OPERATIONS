package com.jsp.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestDelete {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		String url="jdbc:mysql://localhost:3306/javabatch";
		String username="root";
		String password="root";
		Connection connection=null;
		String sql="DELETE FROM STUDENT WHERE ID=100";
		
		try {
			//1.Load/Register the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//2.Establish the connection
			connection = DriverManager.getConnection(url, username, password);
			//Connection connection = DriverManager.getConnection(url, username, password);
			//3.Create statement
			Statement statement =connection.createStatement();
			//4.Execute statement
			statement.executeUpdate(sql);
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
