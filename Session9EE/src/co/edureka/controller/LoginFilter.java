package co.edureka.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;


@WebFilter("/LoginFilter")
public class LoginFilter implements Filter {

	public void destroy() {
		System.out.println("--Filter destroy--");
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		// PreProcessing Code goes here
		out.print("==PreProcessing==");
		String email = request.getParameter("txtEmail");
		String password = request.getParameter("txtPassword");
		
		if(!email.isEmpty() && !password.isEmpty()){
			// pass the request along the filter chain
			chain.doFilter(request, response); // Forward Request Response to the Servlet
		}else{
			out.print("Validation Failed !! Please Enter Valid Details !!");
		}
		
		// PostProcessing Code goes here
		out.print("==PostProcessing==");
	}

	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("--Filter init--");
	}

}
