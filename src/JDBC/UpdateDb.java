package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateDb {
 public static void main(String[] args) throws SQLException {
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","Mahesh123#");
	Statement st=con.createStatement();
	
	st.execute(" update student set name='Kalpesh' where id=2");
	System.out.println("data update sucessfully");
	st.execute("delete from student where id=1");
	System.out.println("data delete Sucessfully");
}
}