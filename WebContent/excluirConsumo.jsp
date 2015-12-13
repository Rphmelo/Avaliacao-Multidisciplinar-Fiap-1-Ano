<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<c:import url="imports/imports-bootstrap.jsp"></c:import>
<c:import url="imports/imports-masked.jsp"></c:import>
<title>Excluir Consumo</title>
</head>
<body>
	<!-- Importando o menu -->
	<c:import url="imports/imports-menu.jsp"></c:import>
<div class="container">
		<!-- Excluir consumo - Inicio -->
		<div class="container">
			<div class="row">
				<div class="col-md-12">
					<div class="well well-sm">
						<fieldset>
							<div class="form-group">
								<span class="col-md-1 col-md-offset-2 text-center"></span>
								<div class="col-md-8">
									<h3 class="text-success text-center">${msgExcluirConsumo}</h3>
									<p>
										<i>Para excluir, digite o código do consumo abaixo:</i>
									</p>
									<!-- Formulário excluir consumo -->
									<form action="ServletHotel" method="post">
										<!-- Input tipo Hidden auxiliar -->
										<input type="hidden" name="input-Auxiliar"
											value="excluirConsumo" /> <label for="cod-consumo-id"><strong>Código do consumo
											</strong></label> <input id="cod-consumo-id" name="cod-consumo"
											type="number" placeholder="Digite o código do consumo"
											class="form-control" max="999" required><br />

										<div class="form-group">
											<div class="col-md-12">
												<input type="submit" class="btn btn-danger btn-lg"
													value="Excluir">
											</div>
										</div>
									</form>
									<!-- Fim Formulário Excluir Consumo-->
								</div>
							</div>
						</fieldset>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>