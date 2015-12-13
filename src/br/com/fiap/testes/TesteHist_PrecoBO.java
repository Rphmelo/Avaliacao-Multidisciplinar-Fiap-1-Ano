/**
 * 
 */
package br.com.fiap.testes;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.fiap.bean.Hist_Preco;
import br.com.fiap.bo.Hist_PrecoBO;
import br.com.fiap.conexao.ConexaoFactory;
import br.com.fiap.excecao.Excecao;

/**
 * Classe de testes para o Hist_PrecoBO.
 * 
 * @author Raphael de Melo Silva
 * @author Ricardo Antonelli
 *  
 */

public class TesteHist_PrecoBO {
	//Método que lista os historicos de servico
		
	/**
	 * Método que lista os historicos de servico.
	 * 
	 * @param Connection con
	 * @return List listaHistorico 
	 * @throws SQLException
	 * @throws Excecao
	 */
	
	static List<Hist_Preco> listarHistServ(Connection con) throws SQLException, Excecao{
		List<Hist_Preco> listaHistorico;
		listaHistorico = Hist_PrecoBO.listarHistServ(con);
		System.out.print("Código do produto-Servico: \t" );
		System.out.print("Descrição Produto-Servico: \t" );
		System.out.print("Data de validade: \t" );
		System.out.print("Valor: \t");
		System.out.println();
		for(Hist_Preco hist : listaHistorico){
			System.out.print(hist.getProduto_servico().getCodigo()+ "\t\t\t");
			System.out.print(hist.getProduto_servico().getDescricao() + "\t\t\t");
			System.out.print(hist.getData_Validade().getTime() + "\t\t\t");
			System.out.print(hist.getPreco()+ "\t\t\t");
			System.out.println();
		}
		return listaHistorico;
	}

	//Método que lista os historicos de produtos
	
	
	/**
	 * Método que lista os historicos de produtos.
	 * 
	 * @param Connection con
	 * @return List listaHistorico 
	 * @throws SQLException
	 * @throws Excecao
	 */
	
	static List<Hist_Preco> listarHistProd(Connection con) throws SQLException, Excecao{
		List<Hist_Preco> listaHistorico;
		listaHistorico = Hist_PrecoBO.listarHistProd(con);
		System.out.print("Código do produto-Servico: \t" );
		System.out.print("Descrição Produto-Servico: \t" );
		System.out.print("Data de validade: \t" );
		System.out.print("Valor: \t");
		System.out.println();
		for(Hist_Preco hist : listaHistorico){
			System.out.print(hist.getProduto_servico().getCodigo()+ "\t\t\t");
			System.out.print(hist.getProduto_servico().getDescricao() + "\t\t\t");
			System.out.print(hist.getData_Validade().getTime() + "\t\t\t");
			System.out.print(hist.getPreco()+ "\t\t\t");
			System.out.println();
		}
		return listaHistorico;
	}
	
	/**
	 * Método main.
	 * 
	 * @param String[] args
	 * 
	 */
	
	public static void main(String[] args){
		// String usuario = JOptionPane.showInputDialog("Digite o usuario");
		// String senha = JOptionPane.showInputDialog("Digite a senha");
		String usuario = "OPS$RM75321";
		String senha = "050897";
		Connection con = null;
		
		try{
			con = ConexaoFactory.controlarInstancia().getConexao(usuario, senha);
			listarHistServ(con);
			System.out.println();
			listarHistProd(con);
			}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}

