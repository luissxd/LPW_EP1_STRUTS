<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
	<head>
		<meta charset="utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
		<meta name="description" content="Multicines Cinestar es una empresa pionera en el formato de multicines en el Perú. Información de películas, estrenos, concursos y más">
		<link rel="shortcut icon" href="img/varios/favicon.ico">
		<link href="css/estilos.css" rel="stylesheet" type="text/css">
		<title>Multicines Cinestar</title>
	</head>
	<body>
		<%@include file="WEB-INF/header.jsp" %>
	
		<div class="contenido">
			<div class="publicidad">
				<a href="http://www.cinestar.com.pe/starcard/"><img src="img/varios/starcard.jpg"/></a>
				<a href="http://www.cinestar.com.pe/cinefilo_star/"><img src="img/varios/cinefilo-star.jpg"/></a>
			</div>
			<div class="contenido-interno" id="contenido-interno">
				
				<%	Object id = session.getAttribute("id"); 
					if ( id == null ) { %>
				<% } else if ( id.equals("pelicula") ) { %> <%@include file="WEB-INF/pelicula.jsp" %>
				<% } else if ( id.equals("peliculas") ) { %> <%@include file="WEB-INF/peliculas.jsp" %>
				<% } else if ( id.equals("cine") ) { %> <%@include file="WEB-INF/cine.jsp" %>
				<% } else if ( id.equals("cines") ) { %> <%@include file="WEB-INF/cines.jsp" %>
				<% } %>

			</div>
		</div>
		<div class="clearbox"><br/></div>

		<%@include file="WEB-INF/footer.jsp" %>
		

	</body>
</html>