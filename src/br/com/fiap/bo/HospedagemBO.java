/**
 * 
 */
package br.com.fiap.bo;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.fiap.bean.Hospedagem;
import br.com.fiap.dao.HospedagemDAO;
import br.com.fiap.excecao.Excecao;
/**
 * Classe BO para Hospedagem.
 * 
 * @author Raphael de Melo Silva
 * @author Ricardo Antonelli
 *  
 */

public abstract class HospedagemBO {
	//Objeto DAO
	public static HospedagemDAO hospDao = new HospedagemDAO();
	//Métodos
	
		
	/**
	 * Método que pesquisa o Código da Hospedagem.
	 * 
	 * @param Connection con
	 * @param long cpfCliente
	 * @return int hosp.getCodigo() 
	 * @throws Excecao
	 * @throws SQLException
	 */
	
	public static int pesquisarCodHospedagem(Connection con, long cpfCliente) throws Excecao, SQLException{
		if(String.valueOf(cpfCliente).length() != 11){
			throw new Excecao("CPF inválido. Digite um cpf com 11 digitos");
		}
		if(String.valueOf(cpfCliente).equals("")){
			throw new Excecao("CPF nulo");
		}
		if(con == null){
			throw new Excecao("Conexao com banco de dados está tendo problemas, por favor, aguarde a normalização.");
		}
		Hospedagem hosp = new Hospedagem();
		hosp.setCodigo(hospDao.pesquisarCodHospedagem(con, cpfCliente));
		return hosp.getCodigo();
		
	}
	
}
