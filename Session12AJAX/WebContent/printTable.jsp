<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	// JSP File expects a Number, and sends back Table of a Number as Response
	String number = request.getParameter("number");
	try{
		int num = Integer.parseInt(number);
		
		for(int i=1;i<=10;i++){
			out.print(num+" "+i+"'s are "+(num*i)+"<br/>");
		}
	
	}catch(Exception e){
		out.print("Please Enter a Correct Number !!");
	}
%>