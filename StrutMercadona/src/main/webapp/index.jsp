<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<head>
<meta charset="ISO-8859-1">
<title>MERCADONA</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
	crossorigin="anonymous">
<link rel="stylesheet" href="css/estilomerca.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script type="text/javascript" src="js/scrip-super.js"></script>

</head>
<html>

<body>
	<h2>BIENVENIDO A STRUTSMERCADONA</h2>
	<header>
	<div class="container-fluid">
		<div class="col-md-12 text-center">
			<img alt=""
				src="https://www.mercadona.es/imagenes/1415435237___esp/logomercavertical.gif">
		</div>
	</div>
	</header>
	<div class="container-fluid">
		<div class="row">

			<div class="col-md-6 text-center">
				<h2>
					<b>USUARIOS</b>
				</h2>
				<s:form action="login">

					<s:textfield name="personBean.firstName" label="First name" />
					<s:textfield name="personBean.pasword" label="Contraseña" />

					<s:submit value="ENTRAR"/>
				</s:form>
			</div>
			<div class="col-md-6 text-center">
			<h2>
					<b>NUEVO USUARIO</b>
				</h2>
				<s:form action="register">
					<s:textfield name="personBean.firstName" label="Nombre" />
					
					<s:textfield name="personBean.lastName" label="Last name" />
					
					<s:textfield name="personBean.lastName2" label="Last name2" />
					
					<s:textfield name="personBean.email" label="Email" />
					
					<s:textfield name="personBean.age" label="Age" />
					
					<s:textfield name="personBean.pasword" label="Contraseña" />

					<s:submit value="REGISTRARSE" />
				</s:form>
		
				
			</div>

		</div>
	</div>




</body>
</html>
