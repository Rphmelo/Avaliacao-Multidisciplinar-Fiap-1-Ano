<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html" charset=ISO-8859-1">
<c:import url="imports/imports-bootstrap.jsp"></c:import>
<c:import url="imports/imports-masked.jsp"></c:import>
<title>Cadastro</title>
</head>

<body>
	
	<!-- Importando o menu -->
	<c:import url="imports/imports-menu.jsp"></c:import>

	<div class="container">

		<!-- Cadastro - Inicio -->
		<div class="container">
			<div class="row">
				<div class="col-md-12">
					<div class="well well-sm">
						
		<form id="cadastro" name="form1" action="#" class="form-horizontal" method="post">
				<input type="hidden" name="input_auxiliar" value="cadastro_Pes">
					<fieldset>
						<legend class="text-center header">
							<h2 class="text-primary">Cadastro</h2>
						</legend>

			<div class="form-group">
				<span class="col-md-1 col-md-offset-2 text-center"></span>
					<div class="col-md-8">
							<!-- Início do Fomulário de Dados Pessoais -->
								<p>Os dados que possuem (*) são obrigatórios.</p>
								<h3>Dados Pessoais</h3><hr>
														
								<label for="nome-id"><strong>Nome:(Somente letras) *</strong></label><br>
									<input id="nome-id" name="nome" type="text" placeholder="Digite seu nome completo" 
									minlength="2" maxlength="40" class="form-control" required><br> 
										
								<label for="cpf-id"><strong>CPF: (Somente números)*</strong></label><br>
									<input id="cpf-id" name="cpf" type="text" placeholder="Digite o cpf" 
									maxlength="11" minlength="11" class="form-control" required><br>
											
								<label for="rg-id"><strong>RG: (Somente números)*</strong></label><br> 
									<input id="rg-id" name="rg" type="text" placeholder="Digite o RG" 
									maxlength="9" class="form-control" required><br>
										
								<label for="dt-nascimento-id"><strong>Data de Nascimento: *</strong></label><br>
									<input id="dt-nascimento-id" name="dt-nascimento" type="date" 
									class="form-control-date" required>
						</div>
							<!-- Fim do Fomulário de Dados Pessoais -->
			</div>

						<div class="form-group">
									<span class="col-md-1 col-md-offset-2 text-center"></span>
									<div class="col-md-8">
									
								<!-- Início do Fomulário de Endereço -->
								<h3>Endereço:</h3><hr />
										
								<label for="tipo-log-id"><strong>Tipo de Logradouro: *</strong></label><br> 
									<select id="tipo-log-id" name="tipo-log">
										<option value="selecione">SELECIONE...</option>
										<option value="ALAMEDA">ALAMEDA</option>
										<option value="RUA">RUA</option>
										<option value="AVENIDA">AVENIDA</option>									
									</select><br><br>
									
								<label for="logradouro-id"><strong>Logradouro: *</strong></label>
									<input id="logradouro-id" name="logradouro" type="text"
									placeholder="Logradouro" maxlength="30" class="form-control" required><br>
										
								<label for="numero-id"><strong>Número: *</strong></label>
									<input id="numero-id" name="numero" type="number" max="999999" min="1" 
									placeholder="Digite o número" class="form-control" required><br>
																				
								<label for="cep-id"><strong>CEP: (Somente números)*</strong></label>
									<input id="cep-id" name="cep" type="text" maxlength="8" placeholder="Digite o CEP" 
									class="form-control" required><br>
											
								<label for="complemento-id"><strong>Complemento:</strong></label>
									<input id="complemento-id" name="complemento" type="text" placeholder="Digite o complemento" 
									maxlength="30" class="form-control" /><br>
											
								<label for="bairro-id"><strong>Bairro: *</strong></label>
									<input id="bairro-id" name="bairro" type="text" placeholder="Digite o bairro" 
									class="form-control" maxlength="30" required><br>
											
								<label for="cidade-id"><strong>Cidade: *</strong></label>
									<input id="cidade-id" name="cidade" type="text" placeholder="Digite a cidade" 
									class="form-control" maxlength="30" required /><br>
											
								<label for="uf-id"><strong>Estado: *</strong></label><br> 
									<select id="uf-id" name="uf">
								
									<option value="selecione">SELECIONE...</option>
									<option value="AC">Acre</option>
									<option value="AL">Alagoas</option>
									<option value="AP">Amapá</option>
									<option value="AM">Amazonas</option>
									<option value="bahia">BA</option>
									<option value="ceara">CE</option>
									<option value="distritofederal">DF</option>
									<option value="espiritosanto">ES</option>
									<option value="goias">GO</option>
									<option value="maranhao">MA</option>
									<option value="matogrosso">MT</option>
									<option value="matogrossosul">MS</option>
									<option value="minasgerais">MG</option>
									<option value="para">PA</option>
									<option value="paraiba">PB</option>
									<option value="parana">PR</option>
									<option value="pernambuco">PE</option>
									<option value="piaui">PI</option>
									<option value="riodejaneiro">RJ</option>
									<option value="riograndedonorte">RN</option>
									<option value="riograndedosul">RS</option>
									<option value="rondonia">RO</option>
									<option value="roraima">RR</option>
									<option value="santacatarina">SC</option>
									<option value="saopaulo">SP</option>
									<option value="sergipe">SE</option>
									<option value="tocantins">TO</option>
											
										</select>
									</div>
					 </div>
								<!-- Fim do Fomulário de Endereço -->
								
								<div class="form-group">
				<span class="col-md-1 col-md-offset-2 text-center"></span>
					<div class="col-md-8">
											<!-- Início do Fomulário de Telefone -->
											<h3>Telefone</h3><hr>
											
											<label for="tipo-telefone-id"><strong>Tipo de Telefone: *</strong></label><br> 
												<select id="tipo-telefone-id" name="tipo-telefone">
												
													<option value="selecione">SELECIONE...</option>
													<option value="residencial">RESIDENCIAL</option>
													<option value="comercial">COMERCIAL</option>
													<option value="celular">CELULAR</option>
																					
												</select><br><br>
														
											<label for="ddd-id"><strong>DDD: *</strong></label><br>
												<input id="ddd-id" name="ddd" maxlength="3" type="number" placeholder="Digite o DDD" class="form-control" required><br> 
											
											<label for="telefone-id"><strong>Telefone: *</strong></label><br>
												<input id="telefone-id" name="telefone" type="number" max="999999" min="1" placeholder="Digite o número do Telefone" class="form-control" required><br>
											
											<label for="ramal-id"><strong>Ramal:</strong></label><br>
												<input id="ramal-id" name="ramal" type="number" max="9999" min="1" placeholder="Digite o número do ramal" class="form-control">										
									</div>
											<!-- Fim do Fomulário de Telefone -->
								</div>
								
								<div class="form-group">
									<span class="col-md-1 col-md-offset-2 text-center"></span>
									<div class="col-md-8">
									
										<!-- Início do Formulário de Login -->
										<h3>Dados de Login</h3><hr />
										
										<label for="email-id"><strong>E-mail: *</strong></label><br>
											<input id="email-id" name="email" maxlength="50" type="email" placeholder="Digite seu e-mail" class="form-control" required><br>
										
										<label for="senha-id"><strong>Senha: (Minimo 8 caracteres)*</strong></label><br> 
											<input id="senha-id" name="senha" maxlength="20" minlength="8" type="password" placeholder="Digite sua senha" class="form-control" required>
									
									</div>
								</div>
									<!-- Fim do Formulário de Login -->


								<div class="form-group">
									<div class="col-md-12 text-center">
										<input type="submit" class="btn btn-primary btn-lg" value="Concluir Cadastro" />
									</div>
								</div>

							</fieldset>
						</form>

					</div>
					<!-- Fecha - well well-sm -->
					<!-- Cadastro - Fim -->

				</div>
				<!-- Fecha - col-md-12 -->
			</div>
			<!-- Fecha - row -->
		</div>
		<!-- Fecha - Container -->
</body>
</html>