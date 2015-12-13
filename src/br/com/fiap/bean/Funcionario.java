/**
 * 
 */
package br.com.fiap.bean;

import java.io.Serializable;
import java.util.Calendar;

/**
 * Classe que <b>adiciona</b> uma tupla na tabela Funcionario.
 * 
 * @author Raphael de Melo Silva
 * @author Ricardo Antonelli
 *  
 */

public class Funcionario extends Pessoa implements Serializable {

	// Atributos
	
	/**
	 * Atributos da classe Funcionario.
	 *
	 */

	private Calendar data_Admissao;
	private String cargo;
	
	// Construtores
	
	/**
	 * Construtores da classe Funcionario.
	 *
	 */

	public Funcionario() {
		super();
	}

	public Funcionario(int codigo, String nome, Calendar data_Admissao,
			String cargo) {
		super(codigo, nome);
		this.data_Admissao = data_Admissao;
		this.cargo = cargo;
	}
	
	// Getters e Setters
	
	/**
	 * Getters e Setters da classe Funcionario.
	 *
	 */

	public Calendar getData_Admissao() {
		return data_Admissao;
	}

	public void setData_Admissao(Calendar data_Admissao) {
		this.data_Admissao = data_Admissao;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

}// fim da classe Funcionario
