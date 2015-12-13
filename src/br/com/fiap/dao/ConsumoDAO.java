/**
 * 
 */
package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.fiap.bean.Cliente;
import br.com.fiap.bean.Consumo;
import br.com.fiap.bean.Funcionario;
import br.com.fiap.bean.Hospedagem;
import br.com.fiap.bean.Produto_Servico;
import br.com.fiap.bean.Quarto;

/**
 * Classe DAO para Consumo.
 * 
 * @author Raphael de Melo Silva
 * @author Ricardo Antonelli
 *  
 */

public class ConsumoDAO {
	
	//Atributos 
	private PreparedStatement estrutura;
	private ResultSet resultado;
	private String sql;
	private Calendar cal;
	
	//Métodos
	/**
	 * Método para registrar o Consumo.
	 * 
	 * @param Connection con
	 * @param Consumo consumo
	 * @return String registrar
	 * @throws SQLException
	 */
	public String registrar
				(Connection con, Consumo consumo) throws SQLException{
		//Script sql
		sql = "INSERT INTO T_AM_GRR_CONSUMO (cd_consumo, cd_hospedagem,"
				+ "cd_pessoa, cd_tipo_servico, dt_consumo, "
				+ "qt_consumo) VALUES(SQ_AM_HBV_CONSUMO.NEXTVAL, ?, ?, ?, SYSDATE, ?)";
		//Preparando estrutura
		estrutura = con.prepareStatement(sql);
		//Atribuindo valores
		estrutura.setInt(1, consumo.getHospedagem().getCodigo());
		estrutura.setInt(2, consumo.getFuncionario().getCodigo());
		estrutura.setInt(3, consumo.getProduto_Servico().getCodigo());
		estrutura.setInt(4, consumo.getQuantidade());
		estrutura.execute();
		//Fechando estrutura
		estrutura.close();
		return "Consumo cadastrado com sucesso!";
	}

	/**
	 * Método para listar consumos a partir do código da hospedagem.
	 * 
	 * @param Connection con
	 * @param int cod_Hospedagem
	 * @return List lista_Consumo
	 * @throws SQLException
	 */
	
	public List<Consumo> listarConsumo
				(Connection con, int cod_Hospedagem) throws SQLException{
		//Variáveis auxiliares
		List<Consumo> lista_Consumo = new ArrayList<Consumo>();
		Consumo consumo;
		Hospedagem hospedagem;
		Produto_Servico prod_serv;
		Funcionario funcionario;
		Cliente cliente;
		Quarto quarto;
		//Script sql
		sql = "SELECT CON.cd_consumo, CON.dt_consumo, CON.qt_consumo, "
				+ "HOSP.cd_hospedagem, RESQ.cd_quarto, CLI.cd_cliente, CLI.nr_cpf, "
				+ "PES2.nm_pessoa AS " + "nome_cliente" + ",PS.cd_tipo_servico, PS.ds_servico, "
				+ "PS.nr_tipo, PES1.nm_pessoa AS " + "nome_funcionario" + ", FUNC.cd_funcionario "
				+ "FROM T_AM_GRR_CONSUMO CON JOIN T_AM_GRR_HOSPEDAGEM "
				+ "HOSP ON CON.cd_hospedagem = HOSP.cd_hospedagem "
				+ "JOIN T_AM_GRR_FUNCIONARIO FUNC ON FUNC.cd_funcionario = "
				+ "CON.cd_pessoa JOIN T_AM_GRR_PESSOA PES1 ON PES1.cd_pessoa = "
				+ "FUNC.cd_funcionario JOIN T_AM_GRR_CLIENTE CLI ON CLI.cd_cliente "
				+ "= HOSP.cd_cliente JOIN T_AM_GRR_PESSOA PES2 ON PES2.cd_pessoa = "
				+ "CLI.cd_cliente JOIN T_AM_GRR_PRODUTO_SERVICO PS ON "
				+ "PS.cd_tipo_servico = CON.cd_tipo_servico JOIN T_AM_GRR_RESERVA_QUARTO RESQ "
				+ "ON RESQ.cd_quarto = HOSP.cd_quarto WHERE HOSP.cd_hospedagem = ?";
		//Preparando estrutura
		estrutura = con.prepareStatement(sql);
		//Atribuindo valores
		estrutura.setInt(1, cod_Hospedagem);
		//Gerando resultado
		resultado = estrutura.executeQuery();
		while(resultado.next()){
			consumo = new Consumo();
			hospedagem = new Hospedagem();
			prod_serv = new Produto_Servico();
			funcionario = new Funcionario();
			cliente = new Cliente();
			quarto = new Quarto();
			//Preenchendo quarto
			quarto.setCodigo(resultado.getInt("cd_quarto"));
			
			//Preenchendo hospedagem para consumo
			hospedagem.setCodigo(resultado.getInt("cd_hospedagem"));
				//Preenchendo cliente para hospedagem
				cliente.setCpf(resultado.getLong("nr_cpf"));
				cliente.setNome(resultado.getString("nome_cliente"));
				cliente.setCodigo(resultado.getInt("cd_cliente"));
			hospedagem.setCliente(cliente);
			hospedagem.setQuarto(quarto);
			
			//Preenchendo funcionario para consumo
			funcionario.setNome(resultado.getString("nome_funcionario"));
			funcionario.setCodigo(resultado.getInt("cd_funcionario"));
			
			//Preenchendo produto servico para consumo
			prod_serv.setCodigo(resultado.getInt("cd_tipo_servico"));
			prod_serv.setDescricao(resultado.getString("ds_servico"));
			prod_serv.setTipo(resultado.getByte("nr_tipo"));
			
			//Preenchendo consumo
			consumo.setCodigo(resultado.getInt("cd_consumo"));
			cal = Calendar.getInstance();
			cal.setTime(resultado.getDate("dt_consumo"));		
			consumo.setDt_Consumo(cal);
			consumo.setFuncionario(funcionario);
			consumo.setHospedagem(hospedagem);
			consumo.setProduto_Servico(prod_serv);
			consumo.setQuantidade(resultado.getInt("qt_consumo"));
			
			//Preenchendo a lista de consumos
			lista_Consumo.add(consumo);
		}
		//Fechando estrutura e resultado
		resultado.close();
		estrutura.close();
		return lista_Consumo;
	}
	
