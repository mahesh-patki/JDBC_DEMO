package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FetchData {
 public static void main(String[] args) throws SQLException 
 {
	 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","Mahesh123#");
	 Statement st=con.createStatement();
	ResultSet rs= st.executeQuery("select * from student where id=2");
	 System.out.println("successfully we get an result set");
	 System.out.println(rs);
	System.out.println(rs.next());
	System.out.println(rs.getString(2));
}
}
