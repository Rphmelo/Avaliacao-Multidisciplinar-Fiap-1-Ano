/**
 * 
 */
package br.com.fiap.bean;

import java.io.Serializable;
import java.util.Calendar;

/**
 * Classe que <b>adiciona</b> uma tupla na tabela Hospedagem.
 * 
 * @author Raphael de Melo Silva
 * @author Ricardo Antonelli
 *  
 */

public class Hospedagem implements Serializable {

	// Atributos
	
	/**
	 * Atributos da classe Hospedagem.
	 *
	 */

	private int codigo;
	private Quarto quarto;
	private Reserva_Quarto reserva;
	private Cliente cliente;
	private Funcionario funcionario;
	private Calendar data_Entrada;
	private Calendar data_Saida;
	private double desconto;

	// Construtores
	

	/**
	 * Construtores da classe Hospedagem.
	 *
	 */

	public Hospedagem() {
		super();
	}

	public Hospedagem(int codigo, Quarto quarto, Reserva_Quarto reserva,
			Cliente cliente, Funcionario funcionario, Calendar data_Entrada,
			Calendar data_Saida, double desconto) {
		super();
		this.codigo = codigo;
		this.quarto = quarto;
		this.reserva = reserva;
		this.cliente = cliente;
		this.funcionario = funcionario;
		this.data_Entrada = data_Entrada;
		this.data_Saida = data_Saida;
		this.desconto = desconto;
	}

	// Getters e Setters
	
	/**
	 * Getters e Setters da classe Hospedagem.
	 *
	 */

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Quarto getQuarto() {
		return quarto;
	}

	public void setQuarto(Quarto quarto) {
		this.quarto = quarto;
	}

	public Reserva_Quarto getReserva() {
		return reserva;
	}

	public void setReserva(Reserva_Quarto reserva) {
		this.reserva = reserva;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public Calendar getData_Entrada() {
		return data_Entrada;
	}

	public void setData_Entrada(Calendar data_Entrada) {
		this.data_Entrada = data_Entrada;
	}

	public Calendar getData_Saida() {
		return data_Saida;
	}

	public void setData_Saida(Calendar data_Saida) {
		this.data_Saida = data_Saida;
	}

	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}

}// fim da classe Hospedagem
