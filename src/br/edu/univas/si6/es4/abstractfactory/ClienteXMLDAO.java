package br.edu.univas.si6.es4.abstractfactory;

public class ClienteXMLDAO implements ClienteDAO {

	@Override
	public void insert(Cliente cliente) {
		System.out.println("Inserindo cliente no arquivo xml...");
		System.out.println(cliente);
		
	}

	@Override
	public Cliente[] list() {
		System.out.println("Buscando cliente no arquivo xml...");
		return new Cliente[0];
	}
	
	

}
