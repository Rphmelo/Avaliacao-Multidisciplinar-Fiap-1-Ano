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
 * Classe BO para Hist�rico de Pre�os.
 * 
 * @author Raphael de Melo Silva
 * @author Ricardo Antonelli
 *  
 */

public abstract class Hist_PrecoBO {
	//Objeto DAO
	public static Hist_PrecoDAO historicoDao = new Hist_PrecoDAO();
	
	//M�todos
	// M�todo que lista todos os historicos de pre�os de todos os Servi�os
	
	
	/**
	 * M�todo que lista todos os historicos de pre�os de todos os Servi�os
	 * 
	 * @param Connection con
	 * @return List<Hist_Preco> listaHistorico
	 * @throws SQLException
	 * @throws Excecao
	 */
	
	public static List<Hist_Preco> listarHistServ(Connection con) throws SQLException, Excecao{
		if(con == null){
			throw new Excecao("Conexao com banco de dados est� tendo problemas");
		}
		List<Hist_Preco> listaHistorico = historicoDao.listarHistServ(con); 
		if(listaHistorico == null){
			throw new Excecao("A Lista de hist�ricos de pre�os est� vazia");
		}
		return listaHistorico;
	}
	
	// M�todo que lista todos os historicos de pre�os de todos os Produtos
	
	
	/**
	 * M�todo que lista todos os historicos de pre�os de todos os Produtos
	 * 
	 * @param Connection con
	 * @return List<Hist_Preco> listaHistorico
	 * @throws SQLException
	 * @throws Excecao
	 */
	
	public static List<Hist_Preco> listarHistProd(Connection con) throws SQLException, Excecao{
		if(con == null){
			throw new Excecao("Conexao com banco de dados est� tendo problemas");
		}
		List<Hist_Preco> listaHistorico = historicoDao.listarHistProd(con); 
		if(listaHistorico == null){
			throw new Excecao("A Lista de hist�ricos de pre�os est� vazia");
		}
		return listaHistorico;
	}
}
