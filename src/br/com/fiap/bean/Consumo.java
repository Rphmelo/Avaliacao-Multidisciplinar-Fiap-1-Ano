/**
 * 
 */
package br.com.fiap.bean;

import java.io.Serializable;
import java.util.Calendar;

/**
 * Classe que <b>adiciona</b> uma tupla na tabela Consumo.
 * 
 * @author Raphael de Melo Silva
 * @author Ricardo Antonelli
 *  
 */

public class Consumo implements Serializable {

	// Atributos
	
	/**
	 * Atributos da classe Consumo.
	 *
	 */
	
	private int codigo;
	private Hospedagem hospedagem;
	private Produto_Servico produto_Servico;
	private Funcionario funcionario;
	private Calendar dt_Consumo;
	private int quantidade;

	// Construtores
	
	/**
	 * Construtores da classe Consumo.
	 *
	 */

	public Consumo() {
		super();
	}

	public Consumo(int codigo, Hospedagem hospedagem,
			Produto_Servico produto_Servico, Funcionario funcionario,
			Calendar dt_Consumo, int quantidade) {
		super();
		this.codigo = codigo;
		this.hospedagem = hospedagem;
		this.produto_Servico = produto_Servico;
		this.funcionario = funcionario;
		this.dt_Consumo = dt_Consumo;
		this.quantidade = quantidade;
	}

	// Getters e Setters
	
	/**
	 * Getters e Setters da classe Consumo.
	 *
	 */
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public Hospedagem getHospedagem() {
		return hospedagem;
	}
	public void setHospedagem(Hospedagem hospedagem) {
		this.hospedagem = hospedagem;
	}
	public Produto_Servico getProduto_Servico() {
		return produto_Servico;
	}
	public void setProduto_Servico(Produto_Servico produto_Servico) {
		this.produto_Servico = produto_Servico;
	}
	public Funcionario getFuncionario() {
		return funcionario;
	}
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	public Calendar getDt_Consumo() {
		return dt_Consumo;
	}
	public void setDt_Consumo(Calendar dt_Consumo) {
		this.dt_Consumo = dt_Consumo;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
}// fim da classe Consumo
