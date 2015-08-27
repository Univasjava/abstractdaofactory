package br.edu.univas.si6.es4.abstractfactory;

public interface ProdutoDAO {

	public void insert (Produto produto);
	
	public Produto[] list();
	
}
