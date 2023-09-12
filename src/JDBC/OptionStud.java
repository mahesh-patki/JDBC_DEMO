package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
public class OptionStud {
	public static void main(String[] args) throws SQLException {
		Scanner sc=new Scanner(System.in);
		System.out.println("The id name :");
		int id=sc.nextInt();
		System.out.println("enter name :");
		String name=sc.nextLine();
		System.out.println("enter  roll number");
		int roll=sc.nextInt();
		Connection c1=Helper.getc();
		PreparedStatement pr=c1.prepareStatement("insert into studentdriver(id,name,roll) value(?,?,?)");
		
		
		
		

		
	}

}
