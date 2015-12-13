/**
 * 
 */
package br.com.fiap.bean;

import java.io.Serializable;

/**
 * Classe que <b>adiciona</b> uma tupla na tabela Bairro.
 * 
 * @author Raphael de Melo Silva
 * @author Ricardo Antonelli
 *  
 */

public class Bairro implements Serializable {

	// Atributos
	
	/**
	 * Atributos da classe Bairro.
	 *
	 */
	
	private int codigo;
	private Cidade cidade;
	private String nome;
		
	// Construtores
	
	/**
	 * Construtores da classe Bairro.
	 *
	 */

	public Bairro() {
		super();
	}

	public Bairro(int codigo, Cidade cidade, String nome) {
		super();
		this.codigo = codigo;
		this.cidade = cidade;
		this.nome = nome;
	}
	
	
	// Getters e Setters
	
	/**
	 * Getters e Setters da classe Bairro.
	 *
	 */
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}// fim da classe Bairro
