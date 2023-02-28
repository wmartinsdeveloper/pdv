package com.wm.sistemacomercial.model.entities;


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

import com.wm.sistemacomercial.model.entities.enums.EStatusConta;

@Entity(name = "Contas_Pagar")
public class ContasPagar implements Serializable {
	
	private static final long serialVersionUID = 2L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_CONTA_PAGAR")
	private Long ID_ContaPagar;
	
	@Column(name = "DATA_INCLUSAO")
	private Date dataInclusao;
	
	@Column(name = "DATA_PAGAMENTO")
	private Date dataPagamento;
	
	@Column(name = "VALOR_TOTAL")
	private Double valorTotal;
	
	@Column(name = "DATA_VENCIMENTO")
	private Date dataVencimento;
	
	@Column(name = "STATUS")
	@Enumerated(EnumType.STRING)
	private EStatusConta status;

	@OneToOne
	@JoinColumn(name = "ID_CONTA")
	private Conta conta;

	public ContasPagar() {}

	public ContasPagar(Date dataInclusao, Date dataPagamento, Double valorTotal, Date dataVencimento,
			EStatusConta status, Conta conta) {
		this.dataInclusao = dataInclusao;
		this.dataPagamento = dataPagamento;
		this.valorTotal = valorTotal;
		this.dataVencimento = dataVencimento;
		this.status = status;
		this.conta = conta;
	}



	public Date getDataInclusao() {
		return dataInclusao;
	}

	public void setDataInclusao(Date dataInclusao) {
		this.dataInclusao = dataInclusao;
	}

	public Date getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(Date dataPagamento) {
		this.dataPagamento = dataPagamento;
	}

	public Double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public Date getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
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

	public Long getID_ContaPagar() {
		return ID_ContaPagar;
	}

	@Override
	public String toString() {
		return "ContasPagar [ID_ContaPagar=" + ID_ContaPagar + ", dataInclusao=" + dataInclusao + ", dataPagamento="
				+ dataPagamento + ", valorTotal=" + valorTotal + ", dataVencimento=" + dataVencimento + ", status="
				+ status + ", conta=" + conta + "]";
	}

	
	

}
