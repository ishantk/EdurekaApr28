package co.edureka.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.edureka.model.Student;

@WebServlet({ "/AddStudent", "/Add" })
public class AddStudent extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Student student = new Student();
		student.roll = Integer.parseInt(request.getParameter("txtRoll"));
		student.name = request.getParameter("txtName");
		student.age = Integer.parseInt(request.getParameter("txtAge"));
		student.address = request.getParameter("txtAddress");
		
		// User Hibernate/JDBC/Spring and add the Student in DB
		
	}

}
