/**
 * 
 */
package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;

import br.com.fiap.bean.Funcionario;

/**
 * Classe DAO para Funcionario.
 * 
 * @author Raphael de Melo Silva
 * @author Ricardo Antonelli
 *  
 */

public class FuncionarioDAO {

	//Atributos 
	private PreparedStatement estrutura;
	private ResultSet resultado;
	private String sql;
	private Calendar cal;
	
	//Métodos
	
	//Método que pesquisa o funcionario através do codigo
	
	/**
	 * Método que pesquisa o funcionario através do codigo.
	 * 
	 * @param Connection con
	 * @param int codigoFunc
	 * @return Funcionario funcionario
	 * @throws SQLException
	 */
	
	public Funcionario pesquisarFuncionario(Connection con, int codigoFunc) throws SQLException{
		//Variavel auxiliar
		Funcionario funcionario = new Funcionario();
		//Script sql
		sql = "SELECT FUNC.cd_funcionario, PES.nm_pessoa, FUNC.dt_admissao, FUNC.ds_cargo "
				+ "FROM T_AM_GRR_FUNCIONARIO FUNC JOIN T_AM_GRR_PESSOA PES ON PES.cd_pessoa = "
				+ "FUNC.cd_funcionario WHERE FUNC.cd_funcionario = ?";
		//Preparando estrutura
		estrutura = con.prepareStatement(sql);
		//Atribuindo valores
		estrutura.setInt(1, codigoFunc);
		//Gerando resultado
		resultado = estrutura.executeQuery();
		if(resultado.next()){
			funcionario.setCargo(resultado.getString("ds_cargo"));
			funcionario.setCodigo(resultado.getInt("cd_funcionario"));
			cal = Calendar.getInstance();
			cal.setTime(resultado.getDate("dt_admissao"));
			funcionario.setData_Admissao(cal);
			funcionario.setNome(resultado.getString("nm_pessoa"));
		}
		//Fechando resultado e estrutura
		resultado.close();
		estrutura.close();
		return funcionario;
	}
}
