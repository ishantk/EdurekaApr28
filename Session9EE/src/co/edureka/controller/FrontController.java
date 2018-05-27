package co.edureka.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/FrontController")
public class FrontController extends HttpServlet {
	
	// Validate the Credentials
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String email = request.getParameter("txtEmail");
		String password = request.getParameter("txtPassword");
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		// If email and password is not filled up by the user
		if(!email.isEmpty() && !password.isEmpty()){
			
			out.print("User is Validated Successfully !!"); // response will not be seen
			
			// Forward Request and Response to the LoginServlet
			RequestDispatcher dispatcher = request.getRequestDispatcher("Login"); // response from Login Servlet will be seen
			dispatcher.forward(request, response);
			
		}else{
			
			out.print("User Validation Filled !! Please Re-Enter Details");
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("existinguser.html");
			dispatcher.include(request, response);
			
		}
		
		
	}

}
