/**
 * 
 */
package br.com.fiap.bean;

import java.io.Serializable;

/**
 * Classe que <b>adiciona</b> uma tupla na tabela Logradouro.
 * 
 * @author Raphael de Melo Silva
 * @author Ricardo Antonelli
 *  
 */

public class Logradouro implements Serializable {

	// Atributos
	
	/**
	 * Atributos da classe Logradouro.
	 *
	 */
	
	private long cep;
	private Bairro bairro;
	private String descricao;
	private Tipo_Log tipo_Log;

	// Construtores
	
	/**
	 * Construtores da classe Logradouro.
	 *
	 */
	
	public Logradouro() {
		super();
	}

	public Logradouro(long cep, Bairro bairro, String descricao,
			Tipo_Log tipo_Log) {
		super();
		this.cep = cep;
		this.bairro = bairro;
		this.descricao = descricao;
		this.tipo_Log = tipo_Log;
	}
	
	// Getters e Setters
	
	/**
	 * Getters e Setters da classe Logradouro.
	 *
	 */

	public long getCep() {
		return cep;
	}

	public void setCep(long cep) {
		this.cep = cep;
	}

	public Bairro getBairro() {
		return bairro;
	}

	public void setBairro(Bairro bairro) {
		this.bairro = bairro;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Tipo_Log getTipo_Log() {
		return tipo_Log;
	}

	public void setTipo_Log(Tipo_Log tipo_Log) {
		this.tipo_Log = tipo_Log;
	}

}// fim da classe Logradouro
