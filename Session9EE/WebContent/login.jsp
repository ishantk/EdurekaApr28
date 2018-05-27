<%@page import="co.edureka.db.JDBCHelper"%>
<%@ page import="co.edureka.model.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Authentication</title>
</head>
<body>
	
	<h3>Authenticating User with EMAIL:  ${param.txtEmail} </h3> 
	
	<%
	
		User user = new User();
	
		user.email = request.getParameter("txtEmail");
		user.password = request.getParameter("txtPassword");
	
		JDBCHelper helper = new JDBCHelper();
		helper.createConnection();
		boolean auth = helper.authenticateUser(user);
		helper.closeConnection();
		
		if(auth){
			
			String name = "John Watson";
			String email = user.email;
			int age = 30;
			
			/*Cookie ck1 = new Cookie("keyName",name);
			Cookie ck2 = new Cookie("keyEmail",email);
			Cookie ck3 = new Cookie("keyAge",String.valueOf(age));
			
			response.addCookie(ck1);
			response.addCookie(ck2);
			response.addCookie(ck3);*/
			
			session.setAttribute("keyName", name);
			session.setAttribute("keyEmail", email);
			session.setAttribute("keyAge", age);
			
			pageContext.setAttribute("keyName", name, PageContext.SESSION_SCOPE);
			
			
	%>
		<jsp:forward page="welcome.jsp"/>
	
		<h3>Login is Success !!</h3>
		<a href="welcome.jsp">Enter Home</a>
	<%		
		}else{
	%>	
		<h3>Login is Failure !!</h3>
	<%	
		response.sendRedirect("https://www.google.co.in");
		}
	%>

</body>
</html>