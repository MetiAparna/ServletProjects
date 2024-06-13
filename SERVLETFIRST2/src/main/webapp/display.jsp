<%@page import="java.util.ArrayList" %>
<%@page import="java.util.List" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="orange">
<form action="session2">
<h1>Message from JSP </h1>
<%System.out.println("hello there"); 
%>
<%out.println(session.getAttribute("id"));%>
<br>

<%=session.getAttribute("name") %><br>
${name}<br>
<%=session.getAttribute("email")%><br>
${email}<br>
<br>
<%
List<Integer>list=(List)session.getAttribute("list");
   int count=1;
  for(Integer i:list){
	out.println("the"+count+"position data is="+i);
	%>
	<br>
	<%
	count++;
	}
	%>
	<% System.out.println(a);
int temp=15;
System.out.println(li);
%>
<h1><%="QWERTY" %></h1>
<%! int a=10; %>

<%!static List<Integer> li=new ArrayList<Integer>(); %>
</form>

</body>
</html>