package co.edureka.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import co.edureka.db.JDBCHelper;
import co.edureka.model.User;

@WebServlet({ "/LoginServlet", "/Login" })
public class LoginServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		User user = new User();
		
		user.email = request.getParameter("txtEmail");
		user.password = request.getParameter("txtPassword");
		
		JDBCHelper helper = new JDBCHelper();
		helper.createConnection();
		boolean auth = helper.authenticateUser(user);
		helper.closeConnection();
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.print("<html><body><center>");
		if(auth){
			
			String name = "John Watson"; // Hard Coded, But retrieve it from DB
			int age = 30;
			String email = user.email;
			
			
			// 1. Session Tracking - Cookies
			/*Cookie ck1 = new Cookie("keyName", name);
			Cookie ck2 = new Cookie("keyAge", String.valueOf(age));
			Cookie ck3 = new Cookie("keyEmail", email);
			
			// Added in the Client's Machine it its browser
			response.addCookie(ck1);
			response.addCookie(ck2);
			response.addCookie(ck3);*/
			
			out.print("<h3>"+user.email+" Login Success !!</h3>");
			//out.print("<br/><a href='Welcome'>Enter Home</a>");
			
			// 2. Session Tracking - URL ReWriting
			//out.print("<br/><a href='Welcome?name="+name+"&email="+email+"&age="+age+"'>Enter Home</a>");
			
			// 3. Session Tracking - Hidden Form Field
			/*String form = "<form action='Welcome' method='post'>"
					+ "<input type='hidden' name='txtName' value='"+name+"'/>"
					+ "<input type='hidden' name='txtEmail' value='"+email+"'/>"
					+ "<input type='hidden' name='txtAge' value='"+age+"'/>"
					+ "<input type='submit' value='Enter Home'/>"
					+ "</form>";
			
			out.print(form);*/
			
			// 4. Session Tracking - HttpSession API
			HttpSession session = request.getSession();
			session.setAttribute("keyName", name);
			session.setAttribute("keyEmail", email);
			session.setAttribute("keyAge", age);
			out.print("<br/><a href='Welcome'>Enter Home</a>");
			
		}else{
			out.print("<h3>"+user.email+" Login Failed !!</h3>");
			response.sendRedirect("https://www.google.co.in");
		}
		out.print("</center></body></html>");
		
	}

}
