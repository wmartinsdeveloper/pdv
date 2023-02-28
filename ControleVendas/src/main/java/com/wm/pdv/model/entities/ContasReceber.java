package com.wm.pdv.model.entities;



import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.wm.pdv.model.entities.enums.EStatusConta;

@Entity(name = "Contas_Receber")
public class ContasReceber implements Serializable {
 	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_CONTA_RECEBER")
	private Long IDContaReceber;
	
	@Column(name = "DATA_INCLUSAO")
	private Date dataInclusao;
	
	@Column(name = "DATA_RECEBIMENTO")
	private Date dataRecebimento;
	
	@Column(name = "VALOR_TOTAL")
	private Double valorTotal;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "STATUS")
	private EStatusConta status;
	
	@OneToOne
	@JoinColumn(name = "ID_CONTA")
	private Conta conta;

	public ContasReceber() {}

	public ContasReceber(Date dataInclusao, Date dataRecebimento, Double valorTotal, EStatusConta status, Conta conta) {
		this.dataInclusao = dataInclusao;
		this.dataRecebimento = dataRecebimento;
		this.valorTotal = valorTotal;
		this.status = status;
		this.conta = conta;
	}

	public Date getDataInclusao() {
		return dataInclusao;
	}

	public void setDataInclusao(Date dataInclusao) {
		this.dataInclusao = dataInclusao;
	}

	public Date getDataRecebimento() {
		return dataRecebimento;
	}

	public void setDataRecebimento(Date dataRecebimento) {
		this.dataRecebimento = dataRecebimento;
	}

	public Double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public EStatusConta getStatus() {
		return status;
	}

	public void setStatus(EStatusConta status) {
		this.status = status;
	}

	public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}

	public Long getIDContaReceber() {
		return IDContaReceber;
	}

	@Override
	public String toString() {
		return "ContasReceber [IDContaReceber=" + IDContaReceber + ", DataInclusao=" + dataInclusao
				+ ", DataRecebimento=" + dataRecebimento + ", ValorTotal=" + valorTotal + ", Status=" + status
				+ ", conta=" + conta + "]";
	};
	
	

}
