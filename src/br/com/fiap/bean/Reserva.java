/**
 * 
 */
package br.com.fiap.bean;

import java.io.Serializable;
import java.util.Calendar;

/**
 * Classe que <b>adiciona</b> uma tupla na tabela Reserva.
 * 
 * @author Raphael de Melo Silva
 * @author Ricardo Antonelli
 *  
 */ 

public class Reserva implements Serializable {

	// Atributos
	
	/**
	 * Atributos da classe Reserva.
	 *
	 */

	private int codigo;
	private Cliente cliente;
	private Funcionario funcionario;
	private Calendar data_Solicitacao;
	private Calendar data_Inicio;
	private Calendar data_Final;
	private short quantidade_Adulto;
	private short quantidade_Crianca;
	private byte status;

	// Construtores
	
	/**
	 * Construtores da classe Reserva.
	 *
	 */

	public Reserva() {
		super();
	}

	public Reserva(int codigo, Cliente cliente, Funcionario funcionario,
			Calendar data_Solicitacao, Calendar data_Inicio,
			Calendar data_Final, short quantidade_Adulto,
			short quantidade_Crianca, byte status) {
		super();
		this.codigo = codigo;
		this.cliente = cliente;
		this.funcionario = funcionario;
		this.data_Solicitacao = data_Solicitacao;
		this.data_Inicio = data_Inicio;
		this.data_Final = data_Final;
		this.quantidade_Adulto = quantidade_Adulto;
		this.quantidade_Crianca = quantidade_Crianca;
		this.status = status;
	}
	
	// Getters e Setters
	
	/**
	 * Getters e Setters da classe Reserva.
	 *
	 */

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
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

	public Calendar getData_Solicitacao() {
		return data_Solicitacao;
	}

	public void setData_Solicitacao(Calendar data_Solicitacao) {
		this.data_Solicitacao = data_Solicitacao;
	}

	public Calendar getData_Inicio() {
		return data_Inicio;
	}

	public void setData_Inicio(Calendar data_Inicio) {
		this.data_Inicio = data_Inicio;
	}

	public Calendar getData_Final() {
		return data_Final;
	}

	public void setData_Final(Calendar data_Final) {
		this.data_Final = data_Final;
	}

	public short getQuantidade_Adulto() {
		return quantidade_Adulto;
	}

	public void setQuantidade_Adulto(short quantidade_Adulto) {
		this.quantidade_Adulto = quantidade_Adulto;
	}

	public short getQuantidade_Crianca() {
		return quantidade_Crianca;
	}

	public void setQuantidade_Crianca(short quantidade_Crianca) {
		this.quantidade_Crianca = quantidade_Crianca;
	}

	public byte getStatus() {
		return status;
	}

	public void setStatus(byte status) {
		this.status = status;
	}

}// fim da classe Reserva
