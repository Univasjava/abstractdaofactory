package br.edu.univas.si6.es4.abstractfactory;

public class Runner {

	public static void main(String[] args) {
		// Buscar a fabrica correta:
		AbstractDAOFactory factory = AbstractDAOFactory.getfFactory(AbstractDAOFactory.TIPO_RDB);
	
		// Fabricar o Produto DAO:
		ProdutoDAO produtoDAO = factory.createProdutoDAO();
		
		// Fabricar o Cliente DAO:
		ClienteDAO clienteDAO = factory.createClienteDAO();
		
		// Inserindo um novo produto:
		Produto produto = new Produto("Macarrão");
		produtoDAO.insert(produto);
		
		// Inserindo um novo cliente:
		Cliente cliente = new Cliente("Alfredo");
		produtoDAO.insert(produto);


		// Listando produtos:
		Produto[] produtos = produtoDAO.list();
		
		// Listando cliente:
		Cliente[] clientes = clienteDAO.list();
	}
	
	

}
