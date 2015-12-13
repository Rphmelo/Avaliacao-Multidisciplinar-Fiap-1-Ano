/**
 * 
 */
package br.com.fiap.excecao;

/**
 * Classe para utilizada para o tratamento de Excecoes.
 * 
 * @author Raphael de Melo Silva
 * @author Ricardo Antonelli
 *    
 */

public class Excecao extends Exception {
	
	/**
	 * M�todo construtor da classe Excecao.
	 * 
	 * @param String mensagem
	 * @param Exception e
	 * 
	 */
	
	public Excecao(String mensagem, Exception e) {
		super(mensagem, e);
		if (e.getClass().toString()
				.equals("class java.lang.NumberFormatException")) {
			System.out.println("N�mero inv�lido");
		} else if (e.getClass().toString()
				.equals("class java.lang.ArithmeticException")) {
			System.out.println("Imposs�vel dividir por 0");
		} else if (e.getClass().toString()
				.equals("class java.lang.ArrayIndexOutOfBoundsException")) {
			System.out.println("Limite de  excedido");
		} else if (e.getClass().toString()
				.equals("class java.lang.NullPointerException")) {
			System.out.println("Apontando para um objeto nulo");
		} else if (e.getClass().toString()
				.equals("class java.lang.IllegalArgumentException")) {
			System.out.println("Par�metro inv�lido!");
		} else if (e.getClass().toString()
				.equals("class java.lang.FileNotFoundException")) {
			System.out.println("Arquivo n�o encontrado!");
		} else if (e.getClass().toString()
				.equals("class java.lang.SQLException")) {
			System.out.println("Ocorreu uma falha no banco de dados!");
		} else {
			System.out.println("Erro desconhecido!");
		}
		this.print();
		e.printStackTrace();

	}
	
	/**
	 * M�todo construtor da classe Excecao.
	 * 
	 * @param String mensagem
	 * 
	 * 
	 */
	
	public Excecao(String mensagem) {
		System.out.println(mensagem);
	}

	/**
	 * M�todo que imprime uma mensagem de erro.
	 * 
	 * @param - n�o recebe par�metros.
	 * 
	 * 
	 */
	
	public void print() {
		System.out.println("Ocorreu uma falha!");
	}

}// fim da classe Excecao
