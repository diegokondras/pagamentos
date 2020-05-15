package br.com.pagamentos.transacao;

import java.util.HashMap;
import java.util.Map;

public class TransacaoDAOProxy implements TransacaoDAOInterface {
	private Map<String, Transacao> transacao;
	
	public TransacaoDAOProxy() {
		super();
		this.transacao = new HashMap<>();
	}

	public void addTransacao(String codigo) {
		this.transacao.put(codigo, new Transacao(codigo));
	}

	public Transacao getTransacao(String codigo) {
		return transacao.get(codigo);
	}

}
