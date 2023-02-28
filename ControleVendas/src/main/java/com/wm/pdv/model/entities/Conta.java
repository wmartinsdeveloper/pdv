package com.wm.pdv.model.entities;



import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity(name = "Conta")
public class Conta implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_CONTA")
	private Long ID_Conta; 

	@Column(name = "NOME")
	private String Nome;
	
	@Column(name = "DESCRICAO")
	private String Descricao;

//	@JsonIgnore
//	@OneToMany(mappedBy = "conta")  
//	private List<ContasPagar> contapagar;
	
	public Conta() {};
	
	public Conta(String nome, String descricao) {
		Nome = nome;
		Descricao = descricao;
	}

	public Long getID_Conta() {
		return ID_Conta;
	}

	public void setID_Conta(Long iDConta) {
		ID_Conta = iDConta;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getDescricao() {
		return Descricao;
	}

	public void setDescricao(String descricao) {
		Descricao = descricao;
	}

//	public List<ContasPagar> getContaPagar() {
//		return contapagar;
//	}

//	public void setConta(List<ContasPagar> contapagar) {
//		this.contapagar = contapagar;
//	}

//	@Override
//	public String toString() {
//		return "Conta [IDConta=" + ID_Conta + ", Nome=" + Nome + ", Descricao=" + Descricao + ", conta=" + contapagar + "]";
//	}

	@Override
	public int hashCode() {
		return Objects.hash(Nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conta other = (Conta) obj;
		return Objects.equals(Nome, other.Nome);
	}


	
	
	
}
