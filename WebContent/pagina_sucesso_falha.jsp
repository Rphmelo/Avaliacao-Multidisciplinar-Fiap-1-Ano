<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<c:import url="imports/imports-bootstrap.jsp"></c:import>
<title>Hotel Boa Viagem</title>
</head>
<body>
	<!-- Importando o menu -->
	<c:import url="imports/imports-menu.jsp"></c:import>
	<div class="container">
		<div class="container">
			<div class="row">
				<div class="col-md-12">
					<div class="well well-sm">

						<h3 class="text-danger">${msg_Falha}</h3>
						<h3 class="text-success">${msgRegistrarConsumo}</h3>
						<div class="panel panel-default">
							<!-- Default panel contents -->
							<div class="panel-heading">
								<p>
								<i>Deseja ver o valor e a data de validade do preço de cada
									produto ou serviço? <a
									href="ServletHotel?input-Auxiliar=listaHistorico">Clique
										aqui!</a>
								</i>
							</p>
							<p>
								<i>Se você cadastrou algum consumo incorretamente e deseja atualizá-lo, 
								<a href="ServletHotel?input-Auxiliar=listaProd_Serv2">Clique aqui!</a>
								</i>
							</p>
							<p>
								<i>Se você deseja excluir algum consumo,  
								<a href="excluirConsumo.jsp">Clique aqui!</a>
								</i>
							</p>
							<h3 class="text-primary">Consumos realizados pela
									Hospedagem:</h3>
							</div>
							
							<!-- Tabela de consumos -->
							<table class="table table-hover table-bordered">

								<thead>
									<tr>
										<th class="tg-vn4c">Código do consumo</th>
										<th class="tg-vn4c">Código da hospedagem</th>
										<th class="tg-vn4c">Nome do Cliente</th>
										<th class="tg-vn4c">Número do quarto</th>
										<th class="tg-vn4c">Produto/Serviço</th>
										<th class="tg-vn4c">Quantidade Consumida</th>
										<th class="tg-vn4c">Data de Consumo</th>
										<th class="tg-vn4c">Funcionário</th>
									</tr>
								</thead>

								<c:forEach var="listaConsumo" items="${listaConsumos}">
									<tbody>
										<tr>
										 	<td class="tg-031e">${listaConsumo.codigo}</td>
											<td class="tg-031e">${listaConsumo.hospedagem.codigo}</td>
											<td class="tg-031e">${listaConsumo.hospedagem.cliente.nome}</td>
											<td class="tg-031e">${listaConsumo.hospedagem.quarto.codigo}</td>
											<td class="tg-031e">${listaConsumo.produto_Servico.descricao}</td>
											<td class="tg-0ord">${listaConsumo.quantidade}</td>
											<td class="tg-0ord"><fmt:formatDate value="${listaConsumo.dt_Consumo.time}" pattern="dd/MM/yyyy"/></td>
											<td class="tg-0ord">${listaConsumo.funcionario.nome}</td>
										</tr>
									</tbody>
								</c:forEach>
							</table>

						</div>

					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>