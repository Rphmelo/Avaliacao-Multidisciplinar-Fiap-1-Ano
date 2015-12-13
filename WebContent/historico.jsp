<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<!-- Importando os arquivos CSS / JavaScript -->
<c:import url="imports/imports-bootstrap.jsp"></c:import>
<title>Histórico de Preços</title>
</head>
<body>
	<!-- Importando o menu -->
	<c:import url="imports/imports-menu.jsp"></c:import>
	<div class="container">
		<div class="container">
			<div class="row">
				<div class="col-md-12">
					<div class="well well-sm">
						<div class="panel panel-default">
							<!-- Default panel contents -->
							<div class="panel-heading">
								<h3 class="text-primary">Produtos</h3>
							</div>
							<!-- Tabela de Historicos de produtos -->
							<table class="table table-hover table-bordered">
								<thead>
									<tr>
										<th class="tg-vn4c">Descrição do Produto</th>
										<th class="tg-vn4c">Data de validade</th>
										<th class="tg-vn4c">Valor</th>
									</tr>
								</thead>

								<c:forEach var="listaHist" items="${listaHistProduto}">
									<tbody>
										<tr>
											<td class="tg-031e">${listaHist.produto_servico.descricao}</td>
											<td class="tg-031e"><fmt:formatDate value="${listaHist.data_Validade.time}" pattern="dd/MM/yyyy"/></td>
											<td class="tg-031e"><fmt:formatNumber value="${listaHist.preco}" minFractionDigits="2" type="currency"/></td>
										</tr>
									</tbody>
								</c:forEach>
							</table>

							<div class="panel panel-default">
								<!-- Default panel contents -->
								<div class="panel-heading">
									<h3 class="text-primary">Serviços</h3>
								</div>
								<!-- Tabela de Historicos de serviços -->
								<table class="table table-hover table-bordered">
									<thead>
										<tr>
											<th class="tg-vn4c">Descrição do Serviço</th>
											<th class="tg-vn4c">Data de validade</th>
											<th class="tg-vn4c">Valor(R$)</th>
										</tr>
									</thead>

									<c:forEach var="listaHist" items="${listaHistServico}">
										<tbody>
											<tr>
												<td class="tg-031e">${listaHist.produto_servico.descricao}</td>
												<td class="tg-031e"><fmt:formatDate value="${listaHist.data_Validade.time}" pattern="dd/MM/yyyy"/></td>
												<td class="tg-031e">${listaHist.preco}</td>
											</tr>
										</tbody>
									</c:forEach>
								</table>

							</div>
						</div>
					</div>
				</div>
			</div>
</body>
</html>