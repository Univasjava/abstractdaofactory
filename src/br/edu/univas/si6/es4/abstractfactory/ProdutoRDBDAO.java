package br.edu.univas.si6.es4.abstractfactory;

public class ProdutoRDBDAO implements ProdutoDAO {

	@Override
	public void insert(Produto produto) {
		System.out.println("Inserindo produto no banco de dados relacional...");
		System.out.println(produto);
	}

	@Override
	public Produto[] list() {
		System.out.println("Buscando produtos na base de dados relacional...");
		return new Produto[0];	
	}

}
