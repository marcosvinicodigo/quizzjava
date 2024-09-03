<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="model.Rank"%>
<%@ page import="java.util.ArrayList"%>

<%
ArrayList<Rank> rank = (ArrayList<Rank>) request.getAttribute("rank");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Os mais geniais</title>

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">
<link rel="icon" href="imagens/quizzicone.png">
</head>
<body>
	<header class="bg-dark py-4"></header>
	<div class="container text-center">
		<table class="container text-center">
			<thead>
				<tr>
					<th class="h1">Nome</th>
					<th class="h1">Pontos</th>

				</tr>
			</thead>
			<tbody>
				<%
				for (int i = 0; i < rank.size(); i++) {
				%>
				<tr>
					<td class="h4"><%=rank.get(i).getNome()%></td>
					<td class="h4"><%=rank.get(i).getPontos()%></td>

				</tr>
				<%
				}
				%>
			</tbody>

		</table>
	</div>
	<div class="text-center">
		<a href="index.html">voltar</a>
	</div>

</body>
</html>