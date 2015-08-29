package br.edu.univas.si6.es4.abstractfactory;

public class MongoDBDAOFactory extends AbstractDAOFactory {

	@Override
	public ProdutoDAO createProdutoDAO() {
		return new ProdutoMongoDBDAO();
	}

	@Override
	public ClienteDAO createClienteDAO() {
		return new ClienteMongoDBDAO();
	}

	@Override
	public PedidoDAO createPedidoDAO() {
		return new PedidoMongoDBDAO();
	}

	

}