<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import ="java.util.List, java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<ul>

	
	<% List<String> colores = new ArrayList();
	colores.add("Rjo");
	colores.add("Veerde");
	%>
	<% for(String color : colores){%>
		<li><%= color %></li>
	<%} %>
	
	</ul>

</body>
</html>