<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<!-- Importando os arquivos CSS / JavaScript -->
<c:import url="imports/imports-bootstrap.jsp"></c:import>
<title>Página Inicial</title>

</head>

<body>

	<!-- Importando o menu -->
	<c:import url="imports/imports-menu.jsp"></c:import>
	<div class="container">
		<div class="jumbotron">
			<h1>
				<small class="text-primary">Bem-Vindo ao </small><i class="text-primary">Hotel Boa Viagem!</i>
			</h1>
			<p>Conheça o nosso Hotel:</p>
		</div>
		<div class="row">
			<div class="col-sm-4 text-info">
				<h3 class="text-center">O Prédio</h3>
				<figure> <img class="img-responsive" src="img/fachada.jpg"
					alt="fachada de hotel" /> <figcaption>
				<h5 class="text-justify">O nosso Hotel é amplo e possui quartos
					incríveis para você e sua família.</h5>
				</figcaption> </figure>
			</div>
			<div class="col-sm-4 text-info">
				<h3 class="text-center">Room-Service</h3>
				<figure> <img class="img-responsive"
					src="img/room-service.jpg" alt="room-service" /> <figcaption>
				<h5 class="text-justify">Oferecemos um excelente Serviço de
					Quarto aos nossos clientes.</h5>
				</figcaption> </figure>
			</div>
			<div class="col-sm-4 text-info">
				<h3 class="text-center">Vista da Sacada</h3>
				<figure> <img class="img-responsive" src="img/sacada.jpg"
					alt="sacada" /> <figcaption>
				<h5 class="text-justify">Aqui você pode apreciar toda a beleza
					do mar da janela do seu quarto.</h5>
				</figcaption> </figure>
			</div>
		</div>
		<div class="row">
			<div class="col-sm-4 text-info">
				<h3 class="text-center">Suíte Presidencial</h3>
				<figure> <img class="img-responsive"
					src="img/suite-presidencial.jpg" alt="suite-presidencial" /> <figcaption>
				<h5 class="text-justify">A Suíte Presidencial traz um enorme
					conforto para os nossos hóspedes.</h5>
				</figcaption> </figure>
			</div>
			<div class="col-sm-4 text-info">
				<h3 class="text-center">Área de Lazer</h3>
				<figure> <img class="img-responsive" src="img/lazer.jpg"
					alt="Lazer" /> <figcaption>
				<h5 class="text-justify">Além do conforto dos quartos, você
					também pode se divertir com seus filhos.</h5>
				</figcaption> </figure>
			</div>
			<div class="col-sm-4 text-info">
				<h3 class="text-center">Piscina</h3>
				<figure> <img class="img-responsive" src="img/piscina.jpg"
					alt="piscina" /> <figcaption>
				<h5 class="text-justify">A nossa piscina é incrível. Um ótimo
					local para relaxar.</h5>
				</figcaption> </figure>
			</div>
		</div>
		<div class="row">
			<div class="col-sm-4 text-info">
				<h3 class="text-center">Restaurante</h3>
				<figure> <img class="img-responsive"
					src="img/restaurante.jpg" alt="restaurante" /> <figcaption>
				<h5 class="text-justify">O nosso restaurante tem um cardápio
					sem igual.</h5>
				</figcaption> </figure>
			</div>
			<div class="col-sm-4 text-info">
				<h3 class="text-center">Recepção</h3>
				<figure> <img class="img-responsive" src="img/recepcao.jpg"
					alt="Recepcao" /> <figcaption>
				<h5 class="text-justify">Aqui você é bem tratado desde a
					chegada.</h5>
				</figcaption> </figure>
			</div>
			<div class="col-sm-4 text-info">
				<h3 class="text-center">Massagem</h3>
				<figure> <img class="img-responsive" src="img/massagem.jpg"
					alt="massagem" /> <figcaption>
				<h5 class="text-justify">Está cansado? Relaxe com uma Super
					massagem.</h5>
				</figcaption> </figure>
			</div>
		</div>
	</div>
	
</body>
</html>