/**
 * 
 */
package br.com.fiap.bean;

import java.io.Serializable;

/**
 * Classe que <b>adiciona</b> uma tupla na tabela Produto_Servico.
 * 
 * @author Raphael de Melo Silva
 * @author Ricardo Antonelli
 *  
 */ 

public class Produto_Servico implements Serializable {

	// Atributos
	
	/**
	 * Atributos da classe Produto_Servico.
	 *
	 */

	private int codigo;
	private String descricao;
	private byte tipo;

	// Construtores
	
	/**
	 * Construtores da classe Produto_Servico.
	 *
	 */
	
	public Produto_Servico() {
		super();
	}

	public Produto_Servico(int codigo, String descricao, byte tipo) {
		super();
		this.codigo = codigo;
		this.descricao = descricao;
		this.tipo = tipo;
	}

	// Getters e Setters
	
	/**
	 * Getters e Setters da classe Produto_Servico.
	 *
	 */
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public byte getTipo() {
		return tipo;
	}

	public void setTipo(byte tipo) {
		this.tipo = tipo;
	}

}// fim da classe Produto_Servico
