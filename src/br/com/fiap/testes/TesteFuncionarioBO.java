/**
 * 
 */
package br.com.fiap.testes;

import java.sql.Connection;

import br.com.fiap.bean.Funcionario;
import br.com.fiap.bo.FuncionarioBO;
import br.com.fiap.conexao.ConexaoFactory;

/**
 * Classe de testes para o FuncionarioBO.
 * 
 * @author Raphael de Melo Silva
 * @author Ricardo Antonelli
 *  
 */

public class TesteFuncionarioBO {
	
	/**
	 * Método main.
	 *
	 * @param String[] args
	 * 
	 */
	public static void main(String[] args) {
		// String usuario = JOptionPane.showInputDialog("Digite o usuario");
		// String senha = JOptionPane.showInputDialog("Digite a senha");
		String usuario = "OPS$RM75321";
		String senha = "050897";
		Connection con = null;
		Funcionario func = new Funcionario();
		try {
			con = ConexaoFactory.controlarInstancia()
					.getConexao(usuario, senha);
			int codigoFunc = 7;
			func = FuncionarioBO.pesquisarFuncionario(con, codigoFunc);
			System.out.println(func.getCargo());
			System.out.println(func.getCodigo());
			System.out.println(func.getNome());
			System.out.println(func.getData_Admissao().getTime());

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
