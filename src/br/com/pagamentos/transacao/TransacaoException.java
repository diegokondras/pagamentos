package br.com.pagamentos.transacao;

public class TransacaoException extends Exception {
	public TransacaoException(String mensagem) {
		super(mensagem);
	}
}