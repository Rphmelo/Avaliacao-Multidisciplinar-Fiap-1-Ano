/**
 * 
 */
package br.com.fiap.conexao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Classe para conexão com o Banco de Dados.
 * 
 * @author Raphael de Melo Silva
 * @author Ricardo Antonelli
 *  
 */

public final class ConexaoFactory {
	private static ConexaoFactory conexao = null;

	/**
	 * Método instancia uma conexao.
	 * 
	 * @param - não recebe parâmetros 
	 * @return ConexaoFactory conexao
	 */
	
	public static ConexaoFactory controlarInstancia() {
		if (conexao == null) {
			conexao = new ConexaoFactory();
		}
		return conexao;
	}

	/**
	 * Método que solicita usuário e senha.
	 * 
	 * @param String usuario
	 * @param String senha
	 * @exception Exception
	 * @return Connection
	 */
	
	public Connection getConexao(String usuario, String senha) throws Exception {

		try {
/*
			FileReader arquivo = new FileReader(System.getProperty("user.dir")
					+ "/WebContent/conexao/banco.txt");
			BufferedReader dados = new BufferedReader(arquivo);
*/
			String url = "blablablabla";// 
			//String url = dados.readLine();

			if (url.indexOf("oracle") > 0) {
				Class.forName("oracle.jdbc.driver.OracleDriver");
			} else if (url.indexOf("mysql") > 0) {
				Class.forName("com.mysql.jdbc.Driver");
			}
			//dados.close();

			return DriverManager.getConnection(url, usuario, senha);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

}// fim da classe ConexaoFactory
