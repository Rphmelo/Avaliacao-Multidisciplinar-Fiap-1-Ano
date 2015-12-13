<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<c:import url="imports/imports-bootstrap.jsp"></c:import>
<c:import url="imports/imports-masked.jsp"></c:import>
<title>Atualizar Consumo</title>
</head>
<body>
	<!-- Importando o menu -->
	<c:import url="imports/imports-menu.jsp"></c:import>

<div class="container">
		<!-- Atualizar consumo - Inicio -->
		<div class="container">
			<div class="row">
				<div class="col-md-12">
					<div class="well well-sm">
						<fieldset>
								<h2 class="text-primary text-center">Atualizar consumo</h2>
								<h3 class="text-success text-center" >${msgAtualizarConsumo}</h3>
								<br />
							<div class="form-group">
								<span class="col-md-1 col-md-offset-2 text-center"></span>
								<div class="col-md-8">
									<!-- Formulario atualizar consumo -->
									<form id="consumo" class="form-horizontal"
										action="ServletHotel" method="post">
										<input type="hidden" name="input-Auxiliar"
											value="atualizarConsumo" />
										<hr/>
										<label for="cod-consumo-id"><strong>Código do consumo:</strong></label>
											<input id="cod-hosp-id" name="cod-consumo" type="number"
												class="form-control" placeholder="Digite o código do consumo" min="1" max="999"
												required>
										
											<label for="cod-hosp-id"><strong>Código da
													Hospedagem:</strong></label>
											<input id="cod-hosp-id" name="cod-hosp" type="number"
												class="form-control" placeholder="Digite o código da hospedagem" max="999"
												required>
										<br />
										<fieldset>
												<h3 class="text-center">Produtos e Serviços</h3>
											<p>
												<i>Selecione o produto ou serviço e digite a quantidade
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
												<optgroup label="Serviços">
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
											<h3 class="text-center">Código do Funcionário</h3>
										<p>
											<i>Para atualizar o consumo, digite Código de
												Funcionário</i>
										</p>
										<label for="cod_func"><strong>Código do
												Funcionário:</strong></label> <input id="cod-func" name="cod-func"
											type="text" placeholder="Digite Código de Funcionário"
											pattern="[0-9]+$" class="form-control" maxlength="5" required><br />
										<hr>

										<div class="form-group">
											<span class="col-md-1 col-md-offset-2 text-center"></span>
											<div class="col-md-8">
												<div class="col-md-12">
													<input type="submit" class="btn btn-success btn-lg"
														value="Atualizar Consumo">
												</div>
											</div>
										</div>
									</form>
								</div>
								<!-- Fim Formulario atualizar consumo -->
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