<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.List, java.util.ArrayList, entities.Alumno"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

  <table border="1">
        <!-- Encabezado de la tabla -->
        <thead>
            <tr>
                <th>NOMBRE</th>
                <th>APELLIDO</th>
                <th>SEXO</th>
                <th>ASIGNATURA</th>
                <th>DESCRIPCION</th> 
            </tr>
        </thead>
        <!-- Cuerpo de la tabla -->
        <tbody>
        
        <% Alumno alumno = (Alumno)request.getAttribute("alumno");%>
           <tr>
        	   <td> <%=alumno.getNombre()%></td> 
        	   <td> <%=alumno.getApelllido()%></td>
        	    <td> <%=alumno.getSexo()%></td>
        	     <td> <%=alumno.getAsignatura()%></td>
        	      <td> <%=alumno.getDescripcion()%></td>
       </tr>
        
            <tr>
                <td>Fila 1, Celda 1</td>
                <td>Fila 1, Celda 2</td>
                <td>Fila 1, Celda 3</td>
            </tr>
            <tr>
                <td>Fila 2, Celda 1</td>
                <td>Fila 2, Celda 2</td>
                <td>Fila 2, Celda 3</td>
            </tr>
            <!-- Puedes agregar más filas según sea necesario -->
        </tbody>
    </table>

</body>
</html>