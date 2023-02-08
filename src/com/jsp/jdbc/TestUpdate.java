package com.jsp.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestUpdate {
public static void main(String[] args) throws SQLException {
	String url="jdbc:mysql://localhost:3306/javabatch";
	String username="root";
	String password="root";
	Connection connection=null;
	String sql="UPDATE STUDENT SET NAME='AKASH' WHERE ID=10";
	
	try {
	
		Class.forName("com.mysql.cj.jdbc.Driver");
	
		connection = DriverManager.getConnection(url, username, password);
		
		Statement statement =connection.createStatement();
		
		statement.executeUpdate(sql);
		
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
