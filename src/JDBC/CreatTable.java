package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreatTable{
public static void main(String[] args)  throws ClassNotFoundException,SQLException {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","Mahesh123#");
	Statement st=cn.createStatement();
	st.execute("create table student(id int,name varchar(30),age int)");
	System.out.println("table created Successfully");
}
}
