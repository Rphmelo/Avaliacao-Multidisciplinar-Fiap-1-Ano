/**
 * 
 */
package br.com.fiap.testes;

import java.sql.Connection;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import br.com.fiap.bean.Cliente;
import br.com.fiap.bo.HospedagemBO;
import br.com.fiap.conexao.ConexaoFactory;
import br.com.fiap.excecao.Excecao;

/**
 * Classe de testes para o HospedagemBO.
 * 
 * @author Raphael de Melo Silva
 * @author Ricardo Antonelli
 *  
 */

public class TesteHospedagemBO {

	/**
	 * Método main
	 * 
	 * @param String[] args
	 * @throws Excecao 
	 * @throws SQLException 
	 */
	
	public static void main(String[] args) throws Excecao, SQLException {
		//String usuario = JOptionPane.showInputDialog("Digite o usuario");
		//String senha = JOptionPane.showInputDialog("Digite a senha");
		String usuario = "OPS$RM75321";
		String senha = "050897";
		Connection con = null;
		try{
			con = ConexaoFactory.controlarInstancia().
				getConexao(usuario, senha);
			Cliente cliente = new Cliente();
			long cpf = Long.parseLong(JOptionPane.showInputDialog("Digite o cpf do cliente"));
			cliente.setCpf(cpf);
			
			int codigoHospedagem = HospedagemBO.pesquisarCodHospedagem(con, cliente.getCpf());
			System.out.println(codigoHospedagem);
			
		}catch(Exception e){
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
