/**
 * 
 */
package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.fiap.bean.Hospedagem;

/**
 * Classe DAO para Hospedagem.
 * 
 * @author Raphael de Melo Silva
 * @author Ricardo Antonelli
 *  
 */

public class HospedagemDAO {

	//Atributos 
	private PreparedStatement estrutura;
	private ResultSet resultado;
	private String sql;
	
	//Métodos 
	
	//Método para pesquisar codigo da hospedagem através do cpf do cliente
	
	
	/**
	 * Método para pesquisar codigo da hospedagem através do cpf do cliente.
	 * 
	 * @param Connection con
	 * @param cpfCliente
	 * @return int hospedagem.getCodigo()
	 * @throws SQLException
	 */
	
	public int pesquisarCodHospedagem(Connection con, long cpfCliente) throws SQLException{
		//Variável auxiliar
		Hospedagem hospedagem = new Hospedagem();
		//Script sql
		sql = "SELECT HOSP.cd_hospedagem FROM T_AM_GRR_HOSPEDAGEM HOSP "
				+ "JOIN T_AM_GRR_CLIENTE CLI ON CLI.cd_cliente = HOSP.cd_cliente"
				+ " WHERE CLI.nr_cpf = ? ORDER BY HOSP.cd_hospedagem DESC";
		//Preparando estrutura
		estrutura = con.prepareStatement(sql);
		//Atribuindo valores
		estrutura.setLong(1, cpfCliente);
		//Gerando resultado
		resultado = estrutura.executeQuery();
		if(resultado.next()){
			hospedagem.setCodigo(resultado.getInt("cd_hospedagem"));
		}
		//Fechando estrutura e resultado
		resultado.close();
		estrutura.close();
		return hospedagem.getCodigo();
	}
	

}
