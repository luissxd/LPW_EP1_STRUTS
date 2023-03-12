<%@page import="bean.Cine"%>
<%@page import="java.util.List"%>
<%@page pageEncoding="UTF-8"%>

<br><h1>Nuestros Cines</h1>
<%	List<Cine> lstCine = (List<Cine>) session.getAttribute("lstCine");
	for( Cine Cine : lstCine ) {
%>


<div class="contenido-cine">
	<img src="img/cine/<%= Cine.getId() %>.1.jpg" width="227" height="170" />
	<div class="datos-cine">
		<h4><%= Cine.getRazonSocial() %></h4>
		<br/> <span><%= Cine.getDireccion() %> - <%= Cine.getIdDistrito() %>
		<br/>Telefono: <%= Cine.getTelefonos() %>
		</span>
	</div>
	<br/> <a href="svlCine?Id=<%= Cine.getId() %>">
		<img src="img/varios/ico-info2.png" width="150" height="40" />
	</a>
</div>
<% }%>