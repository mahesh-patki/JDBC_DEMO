package PrepareStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Helper {
public static  Connection getc() throws SQLException {
	Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","Mahesh123#");
	return cn;
}
}
