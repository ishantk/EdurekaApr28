package co.edureka.db;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import co.edureka.model.Student;

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
	public void insertStudent(Student sRef){
		
		try {
			
			String sql = "insert into Student values(null,'"+sRef.name+"','"+sRef.email+"',"+sRef.age+",'"+sRef.address+"')";
			
			stmt = con.createStatement();
			int i = stmt.executeUpdate(sql);
			System.out.println("Student inserted: "+i);		
			
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
		
	}
	
	//3. Write and Execute SQL Statement
	public void updateStudent(Student sRef){
		
		try {
			
			// Statement API
			/*String sql = "update Student set name = '"+sRef.name+"', email = '"+sRef.email+"', age = "+sRef.age+", address = '"+sRef.address+"' where roll = "+sRef.roll;
			
			stmt = con.createStatement();
			int i = stmt.executeUpdate(sql);
			System.out.println("Student Updated: "+i);*/
			
			//PreparedStatement API
			String sql = "update Student set name = ?, email = ?, age = ?, address = ? where roll = ?";
			pStmt = con.prepareStatement(sql);
			
			pStmt.setString(1, sRef.name);
			pStmt.setString(2, sRef.email);
			pStmt.setInt(3, sRef.age);
			pStmt.setString(4, sRef.address);
			pStmt.setInt(5, sRef.roll);
			
			int i = pStmt.executeUpdate();
			
			System.out.println("Student Updated: "+i);
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
		
	}	
	
	
	//3. Write and Execute SQL Statement
	public void deleteStudent(int roll){
		
		try {

			//PreparedStatement API
			String sql = "delete from Student where roll = ?";
			pStmt = con.prepareStatement(sql);

			pStmt.setInt(1, roll);
			
			int i = pStmt.executeUpdate();
			
			System.out.println("Student Deleted: "+i);
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
	}
	
	public ArrayList<Student> retrieveStudents(){
		
		ArrayList<Student> studentList = new ArrayList<Student>();
		
		try {
			
			String sql = "select * from Student";
			pStmt = con.prepareStatement(sql);
			
			ResultSet rs = pStmt.executeQuery();
			
			String nm="",em="",ad="";
			int r=0,a=0;
			while(rs.next()){
				r = rs.getInt(1); //r = rs.getInt("roll");
				nm = rs.getString(2);
				em = rs.getString(3);
				a = rs.getInt(4);
				ad = rs.getString(5);
				
				//System.out.println(r+"\t"+nm+"\t"+em+"\t"+a+"\t"+ad);
				//System.out.println("--------------------------------------------------------------------");
				
				Student s = new Student(r,nm,em,a,ad);
				studentList.add(s);
			}
			
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		} 
		
		return studentList;
	}
	
	public void executeProcedure(Student sRef){
		
		try {
			
			String sql = "{ call addStudent(?,?,?,?) }";
			cStmt = con.prepareCall(sql);
			
			cStmt.setString(1, sRef.name);
			cStmt.setString(2, sRef.email);
			cStmt.setInt(3, sRef.age);
			cStmt.setString(4, sRef.address);
			
			cStmt.execute();
			
			System.out.println("--Procedure Executed--");
			
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
		
	}
	
	public void processBatch(){
		
		try {
			
			String sql1 = "update Student set name = 'Mike Watson' where roll = 6";
			String sql2 = "delete from SomeStudent where roll = 8";
			//..
			//..
			
			con.setAutoCommit(false); // Developer will handle commit and rollback (transaction management)
			
			stmt = con.createStatement();
			stmt.addBatch(sql1);
			stmt.addBatch(sql2);
			
			stmt.executeBatch();
			
			con.commit(); // Execute Statement over the connection as a transaction
			
			System.out.println("--Batch Processed--");
			
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
			
			try {
				con.rollback();
				System.out.println("--DB Changes RollBacked--");
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			
		}
		
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
