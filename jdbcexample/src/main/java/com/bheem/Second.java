package com.bheem;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Second {
         

		public static void main(String[] args)throws Exception 
	{
			Class.forName("com.mysql.jdbc.Driver");
			//creating connection
			String url="jdbc:mysql://localhost:3306/company";
			String username="root";
			String password="root";
			String name= "Sadan";
			int emp_id=108;
			String addr="Chieutahan";
			String city="Up";
			String phoneno="678543679";
            String query= "insert into employee values(?,?,?,?,?)"; 
			Connection con = DriverManager.getConnection(url,username,password);
			//create a query
			PreparedStatement st= con.prepareStatement(query);
			st.setInt(1,emp_id);
			st.setString(2,name);
			st.setString(3,city);
		    st.setString(4,addr);
			st.setString(5,phoneno);
			int count =st.executeUpdate();
		    System.out.println(count +"row/s affected");
				
			st.close();
			con.close();
      }   		}
	


