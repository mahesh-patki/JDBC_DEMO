package PrepareStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class OperationOption  {
	public static void main(String[] args) throws SQLException {
		//options adduser,view user by id, view all user,delete user
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","Mahesh123#");
       while(true) {
		Scanner sc=new Scanner(System.in);
       System.out.println("Enter the option "
       		+ "1. Add user"
       		+ "2. view user by id "
       		+ "3. view all"
       		+ "4. Delete user"
       		+ "5. Exit Option ");
       int op=sc.nextInt();
       switch(op) {
       case 1:{
    	   System.out.println("Enter the user employee name ");
    	   String name=sc.next();
    	   System.out.println("Enter the employee ID");
    	   int id=sc.nextInt();
    	   System.out.println("Enter the DOB ");
    	   String dob=sc.next();
    	   PreparedStatement ps=con.prepareStatement("insert into employee value(?,?,?)");
    	   ps.setInt(1,id);
    	   ps.setString(2, name);
    	   ps.setString(3, dob);
    	   ps.execute();
    	   System.out.println("data incerted successfully");
    	   break;
       }
       case 2:{
    	   System.out.println("Enetr the id to search ");
    	   int id=sc.nextInt();
    	   PreparedStatement v=con.prepareStatement("Select * from employee where id=? ");
    	   v.setInt(1,id);
    	   ResultSet rs= v.executeQuery();
    	   if(rs.next()) {
    		   System.out.println("id "+rs.getInt(1));
		    	System.out.println("Name "+rs.getString(2));
		    	System.out.println("dob "+rs.getString(3));
		    	break;
    	   }
    	   else {
    		   System.out.println("user is not found");
    	   }
    	  break;
       }
       case 3:{
    	   PreparedStatement  pe=con.prepareStatement("select * from Student ");  
   	    ResultSet rs=pe.executeQuery();
   	   while (rs.next()) {
   	    	System.out.println("id "+rs.getInt(1));
   	    	System.out.println("Name "+rs.getString(2));
   	    	System.out.println("dob "+rs.getString(3));    	
   	    	
   	    }
     	break;
       }
       case 4:{
    	   System.out.println("Enter the id to delete :");
    	   int id=sc.nextInt();
    	   PreparedStatement v=con.prepareStatement("Select * from employee where id=? ");
    	   v.setInt(1,id);
    	   ResultSet rs= v.executeQuery();
    	   if(rs.next()) {
    	   PreparedStatement  pe=con.prepareStatement("delete from employee where id=? ");
    	   pe.setInt(1,id);
    	   pe.execute();
    	   System.out.println("Data deleted successfully");
    	   }
    	   else {
    		   System.out.println("The user is not Present");
    	   }
    	   break;
       }
       case 5:{
    	   System.out.println(" Exit from option Successfully ");
    	   return;
       }
       }
       
	
	
	}

	
}
}
