package co.edureka.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import co.edureka.model.Student;

public class JDBCClient {

	public static void main(String[] args) {
		
		Student sRef = new Student(0,"George","george@example.com",28,"Country Homes");
		
		try {
			
			// Load the Driver
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("--Driver Loaded--");
			
			// Create Connection
			String user = "root";
			String password = "";
			String url = "jdbc:mysql://localhost/edureka"; 
			
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("--Connection Created--");
			
			// Write and Execute SQL Statement
			String sql = "insert into Student values(null,'"+sRef.name+"','"+sRef.email+"',"+sRef.age+",'"+sRef.address+"')";
			
			Statement stmt = con.createStatement();
			int i = stmt.executeUpdate(sql);
			System.out.println("Row(s) inserted: "+i);
			
			// Close the Connection
			stmt.close();
			con.close();
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
		
		

	}

}
