package com.marceloBikerDev.loanAppclient.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

@Document(indexName = "pessoa")
public class Pessoa {
	
	@Id
	private String id;

	@Field(type = FieldType.Keyword)
	private String nome;
	
	@Field(type = FieldType.Keyword)
	private String email;
	
	@Field(type = FieldType.Keyword)
	private String cpf;
	
	@Field(type = FieldType.Keyword)
	private String rg;

	@Field(type = FieldType.Text)
	private String endereço;
	
	@Field(type = FieldType.Double)
	private Double renda;
	
   /* @Field(type = FieldType.Nested, includeInParent = true)
    private List<Emprestimo> emprestimos;*/
	
	public String getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getEndereço() {
		return endereço;
	}

	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}

	public Double getRenda() {
		return renda;
	}

	public void setRenda(Double renda) {
		this.renda = renda;
	}
}