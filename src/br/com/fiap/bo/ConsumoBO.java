/**
 * 
 */
package br.com.fiap.bo;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.fiap.bean.Consumo;
import br.com.fiap.dao.ConsumoDAO;
import br.com.fiap.excecao.Excecao;

/**
 * Classe BO para Consumo.
 * 
 * @author Raphael de Melo Silva
 * @author Ricardo Antonelli
 * 
 */

public abstract class ConsumoBO {

	// Objeto DAO
	public static ConsumoDAO consumodao = new ConsumoDAO();

	// Métodos
	/**
	 * Método que registra um consumo.
	 * 
	 * @param Connection con
	 * @param Consumo consumo
	 * @return String mensagem
	 * @throws Excecao
	 * @throws SQLException
	 */

	public static String registrar(Connection con, Consumo consumo)
			throws Excecao, SQLException {
		if (consumo.getProduto_Servico().getCodigo() <= 0) {
			throw new Excecao("Código de Produto-Serviço inválido");
		}
		if (consumo.getFuncionario().getCodigo() <= 0) {
			throw new Excecao("Código do Funcionário inválido");
		}
		if (consumo.getHospedagem().getCodigo() <= 0) {
			throw new Excecao("Código de Hospedagem inválido!");
		}
		if (consumo.getQuantidade() <= 0) {
			throw new Excecao(
					"A quantidade de consumo deve ser maior que zero!");
		}
		if (con == null) {
			throw new Excecao("Conexao com banco de dados está tendo problemas");
		}
		String mensagem = consumodao.registrar(con, consumo);
		return mensagem;
	}

	/**
	 * Método que lista os consumos atraves do código da hospedagem
	 * 
	 * @param Connection
	 *            con
	 * @param int cod_Hospedagem
	 * @return List<Consumo> listaConsumo
	 * @throws SQLException
	 * @throws Excecao
	 */
	public static List<Consumo> listarConsumo(Connection con, int cod_Hospedagem)
			throws SQLException, Excecao {
		if (cod_Hospedagem <= 0) {
			throw new Excecao("Código da hospedagem inválido!");
		}
		if (con == null) {
			throw new Excecao("Conexao com banco de dados está tendo problemas");
		}
		List<Consumo> listaConsumo = consumodao.listarConsumo(con,
				cod_Hospedagem);
		if (listaConsumo == null) {
			throw new Excecao("Lista de consumo vazia!");
		}
		return listaConsumo;
	}

	/**
	 * Método para atualizar o consumo através do código.
	 * 
	 * @param Connection
	 *            con
	 * @param int cod_Consumo
	 * @param Consumo
	 *            novoConsumo
	 * @return String mensagem
	 * @throws SQLException
	 * @throws Excecao
	 */
	public static String atualizarConsumo(Connection con, int cod_Consumo,
			Consumo novoConsumo) throws SQLException, Excecao {
		if (cod_Consumo < 0) {
			throw new Excecao("Código de consumo inválido!");
		}
		else if(cod_Consumo == 0){
			return "Código de consumo nulo, por favor, digite um código válido!";
		}
		if (novoConsumo.getProduto_Servico().getCodigo() <= 0) {
			throw new Excecao("Código de Produto-Serviço inválido");
		}
		if (novoConsumo.getFuncionario().getCodigo() <= 0) {
			throw new Excecao("Código do Funcionário inválido");
		}
		if (novoConsumo.getHospedagem().getCodigo() <= 0) {
			throw new Excecao("Código de Hospedagem inválido!");
		}
		if (novoConsumo.getQuantidade() <= 0) {
			throw new Excecao("A quantidade de consumo deve ser maior que zero!");
		}
		if (con == null) {
			throw new Excecao("Conexao com banco de dados está tendo problemas");
		}
		String mensagem = consumodao.atualizarConsumo(con, cod_Consumo,
				novoConsumo);
		return mensagem;
	}

	/**
	 * Método para excluir o consumo através do código.
	 * 
	 * @param Connection con
	 * @param int cod_Consumo
	 * @return String mensagem
	 * @throws SQLException
	 * @throws Excecao 
	 */

	public static String excluirConsumo(Connection con, int cod_Consumo)
			throws SQLException, Excecao {
		if (cod_Consumo < 0) {
			throw new Excecao("Código de consumo inválido!");
		}
		else if(cod_Consumo == 0){
			return "Código de consumo nulo, por favor, digite um código válido!";
		}
		if (con == null) {
			throw new Excecao("Conexao com banco de dados está tendo problemas");
		}
		String mensagem = consumodao.excluirConsumo(con, cod_Consumo);
		return mensagem;
	}

}
