package br.com.fiap.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.bean.Consumo;
import br.com.fiap.bean.Funcionario;
import br.com.fiap.bean.Hist_Preco;
import br.com.fiap.bean.Hospedagem;
import br.com.fiap.bean.Produto_Servico;
import br.com.fiap.bo.ConsumoBO;
import br.com.fiap.bo.FuncionarioBO;
import br.com.fiap.bo.Hist_PrecoBO;
import br.com.fiap.bo.HospedagemBO;
import br.com.fiap.bo.Produto_ServicoBO;
import br.com.fiap.conexao.ConexaoFactory;
import br.com.fiap.excecao.Excecao;

/**
 * Implementa��o do Servlet.
 * 
 * @author Raphael de Melo Silva
 * @author Ricardo Antonelli 
 * 
 */

@WebServlet("/ServletHotel")
public class ServletHotel extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	
	public ServletHotel() {
		super();
	}

	// M�todo para pesquisar funcionario atrav�s do c�digo
		
	/**
	 * M�todo para pesquisar funcionario atrav�s do c�digo.
	 * 
	 * @param Connection con
	 * @param HttpServletRequest request
	 * @param HttpServletResponse response
	 * @return Funcionario func
	 * @throws ServletException
	 * @throws IOException
	 */
	
	protected Funcionario pesquisarFuncionario(Connection con,
			HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Funcionario func = new Funcionario();
		int codigoFunc = Integer.parseInt(request.getParameter("cod-func"));
		try {
			func = FuncionarioBO.pesquisarFuncionario(con, codigoFunc);
			if (func.getCodigo() == 0) {
				request.setAttribute(
						"msg_Falha",
						"N�o existe nenhum funcion�rio cadastrado com este c�digo, por favor, insira um c�digo v�lido!");
				RequestDispatcher rd = request
						.getRequestDispatcher("pagina_sucesso_falha.jsp");
				rd.forward(request, response);
			}
		} catch (Excecao e) {
			e.printStackTrace();
		} catch (SQLException e) {
			request.setAttribute(
					"msg_Falha",
					"Falha no banco de dados, estamos trabalhando para resolver isto o mais r�pido poss�vel!");
			RequestDispatcher rd = request
					.getRequestDispatcher("pagina_sucesso_falha.jsp");
			rd.forward(request, response);
			e.printStackTrace();
		}
		return func;
	}

	// M�todo para listar todos os servi�os do banco de dados
		
	/**
	 * M�todo para listar todos os servi�os do banco de dados.
	 * 
	 * @param Connection con
	 * @param HttpServletRequest request
	 * @param HttpServletResponse response
	 * @return List listaServico
	 * @throws ServletException
	 * @throws IOException
	 */
	
	protected List<Produto_Servico> listarServico(Connection con,
			HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<Produto_Servico> listaServico = null;
		try {
			listaServico = Produto_ServicoBO.listarServicos(con);
		} catch (SQLException e) {
			request.setAttribute(
					"msg_Falha",
					"Falha no banco de dados, estamos trabalhando para resolver isto o mais r�pido poss�vel!");
			RequestDispatcher rd = request
					.getRequestDispatcher("pagina_sucesso_falha.jsp");
			rd.forward(request, response);
			e.printStackTrace();
		} catch (Excecao e) {
			e.printStackTrace();
		}
		return listaServico;
	}

	// M�todo para listar todos os produtos do banco de dados
		
	/**
	 * M�todo para listar todos os produtos do banco de dados.
	 * 
	 * @param Connection con
	 * @param HttpServletRequest request
	 * @param HttpServletResponse response
	 * @return List listaProduto
	 * @throws ServletException
	 * @throws IOException
	 */
	
	protected List<Produto_Servico> listarProduto(Connection con,
			HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<Produto_Servico> listaProduto = null;
		try {
			listaProduto = Produto_ServicoBO.listarProduto(con);
		} catch (SQLException e) {
			request.setAttribute(
					"msg_Falha",
					"Falha no banco de dados, estamos trabalhando para resolver isto o mais r�pido poss�vel!");
			RequestDispatcher rd = request
					.getRequestDispatcher("pagina_sucesso_falha.jsp");
			rd.forward(request, response);
			e.printStackTrace();
		} catch (Excecao e) {
			e.printStackTrace();
		}
		return listaProduto;
	}

	// M�todo para listar o Historico do pre�o dos servi�os
		
		/**
		 * M�todo para listar o Historico do pre�o dos servi�os.
		 * 
		 * @param Connection con
		 * @param HttpServletRequest request
		 * @param HttpServletResponse response
		 * @return List listaHistProd 
		 * @throws ServletException
		 * @throws IOException
		 */
	
		protected List<Hist_Preco> listarHistProduto(Connection con,
				HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {
			List<Hist_Preco> listaHistProd = null;
			try {
				listaHistProd = Hist_PrecoBO.listarHistProd(con);
			} catch (SQLException e) {
				request.setAttribute(
						"msg_Falha",
						"Falha no banco de dados, estamos trabalhando para resolver isto o mais r�pido poss�vel!");
				RequestDispatcher rd = request
						.getRequestDispatcher("pagina_sucesso_falha.jsp");
				rd.forward(request, response);
				e.printStackTrace();
			} catch (Excecao e) {
				e.printStackTrace();
			}
			return listaHistProd;
		}
	
	// M�todo para listar o Historico do pre�o dos servi�os
				
	/**
	 * M�todo para listar o Historico do pre�o dos servi�os.
	 * 
	 * @param Connection con
	 * @param HttpServletRequest request
	 * @param HttpServletResponse response
	 * @return List listaHistServ 
	 * @throws ServletException
	 * @throws IOException
	 */
		
	protected List<Hist_Preco> listarHistServico(Connection con,
			HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<Hist_Preco> listaHistServ = null;
		try {
			listaHistServ = Hist_PrecoBO.listarHistServ(con);
		} catch (SQLException e) {
			request.setAttribute(
					"msg_Falha",
					"Falha no banco de dados, estamos trabalhando para resolver isto o mais r�pido poss�vel!");
			RequestDispatcher rd = request
					.getRequestDispatcher("pagina_sucesso_falha.jsp");
			rd.forward(request, response);
			e.printStackTrace();
		} catch (Excecao e) {
			e.printStackTrace();
		}
		return listaHistServ;
	}

	// M�todo para pesquisar Produto-Servico atrav�s da descri��o
	
	/**
	 * M�todo para pesquisar Produto-Servico atrav�s da descri��o.
	 * 
	 * @param Connection con
	 * @param HttpServletRequest request
	 * @param HttpServletResponse response
	 * @return Produto_Servico prod_serv
	 * @throws ServletException
	 * @throws IOException
	 */
	
	protected Produto_Servico pesquisarProd_Serv(Connection con,
			HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Produto_Servico prod_serv = new Produto_Servico();
		String ds_ProdServ = request.getParameter("prodserv");
		try {
			prod_serv = Produto_ServicoBO.pesquisarProd_Serv(con, ds_ProdServ);
		} catch (Excecao e) {
			e.printStackTrace();
		} catch (SQLException e) {
			request.setAttribute(
					"msg_Falha",
					"Falha no banco de dados, estamos trabalhando para resolver isto o mais r�pido poss�vel!");
			RequestDispatcher rd = request
					.getRequestDispatcher("pagina_sucesso_falha.jsp");
			rd.forward(request, response);
			e.printStackTrace();
		}
		return prod_serv;
	}

	// M�todo para pesquisar o c�digo da hospedagem atrav�s do cpf do cliente
		
	/**
	 * M�todo para pesquisar o c�digo da hospedagem atrav�s do cpf do cliente.
	 * 
	 * @param Connection con
	 * @param HttpServletRequest request
	 * @param HttpServletResponse response
	 * @return int hosp.getCodigo() 
	 * @throws ServletException
	 * @throws IOException
	 * @throws Excecao
	 * @throws SQLException
	 */
	
	protected int pesquisarCodHospedagem(Connection con,
			HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException, Excecao, SQLException {
		Hospedagem hosp = new Hospedagem();
		String cpfStr = request.getParameter("cpf-cliente");
		String cpfLong = cpfStr.replace(".", "");
		cpfStr = cpfLong.replace("-", "");
		long cpfCliente = Long.parseLong(cpfStr);
		hosp.setCodigo(HospedagemBO.pesquisarCodHospedagem(con, cpfCliente));
		if (hosp.getCodigo() == 0) {
			request.setAttribute("msg_Falha",
					"N�o existem hospedagens cadastradas com o CPF deste cliente!");
			RequestDispatcher rd = request
					.getRequestDispatcher("pagina_sucesso_falha.jsp");
			rd.forward(request, response);
		}
		return hosp.getCodigo();
	}

	//M�todo que exclui um consumo atrav�s do c�digo
		
	/**
	 * M�todo que exclui um consumo atrav�s do c�digo.
	 * 
	 * @param Connection con
	 * @param HttpServletRequest request 
	 * @param HttpServletResponse response
	 * @return String mensagem
	 * @throws ServletException
	 * @throws IOException
	 */
	
	protected String excluirConsumo(Connection con,
			HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int codigo = Integer.parseInt(request.getParameter("cod-consumo"));
		String mensagem = "";
		try {
			mensagem = ConsumoBO.excluirConsumo(con, codigo);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Excecao e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return mensagem;
	}
	
	// M�todo para atualizar o consumo atrav�s do c�digo
		
	/**
	 * M�todo para atualizar o consumo atrav�s do c�digo.
	 * 
	 * @param Connection con
	 * @param HttpServletRequest request
	 * @param HttpServletResponse response
	 * @return String mensagem
	 * @throws ServletException
	 * @throws IOException
	 */
	
	protected String atualizarConsumo(Connection con,
			HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Variaveis auxiliares (Objetos)
				Hospedagem hosp = new Hospedagem();
				Consumo consumo = new Consumo();
				Produto_Servico prod_serv = new Produto_Servico();
				Funcionario func = new Funcionario();
				;
				try {
					con.setAutoCommit(false);
				} catch (SQLException e) {
					request.setAttribute(
							"msg_Falha",
							"Falha no banco de dados, estamos trabalhando para resolver isto o mais r�pido poss�vel!");
					RequestDispatcher rd = request
							.getRequestDispatcher("pagina_sucesso_falha.jsp");
					rd.forward(request, response);
					e.printStackTrace();
				}
				// Preenchendo os objetos

				// Hospedagem
				int codigoHospedagem = Integer.parseInt(request
						.getParameter("cod-hosp"));
				hosp.setCodigo(codigoHospedagem);

				// Funcion�rio
				func = this.pesquisarFuncionario(con, request, response);

				// Produto-Servico
				prod_serv = this.pesquisarProd_Serv(con, request, response);

				// Consumo
				int codigoConsumo = Integer.parseInt(request.getParameter("cod-consumo"));
				int quantidade = Integer.parseInt(request.getParameter("quantidade"));
				consumo.setFuncionario(func);
				consumo.setHospedagem(hosp);
				consumo.setProduto_Servico(prod_serv);
				consumo.setQuantidade(quantidade);
				consumo.setCodigo(codigoConsumo);
				String mensagem = "";
				try {
					mensagem = ConsumoBO.atualizarConsumo(con, consumo.getCodigo(), consumo);
				} catch (Excecao e) {
					e.printStackTrace();
				} catch (SQLException e) {
					request.setAttribute(
							"msg_Falha",
							"Falha no banco de dados, estamos trabalhando para resolver isto o mais r�pido poss�vel!");
					RequestDispatcher rd = request
							.getRequestDispatcher("pagina_sucesso_falha.jsp");
					rd.forward(request, response);
					e.printStackTrace();
				}
				try {
					con.setAutoCommit(true);
					con.commit();
				} catch (SQLException e) {
					request.setAttribute(
							"msg_Falha",
							"Falha no banco de dados, estamos trabalhando para resolver isto o mais r�pido poss�vel!");
					RequestDispatcher rd = request
							.getRequestDispatcher("pagina_sucesso_falha.jsp");
					rd.forward(request, response);
					e.printStackTrace();
				}
				return mensagem;
	}
	
	// M�todo para listar todos os consumos feitos pelo cliente atrav�s do
	// c�digo da hospedagem
	
	
	/**
	 * M�todo para listar todos os consumos feitos pelo cliente atrav�s do c�digo da hospedagem.
	 * 
	 * @param Connection con
	 * @param HttpServletRequest request
	 * @param HttpServletResponse response
	 * @return List listaConsumo 
	 * @throws ServletException
	 * @throws IOException
	 */
	
	protected List<Consumo> listarConsumo(Connection con,
			HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int cod_Hospedagem = Integer.parseInt(request.getParameter("cod-hosp"));
		List<Consumo> listaConsumo = null;
		try {
			listaConsumo = ConsumoBO.listarConsumo(con, cod_Hospedagem);
		} catch (SQLException e) {
			request.setAttribute(
					"msg_Falha",
					"Falha no banco de dados, estamos trabalhando para resolver isto o mais r�pido poss�vel!");
			RequestDispatcher rd = request
					.getRequestDispatcher("pagina_sucesso_falha.jsp");
			rd.forward(request, response);
			e.printStackTrace();
		} catch (Excecao e) {
			e.printStackTrace();
		}
		return listaConsumo;
	}

	// M�todo para registrar o consumo
		
	/**
	 * M�todo para registrar o consumo.
	 * 
	 * @param Connection con
	 * @param HttpServletRequest request
	 * @param HttpServletResponse response
	 * @return String mensagem
	 * @throws ServletException
	 * @throws IOException
	 */
	
	protected String registrarConsumo(Connection con,
			HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Variaveis auxiliares (Objetos)
		Hospedagem hosp = new Hospedagem();
		Consumo consumo = new Consumo();
		Produto_Servico prod_serv = new Produto_Servico();
		Funcionario func = new Funcionario();
		;
		try {
			con.setAutoCommit(false);
		} catch (SQLException e) {
			request.setAttribute(
					"msg_Falha",
					"Falha no banco de dados, estamos trabalhando para resolver isto o mais r�pido poss�vel!");
			RequestDispatcher rd = request
					.getRequestDispatcher("pagina_sucesso_falha.jsp");
			rd.forward(request, response);
			e.printStackTrace();
		}
		// Preenchendo os objetos

		// Hospedagem
		int codigoHospedagem = Integer.parseInt(request
				.getParameter("cod-hosp"));
		hosp.setCodigo(codigoHospedagem);

		// Funcion�rio
		func = this.pesquisarFuncionario(con, request, response);

		// Produto-Servico
		prod_serv = this.pesquisarProd_Serv(con, request, response);

		// Consumo
		int quantidade = Integer.parseInt(request.getParameter("quantidade"));
		consumo.setFuncionario(func);
		consumo.setHospedagem(hosp);
		consumo.setProduto_Servico(prod_serv);
		consumo.setQuantidade(quantidade);
		String mensagem = "";
		try {
			mensagem = ConsumoBO.registrar(con, consumo);
		} catch (Excecao e) {
			e.printStackTrace();
		} catch (SQLException e) {
			request.setAttribute(
					"msg_Falha",
					"Falha no banco de dados, estamos trabalhando para resolver isto o mais r�pido poss�vel!");
			RequestDispatcher rd = request
					.getRequestDispatcher("pagina_sucesso_falha.jsp");
			rd.forward(request, response);
			e.printStackTrace();
		}
		try {
			con.setAutoCommit(true);
			con.commit();
		} catch (SQLException e) {
			request.setAttribute(
					"msg_Falha",
					"Falha no banco de dados, estamos trabalhando para resolver isto o mais r�pido poss�vel!");
			RequestDispatcher rd = request
					.getRequestDispatcher("pagina_sucesso_falha.jsp");
			rd.forward(request, response);
			e.printStackTrace();
		}
		return mensagem;
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 *      
	 * M�todo void que recebe os seguintes par�metros:
	 * 
	 * @param HttpServletRequest request
	 * @param HttpServletResponse response    
	 * @throws ServletException
	 * @throws IOException   	   
	 *      
	 */
	
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// Conex�o
		Connection con = null;
		String usuario = "blablabla";
		String senha = "12345";
		try {
			con = ConexaoFactory.controlarInstancia()
					.getConexao(usuario, senha);
			// Chamada de m�todos
			String input_Auxiliar = request.getParameter("input-Auxiliar");
			if (input_Auxiliar.equals("listaProd_Serv")) {
				// M�todo para listar todos os Produtos/Servi�os
				List<Produto_Servico> listaProduto, listaServico;
				listaProduto = this.listarProduto(con, request, response);
				listaServico = this.listarServico(con, request, response);
				// Criando atributo para recuperar na p�gina
				// "registrar-consumo.jsp"
				request.setAttribute("listaProduto", listaProduto);
				request.setAttribute("listaServico", listaServico);
				// Redirecionando tudo para a p�gina "registrar-consumo.jsp"
				RequestDispatcher rd = request
						.getRequestDispatcher("registrar-consumo.jsp");
				rd.forward(request, response);
				
			} 
			else if (input_Auxiliar.equals("listaProd_Serv2")) {
				// M�todo para listar todos os Produtos/Servi�os
				List<Produto_Servico> listaProduto, listaServico;
				listaProduto = this.listarProduto(con, request, response);
				listaServico = this.listarServico(con, request, response);
				// Criando atributo para recuperar na p�gina
				// "registrar-consumo.jsp"
				request.setAttribute("listaProduto", listaProduto);
				request.setAttribute("listaServico", listaServico);
				// Redirecionando tudo para a p�gina "registrar-consumo.jsp"
				RequestDispatcher rd = request
						.getRequestDispatcher("atualizarConsumo.jsp");
				rd.forward(request, response);
			}
			else if (input_Auxiliar.equals("listaHistorico")) {
				List<Hist_Preco> listaProd = this.listarHistProduto(con, request, response);
				List<Hist_Preco> listaServ = this.listarHistServico(con, request, response);
				//Criando atributos para recuperar na p�gina "historico.jsp"
				request.setAttribute("listaHistProduto", listaProd);
				request.setAttribute("listaHistServico", listaServ);
				// Redirecionando tudo para a p�gina "historico.jsp"
				RequestDispatcher rd = request
						.getRequestDispatcher("historico.jsp");
				rd.forward(request, response);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally{
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 *      
	 * M�todo void que recebe os seguintes par�metros:
	 * 
	 * @param HttpServletRequest request
	 * @param HttpServletResponse response    
	 * @throws ServletException
	 * @throws IOException     
	 *      
	 */
	
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// Conex�o
		String usuario = "blablabla";
		String senha = "12345";
		Connection con = null;
		try {
			con = ConexaoFactory.controlarInstancia()
					.getConexao(usuario, senha);
			// Chamada de m�todos
			String input_Auxiliar = request.getParameter("input-Auxiliar");
			if (input_Auxiliar.equals("registrarConsumo")) {
				// Chamando o metodo para registrar o consumo
				String mensagem = this.registrarConsumo(con, request, response);
				// Criando atributo que ir� confirmar o sucesso
				// do registro de consumo

				request.setAttribute("msgRegistrarConsumo", mensagem);
				// Chamando o m�todo para listar os consumo do cliente
				List<Consumo> listaConsumo = this.listarConsumo(con, request,
						response);
				// Criando atributo para ser usado na listagem dos consumos
				request.setAttribute("listaConsumos", listaConsumo);
				// Redirecionando tudo para a p�gina "pagina_sucesso_falha.jsp"
				RequestDispatcher rd = request
						.getRequestDispatcher("pagina_sucesso_falha.jsp");
				rd.forward(request, response);
			} else if (input_Auxiliar.equals("pesquisarCodHospedagem")) {
				try {
					// Obtendo codigo da hospedagem para recuperar na p�gina
					// "registrar-consumo.jsp"
					int codigoHosp = this.pesquisarCodHospedagem(con, request,
							response);
					// M�todo para listar todos os Produtos/Servi�os
					List<Produto_Servico> listaProduto, listaServico;
					listaProduto = this.listarProduto(con, request, response);
					listaServico = this.listarServico(con, request, response);
					request.setAttribute("listaProduto", listaProduto);
					request.setAttribute("listaServico", listaServico);
					request.setAttribute("codigoHosp", codigoHosp);

					RequestDispatcher rd = request
							.getRequestDispatcher("registrar-consumo.jsp");
					rd.forward(request, response);
				} catch (Excecao e) {
					e.printStackTrace();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			else if(input_Auxiliar.equals("excluirConsumo")){
				String mensagem = this.excluirConsumo(con, request, response);
				request.setAttribute("msgExcluirConsumo", mensagem);
				RequestDispatcher rd = request
						.getRequestDispatcher("excluirConsumo.jsp");
				rd.forward(request, response);
			}
			else if(input_Auxiliar.equals("atualizarConsumo")){
				String mensagem = this.atualizarConsumo(con, request, response);
				request.setAttribute("msgAtualizarConsumo", mensagem);
				RequestDispatcher rd = request
						.getRequestDispatcher("atualizarConsumo.jsp");
				rd.forward(request, response);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally{
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
