<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="entities.Alumno" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>FORMULARIO DE PRUBA SERVLET</h1>
	<form action="http://localhost:8081/ProyectoWeb/TablaAlumnosSrvlet" method="post">
		NombreAlumno <input type="text" name="nombre"><br>
		ApellidoAlumno<input type="text" name="apellido"><br> 
		Sexo<label for="sexo">Seleciona el sexo del alumno</label><br>
		<input type="radio" name="sexo" value="Maculino">Maculino <input
			type="radio" name="sexo" value="Femenino">Femenino <input
			type="radio" name="sexo" value="Prefiero no deccirlo">Prefiero no
		deccirlo <br> Asignaturas <select id="genero" name="asignatura">
			<option value="opcion0">Seleccione</option>
			<option value="Religion">Religion</option>
			<option value="C++">C++</option>
			<option value="Java">Java</option>
		</select><br>
		<textarea name="mensaje" rows="4" cols="50"></textarea><br>
		

		<input type="submit" value="enviar" id="botonSubmit">
	</form>

	
				
				
			
				
		
</body>
</html>