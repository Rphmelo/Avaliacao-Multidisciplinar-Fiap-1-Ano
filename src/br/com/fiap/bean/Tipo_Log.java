/**
 * 
 */
package br.com.fiap.bean;

import java.io.Serializable;

/**
 * Classe que <b>adiciona</b> uma tupla na tabela Tipo_Log.
 * 
 * @author Raphael de Melo Silva
 * @author Ricardo Antonelli
 *  
 */ 

public class Tipo_Log implements Serializable {

	// Atributos
	
	/**
	 * Atributos da classe Tipo_Log.
	 *
	 */

	private int codigo;
	private String descricao;
	
	// Construtores
	
	/**
	 * Construtores da classe Tipo_Log.
	 *
	 */

	public Tipo_Log() {
		super();
	}

	public Tipo_Log(int codigo, String descricao) {
		super();
		this.codigo = codigo;
		this.descricao = descricao;
	}
	
	// Getters e Setters
	
	/**
	 * Getters e Setters da classe Tipo_Log.
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

}// fim da classe Tipo_Log
