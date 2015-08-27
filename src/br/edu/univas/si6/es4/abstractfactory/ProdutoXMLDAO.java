package br.edu.univas.si6.es4.abstractfactory;

public class ProdutoXMLDAO implements ProdutoDAO {

	@Override
	public void insert(Produto produto) {
		System.out.println("Inserindo produto no arquivo xml...");
		System.out.println(produto);
	}

	@Override
	public Produto[] list() {
		System.out.println("Buscando produto no arquivo xml...");
		return new Produto[0];
	}
	
}
