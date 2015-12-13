/**
 * 
 */
package br.com.fiap.bean;

import java.io.Serializable;

/**
 * Classe que <b>adiciona</b> uma tupla na tabela Pessoa_Ende.
 * 
 * @author Raphael de Melo Silva
 * @author Ricardo Antonelli
 *  
 */

public class Pessoa_Ende implements Serializable {

	// Atributos
	
	/**
	 * Atributos da classe Pessoa_Ende.
	 *
	 */

	private int codigo;
	private Pessoa pessoa;
	private Logradouro logradouro;
	private int numero;
	private String complemento;
	
	// Construtores
	
	/**
	 * Construtores da classe Pessoa_Ende.
	 *
	 */

	public Pessoa_Ende() {
		super();
	}

	public Pessoa_Ende(int codigo, Pessoa pessoa, Logradouro logradouro,
			int numero, String complemento) {
		super();
		this.codigo = codigo;
		this.pessoa = pessoa;
		this.logradouro = logradouro;
		this.numero = numero;
		this.complemento = complemento;
	}
	
	// Getters e Setters
	
	/**
	 * Getters e Setters da classe Pessoa_Ende.
	 *
	 */

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public Logradouro getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(Logradouro logradouro) {
		this.logradouro = logradouro;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

}// fim da classe Pessoa_Ende
