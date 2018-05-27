package co.edureka.db;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import co.edureka.model.User;


public class JDBCHelper {
	
	Connection con;
	
	Statement stmt;
	PreparedStatement pStmt;
	
	CallableStatement cStmt;
	
	//1. Load the Driver
	public JDBCHelper() {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("--Driver Loaded--");
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
		
	}
	
	// 2. Create Connection
	public void createConnection(){
		
		try {
		
			String user = "root";
			String password = "";
			String url = "jdbc:mysql://localhost/edureka"; 
			
			con = DriverManager.getConnection(url, user, password);
			System.out.println("--Connection Created--");			
			
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
	}
	
	//3. Write and Execute SQL Statement
	public int registerUser(User user){
		
		int i = 0;
		
		try {
			
			String sql = "insert into User values(null,?,?,?)";
			
			pStmt = con.prepareStatement(sql);
			pStmt.setString(1, user.name);
			pStmt.setString(2, user.email);
			pStmt.setString(3, user.password);
			
			i = pStmt.executeUpdate();
			System.out.println("Student inserted: "+i);		
			
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
		
		return i;
	}
	
	public boolean authenticateUser(User user){
		
		boolean auth = true;
		
		try {
			
			String sql = "select * from User where email = ? and password = ?";
			
			pStmt = con.prepareStatement(sql);
			pStmt.setString(1, user.email);
			pStmt.setString(2, user.password);
			
			ResultSet rs = pStmt.executeQuery();
			
			auth = rs.next();
			System.out.println("Auth is: "+auth);
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
		
		return auth;
	}
	
	//4. Close the Connection
	public void closeConnection(){
		try {
			if(stmt!=null)
				stmt.close();
			
			if(con!=null)
				con.close();
			
			if(pStmt!=null)
				pStmt.close();
			
			System.out.println("--Connection Closed--");		
			
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
	}

}
