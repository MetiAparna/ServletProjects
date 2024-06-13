<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body  bgcolor="cyan">
<%
    int a=Integer.parseInt(request.getParameter("num1"));
    int b=Integer.parseInt(request.getParameter("num2"));
    int k=a+b;
    
    out.println("output: "+k);
    out.println(7+8);

%>
</body>
</html>