package com.si.dsi.pessoa.dto;

import java.io.Serializable;

public class PessoaDTO implements Serializable {
	
	private static final long serialVersionUID = 3774091518986982074L;
	
	private Integer id;
	private String nome;
	private String cpf;
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}
