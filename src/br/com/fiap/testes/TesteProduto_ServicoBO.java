package br.com.fiap.testes;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.fiap.bean.Produto_Servico;
import br.com.fiap.bo.Produto_ServicoBO;
import br.com.fiap.conexao.ConexaoFactory;
import br.com.fiap.excecao.Excecao;

/**
 * Classe de testes para o Produto_ServicoBO.
 * 
 * @author Raphael de Melo Silva
 * @author Ricardo Antonelli
 *  
 */

public class TesteProduto_ServicoBO {
	
	/**
	 * Método pesquisarProd_Serv
	 * 
	 * @param Connection con
	 * @param String descricao
	 * @throws Excecao
	 * @throws SQLException
	 *
	 */

	static void pesquisarProd_Serv(Connection con, String descricao) throws Excecao, SQLException{
		Produto_Servico prod_serv;
		prod_serv = Produto_ServicoBO.pesquisarProd_Serv(con, descricao);
		if (prod_serv.getCodigo() == 0
				|| prod_serv.getDescricao().equals("") 
				|| prod_serv.getTipo() == 0) {
			System.out.println("Nulo");
		} else {
			System.out.println(prod_serv.getCodigo());
			System.out.println(prod_serv.getDescricao());
			System.out.println(prod_serv.getTipo());
		}
	}
	
	/**
	 * Método listarProduto
	 * 
	 * @param Connection con
	 * @throws Excecao
	 * @throws SQLException
	 * @return lista
	 */
	
	static List<Produto_Servico> listarProduto(Connection con) throws Excecao, SQLException{
		List<Produto_Servico> lista;
		lista = Produto_ServicoBO.listarProduto(con);
		return lista;
	}
	
	/**
	 * Método listarServico
	 * 
	 * @param Connection con
	 * @throws Excecao
	 * @throws SQLException
	 * @return lista
	 */
	
	static List<Produto_Servico> listarServico(Connection con) throws Excecao, SQLException{
		List<Produto_Servico> lista;
		lista = Produto_ServicoBO.listarServicos(con);
		return lista;
	}
	
	/**
	 * Método main.
	 *
	 * @param String[] args
	 * 
	 */
	
	public static void main(String[] args) {

		//String usuario = JOptionPane.showInputDialog("Digite o usuario");
		//String senha = JOptionPane.showInputDialog("Digite a senha");
		String usuario = "OPS$RM75321";
		String senha = "050897";
		Connection con = null;
		
		try {
			con = ConexaoFactory.controlarInstancia()
					.getConexao(usuario, senha);
			
			/*String descricao = "SUCO DELL VALE";
			pesquisarProd_Serv(con, descricao);
			*/
			List<Produto_Servico> lista = listarProduto(con);
			System.out.print("Código: \t");
			System.out.print("Descrição: \t\t\t");
			System.out.print("Tipo: \t");
			System.out.println();
			for(Produto_Servico p : lista){
				System.out.print(p.getCodigo() + "\t\t");
				System.out.print(p.getDescricao() + "\t\t\t\t");
				System.out.print(p.getTipo() + "\t\t");
				System.out.println(); 
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
