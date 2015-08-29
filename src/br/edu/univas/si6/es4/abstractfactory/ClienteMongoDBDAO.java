package br.edu.univas.si6.es4.abstractfactory;

public class ClienteMongoDBDAO implements ClienteDAO {

	@Override
	public void insert(Cliente cliente) {
		System.out.println("Inserindo cliente no banco de dados MongoDB...");
		System.out.println(cliente);
	}

	@Override
	public Cliente[] list() {
		System.out.println("Buscando cliente na base de dados MongoDB...");
		return new Cliente[0];	
	}

}
