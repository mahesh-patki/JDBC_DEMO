package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertValues {
public static void main(String[] args)throws SQLException  {
	Connection ch =DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","Mahesh123#");
	Statement st=ch.createStatement();
	st.execute("insert into student value(1,'Mahesh',10)");
	st.execute("insert into student value(2,'jay',15)");
	st.execute("insert into student value(3,'Abheshek',25)");
	st.execute("insert into student value(4,'om',5)");
	st.execute("insert into student value(6,'Sager',6)");
	System.out.println("value inserted sucsessfully");
	
}
}
