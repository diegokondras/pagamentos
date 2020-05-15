package br.com.pagamentos.conta;

public class ContasVinculadas implements Conta {
	private Conta conta;
	private Conta contaVinculada;
	
	public ContasVinculadas(Conta conta, Conta contaVinculada) {
		super();
		this.conta = conta;
		this.contaVinculada = contaVinculada;
	}
	
	public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}

	public Conta getContaVinculada() {
		return contaVinculada;
	}

	public void setContaVinculada(Conta contaVinculada) {
		this.contaVinculada = contaVinculada;
	}

	@Override
	public double getSaldo() {
		return conta.getSaldo() + contaVinculada.getSaldo();
	}
	
}
