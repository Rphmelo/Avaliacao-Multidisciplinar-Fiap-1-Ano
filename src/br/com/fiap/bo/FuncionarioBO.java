/**
 * 
 */
package br.com.fiap.bo;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.fiap.bean.Funcionario;
import br.com.fiap.dao.FuncionarioDAO;
import br.com.fiap.excecao.Excecao;

/**
 * Classe BO para Funcionario.
 * 
 * @author Raphael de Melo Silva
 * @author Ricardo Antonelli
 *  
 */

public abstract class FuncionarioBO {
	//Objeto DAO
	public static FuncionarioDAO funcionariodao = 
					new FuncionarioDAO();
	//M�todos
	
	/**
	 * M�todo que realiza a pesquisa de um funcion�rio.
	 * 
	 * @param Connection con
	 * @param  int codigoFunc
	 * @return Funcionario func
	 * @throws Excecao
	 * @throws SQLException
	 */
	
	public static Funcionario pesquisarFuncionario
			(Connection con, int codigoFunc) throws Excecao, SQLException{
		if(codigoFunc <= 0){
			throw new Excecao("C�digo de funcion�rio n�o existe, digite um c�digo v�lido!");
		}
		if(con == null){
			throw new Excecao("Conexao com banco de dados est� tendo problemas");
		}
		Funcionario func = new Funcionario();
		func = funcionariodao.pesquisarFuncionario(con, codigoFunc);
		if(func == null){
			throw new Excecao("O funcion�rio n�o existe. Digite um c�digo de funcion�rio existente.");
		}
		return func;
	}

}
