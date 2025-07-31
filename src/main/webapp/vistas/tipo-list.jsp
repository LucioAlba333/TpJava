<%@page import="entities.TipoHabitacion"%>
<%@page import="java.util.LinkedList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table>
    <thead>
        <tr>
            <th>ID</th>
            <th>Nombre</th>
        </tr>
        <%
        LinkedList<TipoHabitacion> tipos = (LinkedList<TipoHabitacion>) request.getAttribute("listTipos"); 
        for (TipoHabitacion tipo: tipos ){
        %>
        	<tr>
        		<td> <%= tipo.getId() %></td>
        		<td><%= tipo.getId() %> </td>
        	</tr>
        	<%} %>
        	
        
    </thead>
   </table>
</body>
</html>