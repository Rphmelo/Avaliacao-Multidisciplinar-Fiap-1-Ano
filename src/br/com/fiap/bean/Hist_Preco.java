/**
 * 
 */
package br.com.fiap.bean;

import java.io.Serializable;
import java.util.Calendar;

/**
 * Classe que <b>adiciona</b> uma tupla na tabela Hist_Preco.
 * 
 * @author Raphael de Melo Silva
 * @author Ricardo Antonelli
 *  
 */

public class Hist_Preco implements Serializable {

	// Atributos
	
	/**
	 * Atributos da classe Hist_Preco.
	 *
	 */

	private int codigo;
	private Produto_Servico produto_servico;
	private Calendar data_Validade;
	private double preco;

	// Construtores
	
	/**
	 * Construtores da classe Hist_Preco.
	 *
	 */

	public Hist_Preco() {
		super();
	}

	public Hist_Preco(int codigo, Produto_Servico produto_servico,
			Calendar data_Validade, double preco) {
		super();
		this.codigo = codigo;
		this.produto_servico = produto_servico;
		this.data_Validade = data_Validade;
		this.preco = preco;
	}

	// Getters e Setters
	
	/**
	 * Getters e Setters da classe Hist_Preco.
	 *
	 */
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Produto_Servico getProduto_servico() {
		return produto_servico;
	}

	public void setProduto_servico(Produto_Servico produto_servico) {
		this.produto_servico = produto_servico;
	}

	public Calendar getData_Validade() {
		return data_Validade;
	}

	public void setData_Validade(Calendar data_Validade) {
		this.data_Validade = data_Validade;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

}// fim da classe Hist_Preco
