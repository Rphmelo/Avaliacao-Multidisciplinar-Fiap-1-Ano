/**
 * 
 */
package br.com.fiap.bo;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.fiap.bean.Hist_Preco;
import br.com.fiap.dao.Hist_PrecoDAO;
import br.com.fiap.excecao.Excecao;

/**
 * Classe BO para Histórico de Preços.
 * 
 * @author Raphael de Melo Silva
 * @author Ricardo Antonelli
 *  
 */

public abstract class Hist_PrecoBO {
	//Objeto DAO
	public static Hist_PrecoDAO historicoDao = new Hist_PrecoDAO();
	
	//Métodos
	// Método que lista todos os historicos de preços de todos os Serviços
	
	
	/**
	 * Método que lista todos os historicos de preços de todos os Serviços
	 * 
	 * @param Connection con
	 * @return List<Hist_Preco> listaHistorico
	 * @throws SQLException
	 * @throws Excecao
	 */
	
	public static List<Hist_Preco> listarHistServ(Connection con) throws SQLException, Excecao{
		if(con == null){
			throw new Excecao("Conexao com banco de dados está tendo problemas");
		}
		List<Hist_Preco> listaHistorico = historicoDao.listarHistServ(con); 
		if(listaHistorico == null){
			throw new Excecao("A Lista de históricos de preços está vazia");
		}
		return listaHistorico;
	}
	
	// Método que lista todos os historicos de preços de todos os Produtos
	
	
	/**
	 * Método que lista todos os historicos de preços de todos os Produtos
	 * 
	 * @param Connection con
	 * @return List<Hist_Preco> listaHistorico
	 * @throws SQLException
	 * @throws Excecao
	 */
	
	public static List<Hist_Preco> listarHistProd(Connection con) throws SQLException, Excecao{
		if(con == null){
			throw new Excecao("Conexao com banco de dados está tendo problemas");
		}
		List<Hist_Preco> listaHistorico = historicoDao.listarHistProd(con); 
		if(listaHistorico == null){
			throw new Excecao("A Lista de históricos de preços está vazia");
		}
		return listaHistorico;
	}
}
