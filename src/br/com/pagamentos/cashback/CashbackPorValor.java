package br.com.pagamentos.cashback;

import br.com.pagamentos.transacao.Transacao;

public class CashbackPorValor implements Cashback {
	private Cashback proximo;
	
	@Override
	public double calcular(Transacao transcao) {
		if(transcao.getValor()> 600.0) {
            return transcao.getValor() * 0.10;
        } else {
            return proximo.calcular(transcao);
       }
	}

	@Override
	public void setProximo(Cashback proximo) {
		this.proximo = proximo;
	}

}
