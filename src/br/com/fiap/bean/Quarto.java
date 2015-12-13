/**
 * 
 */
package br.com.fiap.bean;

import java.io.Serializable;

/**
 * Classe que <b>adiciona</b> uma tupla na tabela Quarto.
 * 
 * @author Raphael de Melo Silva
 * @author Ricardo Antonelli
 *  
 */ 

public class Quarto implements Serializable {

	// Atributos
	
	/**
	 * Atributos da classe Quarto.
	 *
	 */

	private int codigo;
	private Tipo_Quarto tipo_Quarto;
	private byte andar;
	private byte capacidade;
	
	// Construtores
	
	/**
	 * Construtores da classe Quarto.
	 *
	 */

	public Quarto() {
		super();
	}

	public Quarto(int codigo, Tipo_Quarto tipo_Quarto, byte andar,
			byte capacidade) {
		super();
		this.codigo = codigo;
		this.tipo_Quarto = tipo_Quarto;
		this.andar = andar;
		this.capacidade = capacidade;
	}
	
	// Getters e Setters
	
	/**
	 * Getters e Setters da classe Quarto.
	 *
	 */
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Tipo_Quarto getTipo_Quarto() {
		return tipo_Quarto;
	}

	public void setTipo_Quarto(Tipo_Quarto tipo_Quarto) {
		this.tipo_Quarto = tipo_Quarto;
	}

	public byte getAndar() {
		return andar;
	}

	public void setAndar(byte andar) {
		this.andar = andar;
	}

	public byte getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(byte capacidade) {
		this.capacidade = capacidade;
	}

}// fim da classe Quarto
