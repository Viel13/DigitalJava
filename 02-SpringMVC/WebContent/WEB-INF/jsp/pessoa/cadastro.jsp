<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastro de Pessoa</title>
</head>
<body>

	<h1>Cadastro de Pessoa</h1>
	<form action="cadastrar" method="post">
		<div>
			<label for="id-nome">Nome</label>
			<input type="text" name="nome" id="id-nome">
		</div>
		<div>
			<label for=id-idade>Idade</label>
			<input type="text" name="idade" id="id-idade">
		</div>
		<div>
			<label for="id-email">E-mail</label>
			<input type="text" name="email" id="id-email">
		</div>
		<input type="submit" value="Salvar">
	</form>

</body>
</html>