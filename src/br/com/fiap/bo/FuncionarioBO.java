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
	//Métodos
	
	/**
	 * Método que realiza a pesquisa de um funcionário.
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
			throw new Excecao("Código de funcionário não existe, digite um código válido!");
		}
		if(con == null){
			throw new Excecao("Conexao com banco de dados está tendo problemas");
		}
		Funcionario func = new Funcionario();
		func = funcionariodao.pesquisarFuncionario(con, codigoFunc);
		if(func == null){
			throw new Excecao("O funcionário não existe. Digite um código de funcionário existente.");
		}
		return func;
	}

}
