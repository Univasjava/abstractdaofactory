package br.edu.univas.si6.es4.abstractfactory;

public class RDBDAOFactory extends AbstractDAOFactory {

	@Override
	public ProdutoDAO createProdutoDAO() {
		return new ProdutoRDBDAO();
	}

	@Override
	public ClienteDAO createClienteDAO() {
		return new ClienteRDBDAO();
	}

	@Override
	public PedidoDAO createPedidoDAO() {
		return new PedidoRDBDAO();
	}	

}
