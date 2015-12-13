/**
 * 
 */
package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.bean.Produto_Servico;

/**
 * Classe DAO para Produtos e Servicos.
 * 
 * @author Raphael de Melo Silva
 * @author Ricardo Antonelli
 *  
 */

public class Produto_ServicoDAO {
	//Atributos 
	private PreparedStatement estrutura;
	private ResultSet resultado;
	private String sql;
	
	//Métodos
	
	//Método para pesquisar o produto pela descricao
		
	/**
	 * Método para pesquisar o produto pela descricao.
	 * 
	 * @param Connection con
	 * @param String descricaoProd_Serv
	 * @return Produto_Servico prod_serv
	 * @throws SQLException
	 */
	
	public Produto_Servico pesquisarProd_Serv(Connection con,
			String descricaoProd_Serv) throws SQLException{
		//Variavel auxiliar
		Produto_Servico prod_serv = new Produto_Servico();
		//Script sql
		sql = "SELECT cd_tipo_servico, nr_tipo, ds_servico "
				+ "FROM T_AM_GRR_PRODUTO_SERVICO WHERE ds_servico = ?";
		//Preparando estrutura
		estrutura = con.prepareStatement(sql);
		//Atribuindo valores
		estrutura.setString(1, descricaoProd_Serv.toUpperCase());
		//Gerando um resultado
		resultado = estrutura.executeQuery();
		if(resultado.next()){
			prod_serv.setCodigo(resultado.getInt("cd_tipo_servico"));
			prod_serv.setDescricao(resultado.getString("ds_servico"));
			prod_serv.setTipo(resultado.getByte("nr_tipo"));
		}
		//Fechando estrutura e resultado
		resultado.close();		
		estrutura.close();
		return prod_serv;
	}

	//Método que lista todos os serviços
		
		/**
		 * Método que lista todos os serviços.
		 * 
		 * @param Connection con
		 * @return List listaServico 
		 * @throws SQLException
		 */
	
		public List<Produto_Servico> listarServicos(Connection con) throws SQLException{
			//Variavel auxiliar
			List<Produto_Servico> listaServico = new ArrayList<Produto_Servico>();
			Produto_Servico servico;
			//Script sql
			sql = "SELECT cd_tipo_servico, nr_tipo, ds_servico "
					+ "FROM T_AM_GRR_PRODUTO_SERVICO WHERE nr_tipo = 2 "
					+ "ORDER BY ds_servico";
			//Preparando estrutura
			estrutura = con.prepareStatement(sql);
			//Gerando um resultado
			resultado = estrutura.executeQuery();
			while(resultado.next()){
				servico = new Produto_Servico();
				servico.setCodigo(resultado.getInt("cd_tipo_servico"));
				servico.setDescricao(resultado.getString("ds_servico"));
				servico.setTipo(resultado.getByte("nr_tipo"));
				listaServico.add(servico);
			}
			//Fechando estrutura e resultado
			resultado.close();		
			estrutura.close();
			return listaServico;
		}
	
	//Método que lista todos os produtos
		
	/**
	 * Método que lista todos os produtos.
	 * 
	 * @param Connection con
	 * @return List listaProduto 
	 * @throws SQLException
	 */
		
	public List<Produto_Servico> listarProduto(Connection con) throws SQLException{
		//Variavel auxiliar
		List<Produto_Servico> listaProduto = new ArrayList<Produto_Servico>();
		Produto_Servico produto;
		//Script sql
		sql = "SELECT cd_tipo_servico, nr_tipo, ds_servico "
				+ "FROM T_AM_GRR_PRODUTO_SERVICO WHERE nr_tipo = 1"
				+ "ORDER BY ds_servico";
		//Preparando estrutura
		estrutura = con.prepareStatement(sql);
		//Gerando um resultado
		resultado = estrutura.executeQuery();
		while(resultado.next()){
			produto = new Produto_Servico();
			produto.setCodigo(resultado.getInt("cd_tipo_servico"));
			produto.setDescricao(resultado.getString("ds_servico"));
			produto.setTipo(resultado.getByte("nr_tipo"));
			listaProduto.add(produto);
		}
		//Fechando estrutura e resultado
		resultado.close();		
		estrutura.close();
		return listaProduto;
	}
}
