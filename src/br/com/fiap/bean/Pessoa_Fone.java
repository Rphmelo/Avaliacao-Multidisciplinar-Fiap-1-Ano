/**
 * 
 */
package br.com.fiap.bean;

import java.io.Serializable;

/**
 * Classe que <b>adiciona</b> uma tupla na tabela Pessoa_Fone.
 * 
 * @author Raphael de Melo Silva
 * @author Ricardo Antonelli
 *  
 */ 

public class Pessoa_Fone implements Serializable {

	// Atributos
	
	/**
	 * Atributos da classe Pessoa_Fone.
	 *
	 */

	private Pessoa pessoa;
	private Telefone fone;
	private int ramal;

	// Construtores
	
	/**
	 * Construtores da classe Pessoa_Fone.
	 *
	 */
	
	public Pessoa_Fone() {
		super();
	}

	public Pessoa_Fone(Pessoa pessoa, Telefone fone, int ramal) {
		super();
		this.pessoa = pessoa;
		this.fone = fone;
		this.ramal = ramal;
	}
	
	// Getters e Setters

	/**
	 * Getters e Setters da classe Pessoa_Fone.
	 *
	 */
	
	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public Telefone getFone() {
		return fone;
	}

	public void setFone(Telefone fone) {
		this.fone = fone;
	}

	public int getRamal() {
		return ramal;
	}

	public void setRamal(int ramal) {
		this.ramal = ramal;
	}

}// fim da classe Pessoa_Fone
