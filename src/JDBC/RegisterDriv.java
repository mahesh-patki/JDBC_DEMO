package JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class RegisterDriv {
	public static void main(String[] args) throws ClassNotFoundException ,SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Sucessfully done");
		
	Connection con=	DriverManager.getConnection("jdbc:mysql://localhost:3306","root","Mahesh123#");
	}

}


