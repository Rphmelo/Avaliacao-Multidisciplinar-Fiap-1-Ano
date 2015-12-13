/**
 * 
 */
package br.com.fiap.bean;

import java.io.Serializable;

/**
 * Classe que <b>adiciona</b> uma tupla na tabela Estado.
 * 
 * @author Raphael de Melo Silva
 * @author Ricardo Antonelli
 *  
 */

public class Estado implements Serializable {

	// Atributos
	
	/**
	 * Atributos da classe Estado.
	 *
	 */

	private int codigo;
	private String nome;
	private String sigla;

	// Construtores
	
	/**
	 * Construtores da classe Estado.
	 *
	 */
	
	public Estado() {
		super();
	}

	public Estado(int codigo, String nome, String sigla) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.sigla = sigla;
	}

	// Getters e Setters
	
	/**
	 * Getters e Setters da classe Estado.
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

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

}// fim da classe Estado
