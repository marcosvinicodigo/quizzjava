<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ooops...</title>
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
			<h1>GAME OVER</h1>
			<p>Você conseguiu <%out.print(request.getAttribute("pontos"));%>
				pontos, olhe onde você está no <a href="#"
					onclick="rankear(<%=pontos%>)">Ranking...</a>
			</p>

		</div>
		<div class="col-12">
			<a href="iniciar" class="btn btn-dark">Tentar de novo</a> <a
				href="index.html" class="btn btn-dark w-5">Inicio</a>
		</div>


	</div>

	<script src="scripts/validador.js"></script>
</body>
</html>