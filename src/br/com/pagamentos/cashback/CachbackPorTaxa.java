package br.com.pagamentos.cashback;

import br.com.pagamentos.transacao.Transacao;

public class CachbackPorTaxa implements Cashback {
	private Cashback proximo;
	
	@Override
	public double calcular(Transacao transcao) {
		if(transcao.getTaxa() > 25.0) {
            return transcao.getTaxa() * 0.05;
        } else {
            return proximo.calcular(transcao);
       }
	}

	@Override
	public void setProximo(Cashback proximo) {
		this.proximo = proximo;
	}

}
