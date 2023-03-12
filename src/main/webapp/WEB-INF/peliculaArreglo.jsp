<%@ page pageEncoding="UTF-8"%>
<% String [] pelicula = (String[]) session.getAttribute("data"); %>
<br/><h1>Cartelera</h1><br/>
<div class="contenido-pelicula">
	<div class="datos-pelicula">
		<h2><%=pelicula[1]%></h2>
		<p><%=pelicula[10]%></p>
		<br/>
		<div class="tabla">
			<div class="fila">
				<div class="celda-titulo">Título Original :</div>
				<div class="celda"><%=pelicula[1]%></div>
			</div>
			<div class="fila">
				<div class="celda-titulo">Estreno :</div>
				<div class="celda"><%=pelicula[2]%></div>
			</div>
			<div class="fila">
				<div class="celda-titulo">Género :</div>
				<div class="celda"><%=pelicula[4]%></div>
			</div>
			<div class="fila">
				<div class="celda-titulo">Director :</div>
				<div class="celda"><%=pelicula[3]%></div>
			</div>
			<div class="fila">
				<div class="celda-titulo">Reparto :</div>
				<div class="celda"><%=pelicula[9]%></div>
			</div>
		</div>
	</div>
	<img src="img/pelicula/<%=pelicula[0]%>.jpg" width="160" height="226"><br/><br/>
</div>
<div class="pelicula-video">
	<embed src="http://www.youtube.com/v/<%=pelicula[8]%>" type="application/x-shockwave-flash" allowscriptaccess="always" allowfullscreen="true" width="580" height="400">
</div>
