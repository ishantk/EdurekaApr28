package co.edureka.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class HomeServlet
 */
@WebServlet({ "/HomeServlet", "/Welcome" })
public class HomeServlet extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String dateTime = new Date().toString();
		
		// We can read cookies in any servlet in our web app
		Cookie[] ckArr = request.getCookies();
		
		out.print("<html><body><center>");
		out.print("<h3>Welcome Home, Dear User</h3>");
		out.print("<h4>Its, "+dateTime+"</h4>");
		
		/*out.print("<h4>Cookies:</h4>");
		for(Cookie ck : ckArr){
			out.print("<h4>"+ck.getName()+" - "+ck.getValue()+"</h4>");
		}*/
		
		//out.print("<h4>URL ReWriting Data:</h4>");
		
		/*String name = request.getParameter("name");
		String email = request.getParameter("email");
		String age = request.getParameter("age");*/
		
		//int iAge = Integer.parseInt(age);
		
		/*String name = request.getParameter("txtName");
		String email = request.getParameter("txtEmail");
		String age = request.getParameter("txtAge");*/
		
		out.print("<h4>HttpSession Data:</h4>");
		
		HttpSession session = request.getSession();
		String name = (String)session.getAttribute("keyName");
		String email = (String)session.getAttribute("keyEmail");
		int age = (Integer)session.getAttribute("keyAge");
		
		out.print("<h4>Hello, "+name+"</h4>");
		out.print("<h4>Email: "+email+"</h4>");
		out.print("<h4>You are "+age+" years old !!</h4>");
		
		out.print("</center></body></html>");
	}

}
