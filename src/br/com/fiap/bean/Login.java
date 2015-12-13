/**
 * 
 */
package br.com.fiap.bean;

import java.io.Serializable;

/**
 * Classe que <b>adiciona</b> uma tupla na tabela Login.
 * 
 * @author Raphael de Melo Silva
 * @author Ricardo Antonelli
 *  
 */

public class Login implements Serializable {

	// Atributos
	
	/**
	 * Atributos da classe Login.
	 *
	 */

	private String email;
	private String senha;
	
	// Construtores
	
	/**
	 * Construtores da classe Login.
	 *
	 */

	public Login() {
		super();
	}

	public Login(String email, String senha) {
		super();
		this.email = email;
		this.senha = senha;
	}
	
	// Getters e Setters
	
	/**
	 * Getters e Setters da classe Login.
	 *
	 */

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}// fim da classe Login
