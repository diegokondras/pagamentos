package br.com.pagamentos.transacao;

public interface TransacaoDAOInterface {
	
	public void addTransacao(String codigo) throws TransacaoException;

	public Transacao getTransacao(String codigo) throws TransacaoException;

}
