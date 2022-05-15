package com.featch;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Student {
	
	public static void main(String[] args)throws Exception{
		
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","root");
			String query="insert into student(id,name,address,city)values(?,?,?,?)";
			PreparedStatement pt=connection.prepareStatement(query);
			pt.setInt(1, 21);
			pt.setString(2, "Sadan");
			pt.setString(3,"Chu");
			pt.setString(4,"Bansi");
			int i=pt.executeUpdate();
			System.out.println(i);
		
		
	}

}
