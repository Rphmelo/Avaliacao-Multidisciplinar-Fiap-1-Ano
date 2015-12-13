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
 * Classe BO para Produtos e Servi�os.
 * 
 * @author Raphael de Melo Silva
 * @author Ricardo Antonelli
 *  
 */
public abstract class Produto_ServicoBO {

	//Objeto DAO
	public static Produto_ServicoDAO 
	prod_ServDao = new Produto_ServicoDAO();;
	
	//M�todos
	//M�todo que pesquisa um objeto Produto_Servico atrav�s da descricao
		
	/**
	 * M�todo que pesquisa um objeto Produto_Servico atrav�s da descricao.
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
			throw new Excecao("Descri��o do produto / servi�o nulo");
		} 
		if(con == null){
			throw new Excecao("Conexao com banco de dados est� com problemas");
		}
		Produto_Servico prod_serv = new Produto_Servico();
		prod_serv = prod_ServDao.pesquisarProd_Serv(con, descricaoProd_Serv);
		if(prod_serv == null){
			throw new Excecao("Produto ou Servi�o inexistente!");
		}
		return prod_serv;
	}
	
	//M�todo que lista todos os Produtos 
		
	/**
	 * M�todo que lista todos os Produtos. 
	 * 
	 * @param Connection con
	 * @return List<Produto_Servico> listaProduto
	 * @throws SQLException
	 * @throws Excecao
	 */
	
	public static List<Produto_Servico> listarProduto(Connection con) throws SQLException, Excecao{
		if(con == null){
			throw new Excecao("Conexao com banco de dados est� tendo problemas");
		}
		List<Produto_Servico> listaProduto = prod_ServDao.listarProduto(con);
		if(listaProduto == null){
			throw new Excecao("Lista de Produtos vazia!");
		}
		return listaProduto;
	}
	
	//M�todo que lista todos os Servi�os
		
		/**
		 * M�todo que lista todos os Servi�os.
		 * 
		 * @param Connection con
		 * @return List<Produto_Servico> listaServico
		 * @throws SQLException
		 * @throws Excecao
		 */
	
		public static List<Produto_Servico> listarServicos(Connection con) throws SQLException, Excecao{
			if(con == null){
				throw new Excecao("Conexao com banco de dados est� tendo problemas");
			}
			List<Produto_Servico> listaServico = prod_ServDao.listarServicos(con);
			if(listaServico == null){
				throw new Excecao("Lista de Servi�os vazia!");
			}
			return listaServico;
		}
}
