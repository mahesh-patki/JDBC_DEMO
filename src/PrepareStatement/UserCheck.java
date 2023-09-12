package PrepareStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class UserCheck {
		 public static void main(String[] args) throws SQLException 
		 {   Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the name to check :");
		     String name=sc.next();
		    
			 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","Mahesh123#");
			 PreparedStatement  pe=con.prepareStatement("select * from Student where name=?");
			 
		    pe.setString(1,name);
		    
		    ResultSet rs=pe.executeQuery();
		   
		    if(rs.next()) {
		    	System.out.println("id "+rs.getInt(1));
		    	System.out.println("Name "+rs.getString(2));
		    	System.out.println("age "+rs.getInt(3));
		    	
		    }
		    else {
		    	System.out.println("user not found");
		    }
		    
		    
		    System.out.println("Enter the name for delete");
		    PreparedStatement d1=con.prepareStatement("Delete from Student where name=?");
		    String deleteName=sc.next();
		    d1.setString(1,name);
		    
		    boolean r1=d1.execute();
		    ResultSet rs1=pe.executeQuery();
		    if(rs1.next()) {
		    	
		    }
		    else {
		    	System.out.println("Data is delete Successfully ");
		    }
		    
		    
		    
		   
		}
}
