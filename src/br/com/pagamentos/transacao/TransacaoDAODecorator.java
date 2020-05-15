package br.com.pagamentos.transacao;

public class TransacaoDAODecorator implements TransacaoDAOInterface {

	private static TransacaoDAOInterface transacaoDAO;
	
	private TransacaoDAOInterface getDAO() {
		if (transacaoDAO == null)
			transacaoDAO = new TransacaoDAOProxy();
		return transacaoDAO;
	}
	
	public void addTransacao(String codigo) throws TransacaoException {
		if (codigo.isEmpty())
			throw new TransacaoException("Código da transação inválido. Transação não autorizada.");
		getDAO().addTransacao(codigo);
		
	}
	
	public Transacao getTransacao(String codigo) throws TransacaoException {
		if (codigo.isEmpty())
			throw new TransacaoException("Código da transação inválido");
		Transacao transacao = getDAO().getTransacao(codigo);
		if (transacao == null)
			throw new TransacaoException("Código da transação inválido");
		return transacao;
	}
	
}
