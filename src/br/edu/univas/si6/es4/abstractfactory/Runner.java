package br.edu.univas.si6.es4.abstractfactory;

public class Runner {

	public static void main(String[] args) {
		// Buscar a fabrica correta:
		AbstractDAOFactory factory = AbstractDAOFactory.getFactory();
	
		// Fabricar o Produto DAO:
		ProdutoDAO produtoDAO = factory.createProdutoDAO();
		
		// Fabricar o Cliente DAO:
		ClienteDAO clienteDAO = factory.createClienteDAO();
		
		// Fabricar o Pedido DAO:
		PedidoDAO pedidoDAO = factory.createPedidoDAO();
		
		// Inserindo um novo produto:
		Produto produto = new Produto("Macarrão");
		produtoDAO.insert(produto);
		
		// Inserindo um novo cliente:
		Cliente cliente = new Cliente("Alfredo");
		produtoDAO.insert(produto);
		
		// Inserindo um novo pedido:
		Pedido pedido = new Pedido("Pedido 01");
		pedidoDAO.insert(pedido);

		// Listando produtos:
		Produto[] produtos = produtoDAO.list();
		
		// Listando cliente:
		Cliente[] clientes = clienteDAO.list();
		
		// Listando pedidos:
		Pedido[] pedidos = pedidoDAO.list();
	}
	
	

}
