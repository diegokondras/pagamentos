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
			throw new TransacaoException("C�digo da transa��o inv�lido. Transa��o n�o autorizada.");
		getDAO().addTransacao(codigo);
		
	}
	
	public Transacao getTransacao(String codigo) throws TransacaoException {
		if (codigo.isEmpty())
			throw new TransacaoException("C�digo da transa��o inv�lido");
		Transacao transacao = getDAO().getTransacao(codigo);
		if (transacao == null)
			throw new TransacaoException("C�digo da transa��o inv�lido");
		return transacao;
	}
	
}
