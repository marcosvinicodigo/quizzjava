<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="model.JavaBeans"%>
<%@ page import="java.util.HashSet"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sou Genial</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">
<link rel="icon" href="imagens/quizzicone.png">
</head>
<body>
	<header class="bg-dark py-4"></header>
	<form class="form" name="formContato" action="insert">
		<div class="container text-center">
			<div class="row">
				<%
				int resposta = (int) request.getAttribute("respcerta");
				%>
				<%
				int id = (int) request.getAttribute("id");
				%>
				<div class="col-12 p-3"></div>
				<div class="col-12 p-5"></div>
				<div class="col-12 p-5">
					<h1>
						<%
						out.print(request.getAttribute("pergunta"));
						%>
					</h1>
				</div>
				<div class="col-3">
					<input class="btn btn-dark w-75" type="button" id="resp1"
						value="<%out.print(request.getAttribute("resp1"));%>"
						onclick="validar(1,'<%=resposta%>','<%=id%>')">
				</div>
				<div class="col-3">
					<input class="btn btn-dark w-75" type="button" id="resp2"
						value="<%out.print(request.getAttribute("resp2"));%>"
						onclick="validar(2,'<%=resposta%>','<%=id%>')">
				</div>
				<div class="col-3">
					<input class="btn btn-dark w-75" type="button" id="resp3"
						value="<%out.print(request.getAttribute("resp3"));%>"
						onclick="validar(3,'<%=resposta%>','<%=id%>')">
				</div>
				<div class="col-3">
					<input class="btn btn-dark w-75 h-100" type="button" id="resp4"
						value="<%out.print(request.getAttribute("resp4"));%>"
						onclick="validar(4,'<%=resposta%>','<%=id%>')">
				</div>
			</div>
		</div>
	</form>

	<script src="scripts/validador.js"></script>
</body>
</html>