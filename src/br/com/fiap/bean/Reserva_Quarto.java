/**
 * 
 */
package br.com.fiap.bean;

import java.io.Serializable;

/**
 * Classe que <b>adiciona</b> uma tupla na tabela Reserva_Quarto.
 * 
 * @author Raphael de Melo Silva
 * @author Ricardo Antonelli
 *  
 */ 

public class Reserva_Quarto implements Serializable {

	// Atributos
	

	/**
	 * Atributos da classe Reserva_Quarto.
	 *
	 */

	private Reserva reserva;
	private Quarto quarto;
	private byte qt_Pessoa_Quarto;
	private String observacao;
	
	// Construtores
	
	/**
	 * Construtores da classe Reserva_Quarto.
	 *
	 */

	public Reserva_Quarto() {
		super();
	}

	public Reserva_Quarto(Reserva reserva, Quarto quarto,
			byte qt_Pessoa_Quarto, String observacao) {
		super();
		this.reserva = reserva;
		this.quarto = quarto;
		this.qt_Pessoa_Quarto = qt_Pessoa_Quarto;
		this.observacao = observacao;
	}
	
	// Getters e Setters
	
	/**
	 * Getters e Setters da classe Reserva_Quarto.
	 *
	 */

	public Reserva getReserva() {
		return reserva;
	}

	public void setReserva(Reserva reserva) {
		this.reserva = reserva;
	}

	public Quarto getQuarto() {
		return quarto;
	}

	public void setQuarto(Quarto quarto) {
		this.quarto = quarto;
	}

	public byte getQt_Pessoa_Quarto() {
		return qt_Pessoa_Quarto;
	}

	public void setQt_Pessoa_Quarto(byte qt_Pessoa_Quarto) {
		this.qt_Pessoa_Quarto = qt_Pessoa_Quarto;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

}// fim da classe Reserva_Quarto
