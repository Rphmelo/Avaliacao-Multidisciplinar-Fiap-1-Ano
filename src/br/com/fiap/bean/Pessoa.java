/**
 * 
 */
package br.com.fiap.bean;

import java.io.Serializable;

/**
 * Classe que <b>adiciona</b> uma tupla na tabela Pessoa.
 * 
 * @author Raphael de Melo Silva
 * @author Ricardo Antonelli
 *  
 */ 

public class Pessoa implements Serializable {

	// Atributos
	
	/**
	 * Atributos da classe Pessoa.
	 *
	 */

	private int codigo;
	private String nome;
	
	// Construtores
	
	/**
	 * Construtores da classe Pessoa.
	 *
	 */

	public Pessoa() {
		super();
	}

	public Pessoa(int codigo, String nome) {
		super();
		this.codigo = codigo;
		this.nome = nome;
	}

	// Getters e Setters
	
	/**
	 * Getters e Setters da classe Pessoa.
	 *
	 */
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}// fim da classe Pessoa
