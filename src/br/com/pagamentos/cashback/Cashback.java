package br.com.pagamentos.cashback;

import br.com.pagamentos.transacao.Transacao;

public interface Cashback {
	
	public double calcular(Transacao transcao);
	 
    public void setProximo(Cashback proximo);

}
