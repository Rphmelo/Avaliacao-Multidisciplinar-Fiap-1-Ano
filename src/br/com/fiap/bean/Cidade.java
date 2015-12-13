/**
 * 
 */
package br.com.fiap.bean;

import java.io.Serializable;

/**
 * Classe que <b>adiciona</b> uma tupla na tabela Cidade.
 * 
 * @author Raphael de Melo Silva
 * @author Ricardo Antonelli
 *  
 */

public class Cidade implements Serializable {

	// Atributos
	
	/**
	 * Atributos da classe Cidade.
	 *
	 */

	private int codigo;
	private Estado estado;
	private String nome;

	// Construtores
	
	/**
	 * Construtores da classe Cidade.
	 *
	 */
	
	public Cidade() {
		super();
	}

	public Cidade(int codigo, Estado estado, String nome) {
		super();
		this.codigo = codigo;
		this.estado = estado;
		this.nome = nome;
	}
	
	// Getters e Setters
	
	/**
	 * Getters e Setters da classe Cidade.
	 *
	 */

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}// fim da classe Cidade
