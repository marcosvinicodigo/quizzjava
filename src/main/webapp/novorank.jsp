<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Coloque seu nome</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">
<link rel="icon" href="imagens/quizzicone.png">
</head>
<body>
	<%
	String pontos = (String) request.getAttribute("pontos");
	%>
	<header class="bg-dark py-4"></header>
	<div class="container text-center">
		<div class="row"></div>
		<div class="col-12 p-3"></div>
		<div class="col-12 p-5"></div>
		<div class="col-12 p-5"></div>
		<div class="col-12">
			<h1>Digite seu nome genial</h1>
			<div class="form">

				<form class="form" name="formRank" action="novorank">

					<input class="caixa1" type="text" name="nome" placeholder="Nome">
					<input class="caixa1" type="hidden" name="pontos"
						value="<%out.print(request.getAttribute("pontos"));%>"> <input
						class="btn btn-dark" type="button" value="pronto"
						onclick="enviarNome()">
				</form>
			</div>



		</div>
	</div>
	<script src="scripts/validador.js"></script>
</body>
</html>
