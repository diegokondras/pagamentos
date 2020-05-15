package br.com.pagamentos.transacao;

public class Transacao {
	private String codigo;
	private double valor;
	private double taxa; 
	private static Transacao transacao;
	
	
	public Transacao(String codigo) {
		this.codigo = codigo;
		this.valor = 0.0;
		this.taxa = 0.0;
	}
	
	public Transacao(String codigo, Double valor) {
		this.codigo = codigo;
		this.valor = valor;
		this.taxa = 0.0;
	}
	
	public Transacao(String codigo, Double valor, Double taxa) {
		this.codigo = codigo;
		this.valor = valor;
		this.taxa = taxa;
	}
	
	
	public static Transacao criaCodigo(String codigo) {
		if (transacao != null) {
			transacao.setCodigo(codigo);
			return transacao;
		}
		return new Transacao(codigo);
	}

	public Transacao criaNomeValor(String codigo, Double valor) {
		
		if (transacao != null) {
			transacao.setCodigo(codigo);
			transacao.setValor(valor);
			return transacao;
		}
		return new Transacao(codigo);
	}
	
	
	public Transacao cria(String codigo, Double valor, Double taxa) {
		
		if (transacao != null) {
			transacao.setCodigo(codigo);
			transacao.setValor(valor);
			transacao.setTaxa(taxa);
			return transacao;
		}
		return new Transacao(codigo);
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public double getTaxa() {
		return taxa;
	}

	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}

	public static Transacao getTransacao() {
		return transacao;
	}

	public static void setTransacao(Transacao transacao) {
		Transacao.transacao = transacao;
	}
	
}
