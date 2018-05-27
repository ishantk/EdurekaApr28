<%@ page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Welcome</title>
</head>
<body>
	
	<h3>Welcome User</h3>
	<%
		String dateTime = new Date().toString();
	%>
	<b>Its: <%= dateTime %></b>
	
	<!-- <h3>Cookies: </h3> -->
	<h3>Session Data: </h3>
	<%
	
		/*Cookie[] ckArr = request.getCookies();
		for(Cookie ck : ckArr){
			out.print("<h4>"+ck.getName()+" - "+ck.getValue()+"</h4>");
		}*/
		
		String name = (String)session.getAttribute("keyName");
		String email = (String)session.getAttribute("keyEmail");
		int age = (Integer)session.getAttribute("keyAge");
		
		String name1 = (String)pageContext.getAttribute("keyName",PageContext.SESSION_SCOPE);
		
	%>
	<h3>Name: <%= name %></h3>
	<h3>Email: <%= email %></h3>
	<h3>Age: <%= age %></h3>
	
</body>
</html>