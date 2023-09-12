package JDBC;

public class LoadAndRegisterDriver
{
public static void main(String[] args) throws ClassNotFoundException {
	Class.forName("com.mysql.cj.jdbc.Driver");
	System.out.println("Driver is sucessfully Register");
}
}
