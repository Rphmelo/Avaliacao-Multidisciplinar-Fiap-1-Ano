/**
 * 
 */
package br.com.fiap.bean;

import java.io.Serializable;
import java.util.Calendar;

/**
 * Classe que <b>adiciona</b> uma tupla na tabela Cliente.
 * 
 * @author Raphael de Melo Silva
 * @author Ricardo Antonelli
 *  
 */

public class Cliente extends Pessoa implements Serializable {

	// Atributos
	
	/**
	 * Atributos da classe Cliente.
	 *
	 */

	private long cpf;
	private String rg;
	private Calendar dt_Nascimento;
	private byte num_Quarto_Preferido;
	private String email;
	private String senha;
	
	// Construtores
	
	/**
	 * Construtores da classe Cliente.
	 *
	 */

	public Cliente() {
		super();
	}

	public Cliente(int codigo, String nome, long cpf, String rg,
			Calendar dt_Nascimento, byte num_Quarto_Preferido, String email,
			String senha) {
		super(codigo, nome);
		this.cpf = cpf;
		this.rg = rg;
		this.dt_Nascimento = dt_Nascimento;
		this.num_Quarto_Preferido = num_Quarto_Preferido;
		this.email = email;
		this.senha = senha;
	}
	
	// Getters e Setters
	
	/**
	 * Getters e Setters da classe Cliente.
	 *
	 */

	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public Calendar getDt_Nascimento() {
		return dt_Nascimento;
	}

	public void setDt_Nascimento(Calendar dt_Nascimento) {
		this.dt_Nascimento = dt_Nascimento;
	}

	public byte getNum_Quarto_Preferido() {
		return num_Quarto_Preferido;
	}

	public void setNum_Quarto_Preferido(byte num_Quarto_Preferido) {
		this.num_Quarto_Preferido = num_Quarto_Preferido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}// fim da classe Cliente
