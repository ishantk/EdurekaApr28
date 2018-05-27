<%@ page import="co.edureka.model.Student"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" buffer="8kb"%>
<%@ page errorPage="error.jsp" %>
<%@ page isThreadSafe="true" %>  
<%@ include file="printdate.jsp" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP Demo</title>
</head>
<body>

	<h3>Welcome to JSP Demo</h3>
	
	<h4>JSTL Demo:</h4>
	
	<c:forEach var="i" begin="1" end="10">
		<c:out value="${i}"/><br/>
	</c:forEach>
	
	<c:set var="age" value="20"/>
	
	<h4>Scriptlet:</h4>
	<%
		// Java Code goes here
		int a = 10;
		int b = 20;
		int c = a+b;
		
		if(a>b){
	%>		
		<b>a is greater than b</b>	
	<%		
		}else{
	%>
		<b>b is greater than a</b>	
	<%		
		}
			
	%>
	
	
	<h3>C is: <% out.print(c); %> </h3>
	
	<h4>Declarative</h4>
	<%!
		
		double pi = 3.14; 
		
		double calculateArea(double radius){
			double area = pi*radius*radius;
			return area;
		}
	%>
	
	<h3>pi is: <% out.print(pi); %> </h3>
	<h3>Area with radius 5.5 is: <% out.print( calculateArea(5.5) ); %> </h3>
	
	<jsp:include page="printdate.jsp"/>
	
	<h4>Expression</h4>
	<h3>Area with radius 11.11 is: <%= calculateArea(11.11) %> </h3>
	
	<%
		//try{
			int[] arr = {10,20,30,40,50};
			out.print("<h4>arr[3] : "+arr[3]+"</h4>");
		//}catch(Exception e){
		//	out.print("<i>Some Exception: "+e+"</i>");
		//}
	%>
	
	<%
		Student sRef = new Student();
		sRef.setRoll(101);
		sRef.setName("Jennie");
	%>
	
	<h4>Roll is: <%= sRef.getRoll() %></h4>
	<h4>Name is: <%= sRef.getName() %></h4> 
	
	<jsp:useBean id="stu" class="co.edureka.model.Student"/>
	<jsp:setProperty property="roll" name="stu" value="201"/>
	<jsp:setProperty property="name" name="stu" value="Fionna"/>
	
	<h4>Roll is: <jsp:getProperty property="roll" name="stu"/></h4>
	<h4>Name is:  <jsp:getProperty property="name" name="stu"/></h4>

</body>
</html>