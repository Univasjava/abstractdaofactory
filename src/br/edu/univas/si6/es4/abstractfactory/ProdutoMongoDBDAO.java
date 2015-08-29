package br.edu.univas.si6.es4.abstractfactory;

public class ProdutoMongoDBDAO implements ProdutoDAO {

	@Override
	public void insert(Produto produto) {
		System.out.println("Inserindo produto no MongoDB...");
		System.out.println(produto);
	}

	@Override
	public Produto[] list() {
		System.out.println("Buscando produto no MongoDB...");
		return new Produto[0];
	}
	
}
