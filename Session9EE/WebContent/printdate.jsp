<%@ page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	Date date = new Date();
	out.print("<i><h3>Its: "+date+"</h3></i>");
%>