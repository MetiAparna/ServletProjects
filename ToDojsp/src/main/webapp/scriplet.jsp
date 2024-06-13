<%@page import="java.util.Scanner"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%!
  int coef=3;
  
%>
<h1>hello world</h1>
<%
  int i=9;
  out.println(7+5+"<br>");
%>
  my fav Number is:<% out.println(coef); %><br>
    my fav Number is:<%=coef %> 
  

</body>
</html>