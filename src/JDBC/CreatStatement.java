package JDBC;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public class CreatStatement 
{
 public static void main(String[] args)throws ClassNotFoundException,SQLException {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306","root","Mahesh123#");

	Statement st=con.createStatement();
	System.out.println("Statement is created sucessfully");
	System.out.println(st.getClass());
	
	st.execute("create database PEJM17");
	System.out.println("Database created Sucessfully");
}
}
