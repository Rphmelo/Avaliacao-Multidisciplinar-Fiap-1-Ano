/**
 * 
 */
package br.com.fiap.bean;

import java.io.Serializable;
/**
 * Classe que <b>adiciona</b> uma tupla na tabela Telefone.
 * 
 * @author Raphael de Melo Silva
 * @author Ricardo Antonelli
 *  
 */ 

public class Telefone implements Serializable {

	// Atributos
	
	/**
	 * Atributos da classe Telefone.
	 *
	 */

	private int codigo;
	private Tipo_Fone tipo_fone;
	private byte ddd;
	private int numero;

	// Construtores
	
	/**
	 * Construtores da classe Telefone.
	 *
	 */

	public Telefone() {
		super();
	}

	public Telefone(int codigo, Tipo_Fone tipo_fone, byte ddd, int numero) {
		super();
		this.codigo = codigo;
		this.tipo_fone = tipo_fone;
		this.ddd = ddd;
		this.numero = numero;
	}

	// Getters e Setters
	
	/**
	 * Getters e Setters da classe Telefone.
	 *
	 */

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Tipo_Fone getTipo_fone() {
		return tipo_fone;
	}

	public void setTipo_fone(Tipo_Fone tipo_fone) {
		this.tipo_fone = tipo_fone;
	}

	public byte getDdd() {
		return ddd;
	}

	public void setDdd(byte ddd) {
		this.ddd = ddd;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

}// fim da classe Telefone
