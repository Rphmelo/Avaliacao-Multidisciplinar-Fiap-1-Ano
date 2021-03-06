<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<c:import url="imports/imports-bootstrap.jsp"></c:import>
<c:import url="imports/imports-masked.jsp"></c:import>
<title>Registrar Consumo</title>
</head>
<body>

	<!-- Importando o menu -->
	<c:import url="imports/imports-menu.jsp"></c:import>
	
	<div class="container">
		<!-- Registrar consumo - Inicio -->
		<div class="container">
			<div class="row">
				<div class="col-md-12">
					<div class="well well-sm">
						<fieldset>
						
								<h2 class="text-primary text-center">Registrar consumo</h2>
								<br />
							
							<div class="form-group">
								<span class="col-md-1 col-md-offset-2 text-center"></span>
								<div class="col-md-8">
									<p>
										<i>Para buscar o c�digo da hospedagem, digite o CPF do
											Cliente</i>
									</p>
									<!-- Formul�rio pesquisa hospedagem -->
									<form action="ServletHotel" method="post">
										<!-- Input tipo Hidden auxiliar -->
										<input type="hidden" name="input-Auxiliar"
											value="pesquisarCodHospedagem" /> <label for="cpf-id"><strong>CPF
												do Cliente:</strong></label> <input id="cpf-id" name="cpf-cliente"
											type="text" placeholder="Digite o CPF do Cliente"
											class="form-control" maxlength="11" required><br />

										<div class="form-group">
											<div class="col-md-12">
												<input type="submit" class="btn btn-primary btn-lg"
													value="Pesquisar">
											</div>
										</div>
									</form>
									<!-- Fim Formul�rio pesquisa hospedagem -->
								</div>
							</div>

							<div class="form-group">
								<span class="col-md-1 col-md-offset-2 text-center"></span>
								<div class="col-md-8">
									<!-- Formulario registrar consumo -->
									<form id="consumo" class="form-horizontal"
										action="ServletHotel" method="post">
										<input type="hidden" name="input-Auxiliar"
											value="registrarConsumo" />
										<hr />
											<label for="cod-hosp-id"><strong>C�digo da
													Hospedagem:</strong></label>
											<input id="cod-hosp-id" name="cod-hosp" type="text"
												class="form-control" value="${codigoHosp}" maxlength="0"
												required>
										<br />
										<fieldset>
											<legend class="text-center header">
												<h3>Produtos e Servi�os</h3>
											</legend>
											<p>
												<i>Selecione o produto ou servi�o e digite a quantidade
													consumida</i>
											</p>
											<select id="prodserv-id" name="prodserv" class="form-control"
												required>
												<option value="">Selecione...</option>
												<optgroup label="Produtos">
													<c:forEach var="produto" items="${listaProduto}">
														<option value="${produto.descricao}">${produto.descricao}</option>
													</c:forEach>
												</optgroup>
												<optgroup label="Servi�os">
													<c:forEach var="servico" items="${listaServico}">
														<option value="${servico.descricao}">${servico.descricao}</option>
													</c:forEach>
												</optgroup>

											</select><br /> <label for="quantidade-id"><strong>Quantidade:</strong></label>
											<input id="quantidade-id" name="quantidade" type="number"
												pattern="[0-9]+$" placeholder="Digite a quantidade"
												class="form-control" min="1" max="50" required /><br />
										</fieldset>
										<hr>
										<legend class="text-center header">
											<h3>C�digo do Funcion�rio</h3>
										</legend>
										<p>
											<i>Para registrar o consumo, digite o seu C�digo de
												Funcion�rio</i>
										</p>
										<label for="cod_func"><strong>C�digo do
												Funcion�rio:</strong></label> <input id="cod-func" name="cod-func"
											type="text" placeholder="Digite o seu C�digo de Funcion�rio"
											pattern="[0-9]+$" class="form-control" maxlength="5" required><br />
										<hr>

										<div class="form-group">
											<span class="col-md-1 col-md-offset-2 text-center"></span>
											<div class="col-md-8">
												<div class="col-md-12">
													<input type="submit" class="btn btn-primary btn-lg"
														value="Registrar Consumo">
												</div>
											</div>
										</div>
									</form>
								</div>
								<!-- Fim Formulario registrar consumo -->
							</div>
						</fieldset>
					</div>
				</div>
			</div>
			<!-- Fecha - well well-sm -->
			<!-- Registrar consumo - Fim -->
		</div>
		<!-- Fecha - col-md-12 -->
	</div>
	<!-- Fecha - row -->
	<!-- Fecha - Container -->
</body>
</html>