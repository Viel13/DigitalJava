<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastro de breja</title>
</head>
<body>

	<h2>Cadastrar</h2>

	<div>
		<form action="cadastrar" method="post">
			<div>
				<label for="id-name"> Nome</label> 
				<input type="text" name="nome" id="id-nome">
			</div>

			<div>
				<label for="id-preco">Preço</label> 
				<input type="text" name="preco"	id="id-preco">
			</div>
			<div>
				<label for="id-tipo">Tipo</label> 
				<input type="text" name="tipo" id="id-tipo">
			</div>
			<div>
				<input type="submit" value="Cadastrar">
			</div>
		</form>
	</div>

</body>
</html>