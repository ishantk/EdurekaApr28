package co.edureka.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.edureka.db.JDBCHelper;
import co.edureka.model.User;


@WebServlet({ "/RegisterServlet", "/Register" })
public class RegisterServlet extends HttpServlet {

	public void init(ServletConfig config) throws ServletException {
		System.out.println("--RegisterServlet init--");
	}

	
	public void destroy() {
		System.out.println("--RegisterServlet destroy--");
	}

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("--RegisterServlet service--");
		
		String name = request.getParameter("txtName");
		String email = request.getParameter("txtEmail");
		String password = request.getParameter("txtPassword");
		
		System.out.println(name+" - "+email+" - "+password);
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		
		User user = new User(0, name, email, password);
		
		JDBCHelper helper = new JDBCHelper();
		helper.createConnection();
		int i = helper.registerUser(user);
		helper.closeConnection();
		
		// text response
		// out.print(name+" Registered Successfully !!");
		
		// html response (dynamic content generation)
		out.print("<html><body><center>");
		if(i>0){
			out.print("<h3>"+name+" Registered Successfully !!</h3>");
		}else{
			out.print("<h3>"+name+" Not Registered Successfully !!</h3>");
		}
		out.print("</center></body></html>");
	}

}
