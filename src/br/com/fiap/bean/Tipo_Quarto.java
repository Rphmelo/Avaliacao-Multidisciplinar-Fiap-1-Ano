/**
 * 
 */
package br.com.fiap.bean;

import java.io.Serializable;

/**
 * Classe que <b>adiciona</b> uma tupla na tabela Tipo_Quarto.
 * 
 * @author Raphael de Melo Silva
 * @author Ricardo Antonelli
 *  
 */ 

public class Tipo_Quarto implements Serializable {

	// Atributos
	
	/**
	 * Atributos da classe Tipo_Quarto.
	 *
	 */

	private int codigo;
	private String descricao;
	private String observacao;
	
	// Construtores
	
	/**
	 * Construtores da classe Tipo_Quarto.
	 *
	 */

	public Tipo_Quarto() {
		super();
	}

	public Tipo_Quarto(int codigo, String descricao, String observacao) {
		super();
		this.codigo = codigo;
		this.descricao = descricao;
		this.observacao = observacao;
	}
	
	// Getters e Setters
	
	/**
	 * Getters e Setters da classe Tipo_Quarto.
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

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

}// fim da classe Tipo_Quarto
