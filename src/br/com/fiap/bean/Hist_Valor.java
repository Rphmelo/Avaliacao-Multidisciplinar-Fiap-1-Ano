/**
 * 
 */
package br.com.fiap.bean;

import java.io.Serializable;
import java.util.Calendar;

/**
 * Classe que <b>adiciona</b> uma tupla na tabela Hist_Valor.
 * 
 * @author Raphael de Melo Silva
 * @author Ricardo Antonelli
 *  
 */

public class Hist_Valor implements Serializable {

	// Atributos
	
	/**
	 * Atributos da classe Hist_Valor.
	 *
	 */
	
	private int codigo;
	private Tipo_Quarto tipo_Quarto;
	private Calendar data_Validade;
	private double valor;

	// Construtores
	
	/**
	 * Construtores da classe Hist_Valor.
	 *
	 */
	
	public Hist_Valor() {
		super();
	}

	public Hist_Valor(int codigo, Tipo_Quarto tipo_Quarto,
			Calendar data_Validade, double valor) {
		super();
		this.codigo = codigo;
		this.tipo_Quarto = tipo_Quarto;
		this.data_Validade = data_Validade;
		this.valor = valor;
	}
	
	// Getters e Setters
	
	/**
	 * Getters e Setters da classe Hist_Valor.
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

	public Calendar getData_Validade() {
		return data_Validade;
	}

	public void setData_Validade(Calendar data_Validade) {
		this.data_Validade = data_Validade;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

}// fim da classe Hist_Valor
