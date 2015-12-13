/**
 * 
 */
package br.com.fiap.bo;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.fiap.bean.Produto_Servico;
import br.com.fiap.dao.Produto_ServicoDAO;
import br.com.fiap.excecao.Excecao;

/**
 * Classe BO para Produtos e Serviços.
 * 
 * @author Raphael de Melo Silva
 * @author Ricardo Antonelli
 *  
 */
public abstract class Produto_ServicoBO {

	//Objeto DAO
	public static Produto_ServicoDAO 
	prod_ServDao = new Produto_ServicoDAO();;
	
	//Métodos
	//Método que pesquisa um objeto Produto_Servico através da descricao
		
	/**
	 * Método que pesquisa um objeto Produto_Servico através da descricao.
	 * 
	 * @param Connection con
	 * @param String descricaoProd_Serv
	 * @return Produto_Servico prod_serv
	 * @throws Excecao
	 * @throws SQLException
	 */
	
	public static Produto_Servico pesquisarProd_Serv(Connection con,
			String descricaoProd_Serv) throws Excecao, SQLException{
		if(descricaoProd_Serv.equals("")){
			throw new Excecao("Descrição do produto / serviço nulo");
		} 
		if(con == null){
			throw new Excecao("Conexao com banco de dados está com problemas");
		}
		Produto_Servico prod_serv = new Produto_Servico();
		prod_serv = prod_ServDao.pesquisarProd_Serv(con, descricaoProd_Serv);
		if(prod_serv == null){
			throw new Excecao("Produto ou Serviço inexistente!");
		}
		return prod_serv;
	}
	
	//Método que lista todos os Produtos 
		
	/**
	 * Método que lista todos os Produtos. 
	 * 
	 * @param Connection con
	 * @return List<Produto_Servico> listaProduto
	 * @throws SQLException
	 * @throws Excecao
	 */
	
	public static List<Produto_Servico> listarProduto(Connection con) throws SQLException, Excecao{
		if(con == null){
			throw new Excecao("Conexao com banco de dados está tendo problemas");
		}
		List<Produto_Servico> listaProduto = prod_ServDao.listarProduto(con);
		if(listaProduto == null){
			throw new Excecao("Lista de Produtos vazia!");
		}
		return listaProduto;
	}
	
	//Método que lista todos os Serviços
		
		/**
		 * Método que lista todos os Serviços.
		 * 
		 * @param Connection con
		 * @return List<Produto_Servico> listaServico
		 * @throws SQLException
		 * @throws Excecao
		 */
	
		public static List<Produto_Servico> listarServicos(Connection con) throws SQLException, Excecao{
			if(con == null){
				throw new Excecao("Conexao com banco de dados está tendo problemas");
			}
			List<Produto_Servico> listaServico = prod_ServDao.listarServicos(con);
			if(listaServico == null){
				throw new Excecao("Lista de Serviços vazia!");
			}
			return listaServico;
		}
}
