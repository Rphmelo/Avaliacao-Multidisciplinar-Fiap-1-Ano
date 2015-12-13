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

import br.com.fiap.bean.Hist_Preco;
import br.com.fiap.bean.Produto_Servico;
import br.com.fiap.excecao.Excecao;

/**
 * Classe DAO para Historico de Preços.
 * 
 * @author Raphael de Melo Silva
 * @author Ricardo Antonelli
 *  
 */

public class Hist_PrecoDAO {
	//Atributos 
	private PreparedStatement estrutura;
	private ResultSet resultado;
	private String sql;
	private Calendar cal;
	
	//Métodos
	
	// Método que lista todos os historicos de preços de todos os Serviços
	
	
	/**
	 * Método que lista todos os historicos de preços de todos os Serviços.
	 * 
	 * @param Connection con
	 * @return List listaHistServ
	 * @throws SQLException
	 * @throws Excecao
	 */
	
	public List<Hist_Preco> listarHistServ(Connection con) throws SQLException, Excecao{
		//Variáveis auxiliares
		Hist_Preco historico;
		Produto_Servico prod_serv;
		List<Hist_Preco> listaHistServ = new ArrayList<Hist_Preco>();
		//Script sql
		sql = "SELECT * FROM T_AM_GRR_HIST_PRECO HP JOIN "
				+ "T_AM_GRR_PRODUTO_SERVICO PS ON HP.cd_tipo_servico = "
				+ "PS.cd_tipo_servico WHERE PS.nr_tipo = 2"
				+ " ORDER BY PS.ds_servico, HP.dt_validade ";
		//Preparando estrutura
		estrutura = con.prepareStatement(sql);
		//Gerando resultado
		resultado = estrutura.executeQuery();
		while(resultado.next()){
			//Instanciando Produto-Servico e Historico de preco
			historico = new Hist_Preco();
			prod_serv = new Produto_Servico();
			//Populando Produto_Servico
			prod_serv.setCodigo(resultado.getInt("cd_tipo_servico"));
			prod_serv.setDescricao(resultado.getString("ds_servico"));
			prod_serv.setTipo(resultado.getByte("nr_tipo"));
			//Populando Hist_Preco
			historico.setProduto_servico(prod_serv);
			cal = Calendar.getInstance();
			cal.setTime(resultado.getDate("dt_validade"));
			historico.setData_Validade(cal);
			historico.setPreco(resultado.getDouble("vl_preco"));
			historico.setCodigo(resultado.getInt("cd_hist_preco"));
			listaHistServ.add(historico);
		}
		//Fechando resultado e estrutura
		resultado.close();
		estrutura.close();
		return listaHistServ;
	}
	
	// Método que lista todos os historicos de preços de todos os Serviços
	
	
		/**
		 * Método que lista todos os historicos de preços de todos os Serviços.
		 * 
		 * @param Connection con
		 * @return List listaHistProd 
		 * @throws SQLException
		 * @throws Excecao
		 */
	
		public List<Hist_Preco> listarHistProd(Connection con) throws SQLException, Excecao{
			//Variáveis auxiliares
			Hist_Preco historico;
			Produto_Servico prod_serv;
			List<Hist_Preco> listaHistProd = new ArrayList<Hist_Preco>();
			//Script sql
			sql = "SELECT * FROM T_AM_GRR_HIST_PRECO HP JOIN "
					+ "T_AM_GRR_PRODUTO_SERVICO PS ON HP.cd_tipo_servico = "
					+ "PS.cd_tipo_servico WHERE PS.nr_tipo = 1"
					+ " ORDER BY PS.ds_servico, HP.dt_validade ";
			//Preparando estrutura
			estrutura = con.prepareStatement(sql);
			//Gerando resultado
			resultado = estrutura.executeQuery();
			while(resultado.next()){
				//Instanciando Produto-Servico e Historico de preco
				historico = new Hist_Preco();
				prod_serv = new Produto_Servico();
				//Populando Produto_Servico
				prod_serv.setCodigo(resultado.getInt("cd_tipo_servico"));
				prod_serv.setDescricao(resultado.getString("ds_servico"));
				prod_serv.setTipo(resultado.getByte("nr_tipo"));
				//Populando Hist_Preco
				historico.setProduto_servico(prod_serv);
				cal = Calendar.getInstance();
				cal.setTime(resultado.getDate("dt_validade"));
				historico.setData_Validade(cal);
				historico.setPreco(resultado.getDouble("vl_preco"));
				historico.setCodigo(resultado.getInt("cd_hist_preco"));
				listaHistProd.add(historico);
			}
			//Fechando resultado e estrutura
			resultado.close();
			estrutura.close();
			return listaHistProd;
		}

}
