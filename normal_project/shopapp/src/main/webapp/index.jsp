<%@page import="cn.connection.DbConn"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<title>Welcome to shopping Cart</title>

<%@include file="includes/head.jsp"%>

</head>
<body>


	<%@include file="includes/navbar.jsp"%>
	<%out.print(DbConn.getConnection()); %>
	<%@include file="includes/footer.jsp"%>

</body>
</html>