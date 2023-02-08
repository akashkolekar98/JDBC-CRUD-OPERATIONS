package com.jsp.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class TestGetAll {
	public static void main(String[] args) throws SQLException {
		String url="jdbc:mysql://localhost:3306/javabatch";
		String username="root";
		String password="root";
		Connection connection=null;
		String sql="SELECT * FROM STUDENT";
		
		try {
		
			Class.forName("com.mysql.cj.jdbc.Driver");
		
			connection = DriverManager.getConnection(url, username, password);
			
			Statement statement =connection.createStatement();
			
			ResultSet resultSet= statement.executeQuery(sql); 
			while(resultSet.next()) {
				System.out.println(resultSet.getInt(1));
				System.out.println(resultSet.getString(2));
				System.out.println(resultSet.getString(3));
	            System.out.println("===============================================");
				
			}
			
			//System.out.println("All good");
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
