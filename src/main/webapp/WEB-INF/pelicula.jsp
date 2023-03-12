<%@page import="bean.Pelicula"%>
<%@ page pageEncoding="UTF-8"%>
<% Pelicula pelicula = (Pelicula) session.getAttribute("data"); %>

<br/><h1>Cartelera</h1><br/>
<div class="contenido-pelicula">
	<div class="datos-pelicula">
		<h2><%=pelicula.getTitulo()%></h2>
		<p><%=pelicula.getSinopsis()%></p>
		<br/>
		<div class="tabla">
			<div class="fila">
				<div class="celda-titulo">Título Original :</div>
				<div class="celda"><%=pelicula.getTitulo()%></div>
			</div>
			<div class="fila">
				<div class="celda-titulo">Estreno :</div>
				<div class="celda"><%=pelicula.getFechaEstreno()%></div>
			</div>
			<div class="fila">
				<div class="celda-titulo">Género :</div>
				<div class="celda"><%=pelicula.getGeneros()%></div>
			</div>
			<div class="fila">
				<div class="celda-titulo">Director :</div>
				<div class="celda"><%=pelicula.getDirector()%></div>
			</div>
			<div class="fila">
				<div class="celda-titulo">Reparto :</div>
				<div class="celda"><%=pelicula.getReparto()%></div>
			</div>
		</div>
	</div>
	<img src="img/pelicula/<%=pelicula.getId()%>.jpg" width="160" height="226"><br/><br/>
</div>
<div class="pelicula-video">
<embed src="http://www.youtube.com/v/<%=pelicula.getLink()%>" type="application/x-shockwave-flash" allowscriptaccess="always" allowfullscreen="true" width="580" height="400">
</div>
