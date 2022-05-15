package feach3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ThirdvideoForFeatch {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.jdbc.Driver");
	     String url="jdbc:mysql://localhost:3306/company";
	     String username="root";
	     String password="root";
	     String query= "select * from student"; 
	     Connection con=DriverManager.getConnection(url,username,password);
	     Statement st = con.createStatement();
	     ResultSet rs=st.executeQuery(query);
	     String userData=" ";
	     rs.next();
	     userData =rs.getInt(1)+":"+rs.getString(2);
	     System.out.println(userData);
	     rs.next();
	     userData =rs.getInt(1)+":"+rs.getString(2);
	     System.out.println(userData);
	     st.close();
	     con.close();
	}

}
