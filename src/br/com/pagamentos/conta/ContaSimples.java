package br.com.pagamentos.conta;

public class ContaSimples implements Conta {
	private String usuario;
	private double saldo;
	private double taxaPagamento;
	private double taxaRecebimento;
	
	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public double getTaxaPagamento() {
		return taxaPagamento;
	}

	public void setTaxaPagamento(double taxaPagamento) {
		this.taxaPagamento = taxaPagamento;
	}

	public double getTaxaRecebimento() {
		return taxaRecebimento;
	}

	public void setTaxaRecebimento(double taxaRecebimento) {
		this.taxaRecebimento = taxaRecebimento;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public double getSaldo() {
		return saldo;
	}
	
}
