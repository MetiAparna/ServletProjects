<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%Teacher t=(Teacher)session.getAttribute("teacher"); 
if(t!=null){
%>
<h1>Login successfully.  welcome user </h1>
<%
}
else{ 
%>
<h1>please provide valid User name and password for accesing the feature</h1>
</body>
</html>