	/**
	 * Método para atualizar o consumo através do código.
	 * 
	 * @param Connection con
	 * @param int cod_Consumo
	 * @param Consumo novoConsumo
	 * @return String atualizarConsumo 
	 * @throws SQLException
	 */
	
	public String atualizarConsumo(Connection con, int cod_Consumo, 
									Consumo novoConsumo) throws SQLException{
		//Script sql
		sql = "UPDATE T_AM_GRR_CONSUMO SET cd_hospedagem = ?, cd_pessoa = ?, "
				+ "cd_tipo_servico =  ?, dt_consumo = SYSDATE, qt_consumo = ? "
				+ "WHERE cd_consumo = ?";
		//Preparando estrutura
		estrutura = con.prepareStatement(sql);
		//Atribuindo valores
		estrutura.setInt(1, novoConsumo.getHospedagem().getCodigo());
		estrutura.setInt(2, novoConsumo.getFuncionario().getCodigo());
		estrutura.setInt(3, novoConsumo.getProduto_Servico().getCodigo());
		estrutura.setInt(4, novoConsumo.getQuantidade());
		estrutura.setInt(5, cod_Consumo);
		//Executando
		int saida = estrutura.executeUpdate();
		String mensagem = "";
		//Fechando estrutura
		estrutura.close();
		if(saida == 0){
			mensagem = "Não há consumos com este código para serem atualizados.";
		}
		else {
			mensagem = saida + " consumo(s) atualizado(s) com sucesso!";
		}
		return mensagem;
	}
	/**
	 * Método para excluir o consumo através do código.
	 * 
	 * @param Connection con
	 * @param int cod_Consumo
	 * @return String mensagem 
	 * @throws SQLException
	 */
	
	public String excluirConsumo(Connection con, int cod_Consumo) throws SQLException{
		//Script sql
		sql = "DELETE FROM T_AM_GRR_CONSUMO WHERE cd_consumo = ?";
		//Preparando estrutura
		estrutura = con.prepareStatement(sql);
		//Atribuindo valores
		estrutura.setInt(1, cod_Consumo);
		//Executando
		int saida = estrutura.executeUpdate();
		//Fechando estrutura
		estrutura.close();
		String mensagem = "";
		if(saida == 0){
			mensagem = "Não há consumos com este código para serem excluidos.";
		}
		else {
			mensagem = saida + " consumo(s) excluido(s) com sucesso!";
		}
		return mensagem;
	}

}
