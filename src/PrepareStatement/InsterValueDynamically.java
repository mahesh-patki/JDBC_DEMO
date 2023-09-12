package PrepareStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InsterValueDynamically {
public static void main(String[] args) throws SQLException{
	 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","Mahesh123#");
	 Statement st=con.createStatement();
	 PreparedStatement  pe=con.prepareStatement("select * from Student ");  
	    ResultSet rs=pe.executeQuery();
	   while (rs.next()) {
	    	System.out.println("id "+rs.getInt(1));
	    	System.out.println("Name "+rs.getString(2));
	    	System.out.println("age "+rs.getInt(3));    	
	    }
}
}
